(ns clojure-gameboy.cpu.operations
  "This namespace contains helper functions for the GameBoy opcode functions.")

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                         functions to adjust cycles                         ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn add-cycles
  "Adds `n` to :cycles in `gb`."
  [gb n]
  (update gb :cycles (partial + n)))

(defn sub-cycles
  "Subtracts `n` to :cycles in `gb`."
  [gb n]
  (update gb :cycles (partial - n)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;         functions to change flags in f register [Z N H C 0 0 0 0]          ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn z-flag
  "Changes z-flag in `gb` to `pred`.
   Flag is set if `pred` is thruthy, otherwise it will be cleared."
  [gb pred]
  (if pred
    (update gb :AF (fn [[A F]] [A (bit-set F 7)]))
    (update gb :AF (fn [[A F]] [A (bit-clear F 7)]))))

(defn n-flag
  "Changes n-flag in `gb` to `pred`.
   Flag is set if `pred` is thruthy, otherwise it will be cleared."
  [gb pred]
  (if pred
    (update gb :AF (fn [[A F]] [A (bit-set F 6)]))
    (update gb :AF (fn [[A F]] [A (bit-clear F 6)]))))

(defn h-flag
  "Changes h-flag in `gb` to `pred`.
   Flag is set if `pred` is thruthy, otherwise it will be cleared."
  [gb pred]
  (if pred
    (update gb :AF (fn [[A F]] [A (bit-set F 5)]))
    (update gb :AF (fn [[A F]] [A (bit-clear F 5)]))))

(defn c-flag
  "Changes c-flag in `gb` to `pred`.
   Flag is set if `pred` is thruthy, otherwise it will be cleared."
  [gb pred]
  (if pred
    (update gb :AF (fn [[A F]] [A (bit-set F 4)]))
    (update gb :AF (fn [[A F]] [A (bit-clear F 4)]))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;    bit-test functions for every register and the byte pointed to by HL     ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn bit-test-B
  "Tests if bit `bit` is set in register B in `gb`.
   If it is set the z-flag will be set, otherwise it will be cleared.
   The n-flag is cleared and the h-flag is set."
  [gb bit]
  (let [[B _] (:BC gb)
        pred (bit-test B bit)]
    (-> gb
        (z-flag pred)
        (n-flag false)
        (h-flag true))))

(defn bit-test-C
  "Tests if bit `bit` is set in register C in `gb`.
   If it is set the z-flag will be set, otherwise it will be cleared.
   The n-flag is cleared and the h-flag is set."
  [gb bit]
  (let [[_ C] (:BC gb)
        pred (bit-test C bit)]
    (-> gb
        (z-flag pred)
        (n-flag false)
        (h-flag true))))

(defn bit-test-D
  "Tests if bit `bit` is set in register D in `gb`.
   If it is set the z-flag will be set, otherwise it will be cleared.
   The n-flag is cleared and the h-flag is set."
  [gb bit]
  (let [[D _] (:DE gb)
        pred (bit-test D bit)]
    (-> gb
        (z-flag pred)
        (n-flag false)
        (h-flag true))))

(defn bit-test-E
  "Tests if bit `bit` is set in register E in `gb`.
   If it is set the z-flag will be set, otherwise it will be cleared.
   The n-flag is cleared and the h-flag is set."
  [gb bit]
  (let [[_ E] (:DE gb)
        pred (bit-test E bit)]
    (-> gb
        (z-flag pred)
        (n-flag false)
        (h-flag true))))

(defn bit-test-H
  "Tests if bit `bit` is set in register H in `gb`.
   If it is set the z-flag will be set, otherwise it will be cleared.
   The n-flag is cleared and the h-flag is set."
  [gb bit]
  (let [[H _] (:HL gb)
        pred (bit-test H bit)]
    (-> gb
        (z-flag pred)
        (n-flag false)
        (h-flag true))))

(defn bit-test-L
  "Tests if bit `bit` is set in register L in `gb`.
   If it is set the z-flag will be set, otherwise it will be cleared.
   The n-flag is cleared and the h-flag is set."
  [gb bit]
  (let [[_ L] (:HL gb)
        pred (bit-test L bit)]
    (-> gb
        (z-flag pred)
        (n-flag false)
        (h-flag true))))

(defn bit-test-at-HL
  "Tests if bit `bit` is set in byte pointed to by HL in `gb`.
   If it is set the z-flag will be set, otherwise it will be cleared.
   The n-flag is cleared and the h-flag is set."
  [gb bit]
  (println "FIX ME"))

(defn bit-test-A
  "Tests if bit `bit` is set in register A in `gb`.
   If it is set the z-flag will be set, otherwise it will be cleared.
   The n-flag is cleared and the h-flag is set."
  [gb bit]
  (let [[A _] (:AF gb)
        pred (bit-test A bit)]
    (-> gb
        (z-flag pred)
        (n-flag false)
        (h-flag true))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;    bit-clear functions for every register and the byte pointed to by HL    ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn bit-clear-B
  "Bit `bit` in register B in `gb` is cleared."
  [gb bit]
  (update gb :BC (fn [[B C]] [(bit-clear B bit) C])))

(defn bit-clear-C
  "Bit `bit` in register C in `gb` is cleared."
  [gb bit]
  (update gb :BC (fn [[B C]] [B (bit-clear C bit)])))

(defn bit-clear-D
  "Bit `bit` in register D in `gb` is cleared."
  [gb bit]
  (update gb :DE (fn [[D E]] [(bit-clear D bit) E])))

(defn bit-clear-E
  "Bit `bit` in register E in `gb` is cleared."
  [gb bit]
  (update gb :DE (fn [[D E]] [D (bit-clear E bit)])))

(defn bit-clear-H
  "Bit `bit` in register H in `gb` is cleared."
  [gb bit]
  (update gb :HL (fn [[H L]] [(bit-clear H bit) L])))

(defn bit-clear-L
  "Bit `bit` in register L in `gb` is cleared."
  [gb bit]
  (update gb :HL (fn [[H L]] [H (bit-clear L bit)])))

(defn bit-clear-at-HL
  "Bit `bit` in byte pointed to by HL in `gb` is cleared."
  [gb bit]
  (println "FIX ME"))

(defn bit-clear-A
  "Bit `bit` in register A in `gb` is cleared."
  [gb bit]
  (update gb :AF (fn [[A F]] [(bit-clear A bit) F])))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;     bit-set functions for every register and the byte pointed to by HL     ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn bit-set-B
  "Bit `bit` in register B in `gb` is set."
  [gb bit]
  (update gb :BC (fn [[B C]] [(bit-set B bit) C])))

(defn bit-set-C
  "Bit `bit` in register C in `gb` is set."
  [gb bit]
  (update gb :BC (fn [[B C]] [B (bit-set C bit)])))

(defn bit-set-D
  "Bit `bit` in register D in `gb` is set."
  [gb bit]
  (update gb :DE (fn [[D E]] [(bit-set D bit) E])))

(defn bit-set-E
  "Bit `bit` in register E in `gb` is set."
  [gb bit]
  (update gb :DE (fn [[D E]] [D (bit-set E bit)])))

(defn bit-set-H
  "Bit `bit` in register H in `gb` is set."
  [gb bit]
  (update gb :HL (fn [[H L]] [(bit-set H bit) L])))

(defn bit-set-L
  "Bit `bit` in register L in `gb` is set."
  [gb bit]
  (update gb :HL (fn [[H L]] [H (bit-set L bit)])))

(defn bit-set-at-HL
  "Bit `bit` in byte pointed to by HL in `gb` is cleared."
  [gb bit]
  (println "FIX ME"))

(defn bit-set-A
  "Bit `bit` in register A in `gb` is set."
  [gb bit]
  (update gb :AF (fn [[A F]] [(bit-set A bit) F])))
