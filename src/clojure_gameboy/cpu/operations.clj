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
    (update gb :F (fn [x] (bit-set x 7)))
    (update gb :F (fn [x] (bit-clear x 7)))))

(defn n-flag
  "Changes N-flag in `gb` to `pred`.
   Flag is set if `pred` is thruthy, otherwise it will be cleared."
  [gb pred]
  (if pred
    (update gb :F (fn [x] (bit-set x 6)))
    (update gb :F (fn [x] (bit-clear x 6)))))

(defn h-flag
  "Changes H-flag in `gb` to `pred`.
   Flag is set if `pred` is thruthy, otherwise it will be cleared."
  [gb pred]
  (if pred
    (update gb :F (fn [x] (bit-set x 5)))
    (update gb :F (fn [x] (bit-clear x 5)))))

(defn c-flag
  "Changes C-flag in `gb` to `pred`.
   Flag is set if `pred` is thruthy, otherwise it will be cleared."
  [gb pred]
  (if pred
    (update gb :F (fn [x] (bit-set x 4)))
    (update gb :F (fn [x] (bit-clear x 4)))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;          functions to get flags from f register [Z N H C 0 0 0 0]          ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn z-flag?
  "True if Z-flag is set in `gb`, otherwise false"
  [gb]
  (bit-test (:F gb) 7))

(defn n-flag?
  "True if N-flag is set in `gb`, otherwise false"
  [gb]
  (bit-test (:F gb) 6))

(defn h-flag?
  "True if H-flag is set in `gb`, otherwise false"
  [gb]
  (bit-test (:F gb) 5))

(defn c-flag?
  "True if C-flag is set in `gb`, otherwise false"
  [gb]
  (bit-test (:F gb) 4))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                               rlc functions                                ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn rlc-reg
  "Rotate register `reg` left in `gb`.
   Z-flag is set if the result is zero.
   N- and H-flag are cleared.
   C-flag contains old bit 7 data."
  [gb reg]
  (let [x (get gb reg)
        new-x (bit-or (bit-shift-left (bit-and 0x7f x) 1)
                      (unsigned-bit-shift-right x 7))]
    (-> gb
        (assoc reg new-x)
        (z-flag (zero? new-x))
        (n-flag false)
        (h-flag false)
        (c-flag (bit-test x 7)))))

(defn rlc-at
  "Rotate byte at address `adr` left in `gb`.
   Z-flag is set if the result is zero.
   N- and H-flag are cleared.
   C-flag contains old bit 7 data."
  [gb adr]
  (println "FIX ME"))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                               rrc functions                                ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn rrc-reg
  "Rotate register `reg` right in `gb`.
   Z-flag is set if the result is zero.
   N- and H-flag are cleared.
   C-flag contains old bit 0 data."
  [gb reg]
  (let [x (get gb reg)
        new-x (bit-or (bit-shift-left (bit-and 0x01 x) 7)
                      (unsigned-bit-shift-right x 1))]
    (-> gb
        (assoc reg new-x)
        (z-flag (zero? new-x))
        (n-flag false)
        (h-flag false)
        (c-flag (bit-test x 0)))))

(defn rrc-at
  "Rotate byte at address `adr` right in `gb`.
   Z-flag is set if the result is zero.
   N- and H-flag are cleared.
   C-flag contains old bit 0 data."
  [gb adr]
  (println "FIX ME"))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                rl functions                                ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn rl-reg
  "Rotate register `reg` left through carry flag in `gb`.
   Z-flag is set if the result is zero.
   N- and H-flag are cleared.
   C-flag contains old bit 7 data."
  [gb reg]
  (let [x (get gb reg)
        new-x (bit-or (bit-shift-left (bit-and 0x7f x) 1)
                      (if (c-flag? gb) 0x01 0x00))]
    (-> gb
        (assoc reg new-x)
        (z-flag (zero? new-x))
        (n-flag false)
        (h-flag false)
        (c-flag (bit-test x 7)))))

(defn rl-at
  "Rotate byte at address `adr` left through carry flag in `gb`.
   Z-flag is set if the result is zero.
   N- and H-flag are cleared.
   C-flag contains old bit 7 data."
  [gb adr]
  (println "FIX ME"))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                rr functions                                ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn rr-reg
  "Rotate register `reg` right through carry flag in `gb`.
   Z-flag is set if the result is zero.
   N- and H-flag are cleared.
   C-flag contains old bit 0 data."
  [gb reg]
  (let [x (get gb reg)
        new-x (bit-or (if (c-flag? gb) 0x80 0x00)
                      (unsigned-bit-shift-right x 1))]
    (-> gb
        (assoc reg new-x)
        (z-flag (zero? new-x))
        (n-flag false)
        (h-flag false)
        (c-flag (bit-test x 0)))))

(defn rr-at
  "Rotate byte at address `adr` right through carry flag in `gb`.
   Z-flag is set if the result is zero.
   N- and H-flag are cleared.
   C-flag contains old bit 0 data."
  [gb adr]
  (println "FIX ME"))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                               sla functions                                ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn sla-reg
  "Shift register `reg` left into carry flag in `gb`.
   LSB is set to 0.
   Z-flag is set if the result is zero.
   N- and H-flag are cleared.
   C-flag contains old bit 7 data."
  [gb reg]
  (let [x (get gb reg)
        new-x (bit-shift-left (bit-and 0x7f x) 1)]
    (-> gb
        (assoc reg new-x)
        (z-flag (zero? new-x))
        (n-flag false)
        (h-flag false)
        (c-flag (bit-test x 7)))))

(defn sla-at
  "Shift byte at address `adr` left into carry flag in `gb`.
   LSB is set to 0.
   Z-flag is set if the result is zero.
   N- and H-flag are cleared.
   C-flag contains old bit 7 data."
  [gb adr]
  (println "FIX ME"))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                               sra functions                                ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn sra-reg
  "Shift register `reg` right into carry flag in `gb`.
   MSB does not change.
   Z-flag is set if the result is zero.
   N- and H-flag are cleared.
   C-flag contains old bit 0 data."
  [gb reg]
  (let [x (get gb reg)
        new-x (bit-or (bit-and 0x80 x)
                      (unsigned-bit-shift-right x 1))]
    (-> gb
        (assoc reg new-x)
        (z-flag (zero? new-x))
        (n-flag false)
        (h-flag false)
        (c-flag (bit-test x 0)))))

(defn sra-at
  "Shift byte at address `adr` right into carry flag in `gb`.
   MSB does not change.
   Z-flag is set if the result is zero.
   N- and H-flag are cleared.
   C-flag contains old bit 0 data."
  [gb adr]
  (println "FIX ME"))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                               swap functions                               ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn swap-reg
  "Swap upper and lower nibbles of register `reg` in `gb`.
   Z-flag is set if the result is zero.
   N-, H- and C-flag are cleared."
  [gb reg]
  (let [x (get gb reg)
        new-x (bit-or (bit-shift-left (bit-and x 0x0f) 4)
                      (unsigned-bit-shift-right x 4))]
    (-> gb
        (assoc reg new-x)
        (z-flag (zero? new-x))
        (n-flag false)
        (h-flag false)
        (c-flag false))))

(defn swap-at
  "Swap upper and lower nibbles of byte at address `adr` in `gb`.
   Z-flag is set if the result is zero.
   N-, H- and C-flag are cleared."
  [gb adr]
  (println "FIX ME"))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                               srl functions                                ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn srl-reg
  "Shift register `reg` right into carry flag in `gb`.
   MSB ist set to 0.
   Z-flag is set if the result is zero.
   N- and H-flag are cleared.
   C-flag contains old bit 0 data."
  [gb reg]
  (let [x (get gb reg)
        new-x (unsigned-bit-shift-right (bit-and 0xfe x) 1)]
    (-> gb
        (assoc reg new-x)
        (z-flag (zero? new-x))
        (n-flag false)
        (h-flag false)
        (c-flag (bit-test x 0)))))

(defn srl-at
  "Shift byte at address `adr` right into carry flag in `gb`.
   MSB is set to 0.
   Z-flag is set if the result is zero.
   N- and H-flag are cleared.
   C-flag contains old bit 0 data."
  [gb adr]
  (println "FIX ME"))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                             bit-test functions                             ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn bit-test-reg
  "Tests if bit `bit` is set in register `reg` in `gb`.
   If it is set the Z-flag will be set, otherwise it will be cleared.
   The N-flag is cleared and the H-flag is set."
  [gb reg bit]
  (let [pred (bit-test (get gb reg) bit)]
    (-> gb
        (z-flag pred)
        (n-flag false)
        (h-flag true))))

(defn bit-test-at
  "Tests if bit `bit` is set in byte at address `adr` in `gb`.
   If it is set the Z-flag will be set, otherwise it will be cleared.
   The N-flag is cleared and the H-flag is set."
  [gb adr bit]
  (println "FIX ME"))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                            bit-clear functions                             ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn bit-clear-reg
  "Bit `bit` in register `reg` in `gb` is cleared."
  [gb reg bit]
  (update gb reg (fn [x] (bit-clear x bit))))

(defn bit-clear-at
  "Bit `bit` in byte at address `adr` in `gb` is cleared."
  [gb adr bit]
  (println "FIX ME"))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                             bit-set functions                              ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn bit-set-reg
  "Bit `bit` in register `reg` in `gb` is set."
  [gb reg bit]
  (update gb reg (fn [x] (bit-set x bit))))

(defn bit-set-at
  "Bit `bit` in byte at address `adr` in `gb` is cleared."
  [gb adr bit]
  (println "FIX ME"))
