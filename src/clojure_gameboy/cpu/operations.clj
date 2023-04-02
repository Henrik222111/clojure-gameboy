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
  "Changes Z-flag in `gb` to `pred`.
   Flag is set if `pred` is thruthy, otherwise it will be cleared."
  [gb pred]
  (if pred
    (update gb :AF (fn [[A F]] [A (bit-set F 7)]))
    (update gb :AF (fn [[A F]] [A (bit-clear F 7)]))))

(defn n-flag
  "Changes N-flag in `gb` to `pred`.
   Flag is set if `pred` is thruthy, otherwise it will be cleared."
  [gb pred]
  (if pred
    (update gb :AF (fn [[A F]] [A (bit-set F 6)]))
    (update gb :AF (fn [[A F]] [A (bit-clear F 6)]))))

(defn h-flag
  "Changes H-flag in `gb` to `pred`.
   Flag is set if `pred` is thruthy, otherwise it will be cleared."
  [gb pred]
  (if pred
    (update gb :AF (fn [[A F]] [A (bit-set F 5)]))
    (update gb :AF (fn [[A F]] [A (bit-clear F 5)]))))

(defn c-flag
  "Changes C-flag in `gb` to `pred`.
   Flag is set if `pred` is thruthy, otherwise it will be cleared."
  [gb pred]
  (if pred
    (update gb :AF (fn [[A F]] [A (bit-set F 4)]))
    (update gb :AF (fn [[A F]] [A (bit-clear F 4)]))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;          functions to get flags from f register [Z N H C 0 0 0 0]          ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn z-flag?
  "True if Z-flag is set in `gb`, otherwise false"
  [gb]
  (let [[A _] (:AF gb)]
    (if-not (= 0 (bit-and 0x80 A)) true false)))

(defn n-flag?
  "True if N-flag is set in `gb`, otherwise false"
  [gb]
  (let [[A _] (:AF gb)]
    (if-not (= 0 (bit-and 0x40 A)) true false)))

(defn h-flag?
  "True if H-flag is set in `gb`, otherwise false"
  [gb]
  (let [[A _] (:AF gb)]
    (if-not (= 0 (bit-and 0x20 A)) true false)))

(defn c-flag?
  "True if C-flag is set in `gb`, otherwise false"
  [gb]
  (let [[A _] (:AF gb)]
    (if-not (= 0 (bit-and 0x10 A)) true false)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;       rlc functions for every register and the byte pointed to by HL       ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn rlc-B
  "Rotate B left in `gb`.
   Z-flag is set if the result is zero.
   N- and H-flag are cleared.
   C-flag contains old bit 7 data."
  [gb]
  (let [[B C] (:BC gb)
        newB (bit-or (bit-shift-left (bit-and 0x7f B) 1)
                     (unsigned-bit-shift-right B 7))]
    (-> gb
        (assoc :BC [newB C])
        (z-flag (zero? newB))
        (n-flag false)
        (h-flag false)
        (c-flag (bit-test newB 0)))))

(defn rlc-C
  "Rotate C left in `gb`.
   Z-flag is set if the result is zero.
   N- and H-flag are cleared.
   C-flag contains old bit 7 data."
  [gb]
  (let [[B C] (:BC gb)
        newC (bit-or (bit-shift-left (bit-and 0x7f C) 1)
                     (unsigned-bit-shift-right C 7))]
    (-> gb
        (assoc :BC [B newC])
        (z-flag (zero? newC))
        (n-flag false)
        (h-flag false)
        (c-flag (bit-test newC 0)))))

(defn rlc-D
  "Rotate D left in `gb`.
   Z-flag is set if the result is zero.
   N- and H-flag are cleared.
   C-flag contains old bit 7 data."
  [gb]
  (let [[D E] (:DE gb)
        newD (bit-or (bit-shift-left (bit-and 0x7f D) 1)
                     (unsigned-bit-shift-right D 7))]
    (-> gb
        (assoc :DE [newD E])
        (z-flag (zero? newD))
        (n-flag false)
        (h-flag false)
        (c-flag (bit-test newD 0)))))

(defn rlc-E
  "Rotate E left in `gb`.
   Z-flag is set if the result is zero.
   N- and H-flag are cleared.
   C-flag contains old bit 7 data."
  [gb]
  (let [[D E] (:DE gb)
        newE (bit-or (bit-shift-left (bit-and 0x7f E) 1)
                     (unsigned-bit-shift-right E 7))]
    (-> gb
        (assoc :DE [D newE])
        (z-flag (zero? newE))
        (n-flag false)
        (h-flag false)
        (c-flag (bit-test newE 0)))))

(defn rlc-H
  "Rotate H left in `gb`.
   Z-flag is set if the result is zero.
   N- and H-flag are cleared.
   C-flag contains old bit 7 data."
  [gb]
  (let [[H L] (:HL gb)
        newH (bit-or (bit-shift-left (bit-and 0x7f H) 1)
                     (unsigned-bit-shift-right H 7))]
    (-> gb
        (assoc :HL [newH L])
        (z-flag (zero? newH))
        (n-flag false)
        (h-flag false)
        (c-flag (bit-test newH 0)))))

(defn rlc-L
  "Rotate L left in `gb`.
   Z-flag is set if the result is zero.
   N- and H-flag are cleared.
   C-flag contains old bit 7 data."
  [gb]
  (let [[H L] (:HL gb)
        newL (bit-or (bit-shift-left (bit-and 0x7f L) 1)
                     (unsigned-bit-shift-right L 7))]
    (-> gb
        (assoc :HL [H newL])
        (z-flag (zero? newL))
        (n-flag false)
        (h-flag false)
        (c-flag (bit-test newL 0)))))

(defn rlc-at-HL
  "Rotate byte pointed to by HL left in `gb`.
   Z-flag is set if the result is zero.
   N- and H-flag are cleared.
   C-flag contains old bit 7 data."
  [gb]
  (println "FIX ME"))

(defn rlc-A
  "Rotate A left in `gb`.
   Z-flag is set if the result is zero.
   N- and H-flag are cleared.
   C-flag contains old bit 7 data."
  [gb]
  (let [[A F] (:AF gb)
        newA (bit-or (bit-shift-left (bit-and 0x7f A) 1)
                     (unsigned-bit-shift-right A 7))]
    (-> gb
        (assoc :AF [newA F])
        (z-flag (zero? newA))
        (n-flag false)
        (h-flag false)
        (c-flag (bit-test newA 0)))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;      swap functions for every register and the byte pointed to by HL       ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn swap-B
  "Swap upper and lower nibbles of B in `gb`.
   Z-flag is set if the result is zero.
   N-, H- and C-flag are cleared."
  [gb]
  (let [[B C] (:BC gb)
        newB (bit-or (bit-shift-left (bit-and B 0x0f) 4)
                     (unsigned-bit-shift-right B 4))]
    (-> gb
        (assoc :BC [newB C])
        (z-flag (zero? newB))
        (n-flag false)
        (h-flag false)
        (c-flag false))))

(defn swap-C
  "Swap upper and lower nibbles of C in `gb`.
   Z-flag is set if the result is zero.
   N-, H- and C-flag are cleared."
  [gb]
  (let [[B C] (:BC gb)
        newC (bit-or (bit-shift-left (bit-and C 0x0f) 4)
                     (unsigned-bit-shift-right C 4))]
    (-> gb
        (assoc :BC [B newC])
        (z-flag (zero? newC))
        (n-flag false)
        (h-flag false)
        (c-flag false))))

(defn swap-D
  "Swap upper and lower nibbles of D in `gb`.
   Z-flag is set if the result is zero.
   N-, H- and C-flag are cleared."
  [gb]
  (let [[D E] (:DE gb)
        newD (bit-or (bit-shift-left (bit-and D 0x0f) 4)
                     (unsigned-bit-shift-right D 4))]
    (-> gb
        (assoc :BC [newD E])
        (z-flag (zero? newD))
        (n-flag false)
        (h-flag false)
        (c-flag false))))

(defn swap-E
  "Swap upper and lower nibbles of E in `gb`.
   Z-flag is set if the result is zero.
   N-, H- and C-flag are cleared."
  [gb]
  (let [[D E] (:DE gb)
        newE (bit-or (bit-shift-left (bit-and E 0x0f) 4)
                     (unsigned-bit-shift-right E 4))]
    (-> gb
        (assoc :BC [D newE])
        (z-flag (zero? newE))
        (n-flag false)
        (h-flag false)
        (c-flag false))))

(defn swap-H
  "Swap upper and lower nibbles of H in `gb`.
   Z-flag is set if the result is zero.
   N-, H- and C-flag are cleared."
  [gb]
  (let [[H L] (:HL gb)
        newH (bit-or (bit-shift-left (bit-and H 0x0f) 4)
                     (unsigned-bit-shift-right H 4))]
    (-> gb
        (assoc :BC [newH L])
        (z-flag (zero? newH))
        (n-flag false)
        (h-flag false)
        (c-flag false))))

(defn swap-L
  "Swap upper and lower nibbles of L in `gb`.
   Z-flag is set if the result is zero.
   N-, H- and C-flag are cleared."
  [gb]
  (let [[H L] (:HL gb)
        newL (bit-or (bit-shift-left (bit-and L 0x0f) 4)
                     (unsigned-bit-shift-right L 4))]
    (-> gb
        (assoc :BC [H newL])
        (z-flag (zero? newL))
        (n-flag false)
        (h-flag false)
        (c-flag false))))

(defn swap-at-HL
  "Swap upper and lower nibbles of byte pointed to by HL in `gb`.
   Z-flag is set if the result is zero.
   N-, H- and C-flag are cleared."
  [gb]
  (println "FIX ME"))

(defn swap-A
  "Swap upper and lower nibbles of A in `gb`.
   Z-flag is set if the result is zero.
   N-, H- and C-flag are cleared."
  [gb]
  (let [[A F] (:AF gb)
        newA (bit-or (bit-shift-left (bit-and A 0x0f) 4)
                     (unsigned-bit-shift-right A 4))]
    (-> gb
        (assoc :BC [newA F])
        (z-flag (zero? newA))
        (n-flag false)
        (h-flag false)
        (c-flag false))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;    bit-test functions for every register and the byte pointed to by HL     ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(type (+' (byte 126) (byte 1)))
(defn bit-test-B
  "Tests if bit `bit` is set in register B in `gb`.
   If it is set the Z-flag will be set, otherwise it will be cleared.
   The N-flag is cleared and the H-flag is set."
  [gb bit]
  (let [[B _] (:BC gb)
        pred (bit-test B bit)]
    (-> gb
        (z-flag pred)
        (n-flag false)
        (h-flag true))))

(defn bit-test-C
  "Tests if bit `bit` is set in register C in `gb`.
   If it is set the Z-flag will be set, otherwise it will be cleared.
   The N-flag is cleared and the H-flag is set."
  [gb bit]
  (let [[_ C] (:BC gb)
        pred (bit-test C bit)]
    (-> gb
        (z-flag pred)
        (n-flag false)
        (h-flag true))))

(defn bit-test-D
  "Tests if bit `bit` is set in register D in `gb`.
   If it is set the Z-flag will be set, otherwise it will be cleared.
   The N-flag is cleared and the H-flag is set."
  [gb bit]
  (let [[D _] (:DE gb)
        pred (bit-test D bit)]
    (-> gb
        (z-flag pred)
        (n-flag false)
        (h-flag true))))

(defn bit-test-E
  "Tests if bit `bit` is set in register E in `gb`.
   If it is set the Z-flag will be set, otherwise it will be cleared.
   The N-flag is cleared and the H-flag is set."
  [gb bit]
  (let [[_ E] (:DE gb)
        pred (bit-test E bit)]
    (-> gb
        (z-flag pred)
        (n-flag false)
        (h-flag true))))

(defn bit-test-H
  "Tests if bit `bit` is set in register H in `gb`.
   If it is set the Z-flag will be set, otherwise it will be cleared.
   The N-flag is cleared and the H-flag is set."
  [gb bit]
  (let [[H _] (:HL gb)
        pred (bit-test H bit)]
    (-> gb
        (z-flag pred)
        (n-flag false)
        (h-flag true))))

(defn bit-test-L
  "Tests if bit `bit` is set in register L in `gb`.
   If it is set the Z-flag will be set, otherwise it will be cleared.
   The N-flag is cleared and the H-flag is set."
  [gb bit]
  (let [[_ L] (:HL gb)
        pred (bit-test L bit)]
    (-> gb
        (z-flag pred)
        (n-flag false)
        (h-flag true))))

(defn bit-test-at-HL
  "Tests if bit `bit` is set in byte pointed to by HL in `gb`.
   If it is set the Z-flag will be set, otherwise it will be cleared.
   The N-flag is cleared and the H-flag is set."
  [gb bit]
  (println "FIX ME"))

(defn bit-test-A
  "Tests if bit `bit` is set in register A in `gb`.
   If it is set the Z-flag will be set, otherwise it will be cleared.
   The N-flag is cleared and the H-flag is set."
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
