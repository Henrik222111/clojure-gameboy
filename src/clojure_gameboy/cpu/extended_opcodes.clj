(ns clojure-gameboy.cpu.extended-opcodes
  "This namespace contains all the extended opcode functions for the prefix-cb
   instruction and a function to execute them."
  (:require [clojure-gameboy.cpu.operations :as operations]))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                rotate left                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_00
  "RLC B"
  [gb]
  (-> gb
      (operations/rlc-reg :B)
      (operations/add-cycles 8)))

(defn opcode_01
  "RLC C"
  [gb]
  (-> gb
      (operations/rlc-reg :C)
      (operations/add-cycles 8)))

(defn opcode_02
  "RLC D"
  [gb]
  (-> gb
      (operations/rlc-reg :D)
      (operations/add-cycles 8)))

(defn opcode_03
  "RLC E"
  [gb]
  (-> gb
      (operations/rlc-reg :E)
      (operations/add-cycles 8)))

(defn opcode_04
  "RLC H"
  [gb]
  (-> gb
      (operations/rlc-reg :H)
      (operations/add-cycles 8)))

(defn opcode_05
  "RLC L"
  [gb]
  (-> gb
      (operations/rlc-reg :L)
      (operations/add-cycles 8)))

(defn opcode_06
  "RLC (HL)"
  [gb]
  (-> gb
      (operations/rlc-at (:HL gb))
      (operations/add-cycles 16)))

(defn opcode_07
  "RLC A"
  [gb]
  (-> gb
      (operations/rlc-reg :A)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                rotate right                                ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_08
  "RRC B"
  [gb]
  (-> gb
      (operations/rrc-reg :B)
      (operations/add-cycles 8)))

(defn opcode_09
  "RRC C"
  [gb]
  (-> gb
      (operations/rrc-reg :C)
      (operations/add-cycles 8)))

(defn opcode_0a
  "RRC D"
  [gb]
  (-> gb
      (operations/rrc-reg :D)
      (operations/add-cycles 8)))

(defn opcode_0b
  "RRC E"
  [gb]
  (-> gb
      (operations/rrc-reg :E)
      (operations/add-cycles 8)))

(defn opcode_0c
  "RRC H"
  [gb]
  (-> gb
      (operations/rrc-reg :H)
      (operations/add-cycles 8)))

(defn opcode_0d
  "RRC L"
  [gb]
  (-> gb
      (operations/rrc-reg :L)
      (operations/add-cycles 8)))

(defn opcode_0e
  "RRC (HL)"
  [gb]
  (-> gb
      (operations/rrc-at (:HL gb))
      (operations/add-cycles 16)))

(defn opcode_0f
  "RRC A"
  [gb]
  (-> gb
      (operations/rrc-reg :A)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                       rotate left through carry flag                       ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_10
  "RL B"
  [gb]
  (-> gb
      (operations/rl-reg :B)
      (operations/add-cycles 8)))

(defn opcode_11
  "RL C"
  [gb]
  (-> gb
      (operations/rl-reg :C)
      (operations/add-cycles 8)))

(defn opcode_12
  "RL D"
  [gb]
  (-> gb
      (operations/rl-reg :D)
      (operations/add-cycles 8)))

(defn opcode_13
  "RL E"
  [gb]
  (-> gb
      (operations/rl-reg :E)
      (operations/add-cycles 8)))

(defn opcode_14
  "RL H"
  [gb]
  (-> gb
      (operations/rl-reg :H)
      (operations/add-cycles 8)))

(defn opcode_15
  "RL L"
  [gb]
  (-> gb
      (operations/rl-reg :L)
      (operations/add-cycles 8)))

(defn opcode_16
  "RL (HL)"
  [gb]
  (-> gb
      (operations/rl-at (:HL gb))
      (operations/add-cycles 16)))

(defn opcode_17
  "RL A"
  [gb]
  (-> gb
      (operations/rl-reg :A)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                      rotate right through carry flag                       ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_18
  "RR B"
  [gb]
  (-> gb
      (operations/rr-reg :B)
      (operations/add-cycles 8)))

(defn opcode_19
  "RR C"
  [gb]
  (-> gb
      (operations/rr-reg :C)
      (operations/add-cycles 8)))

(defn opcode_1a
  "RR D"
  [gb]
  (-> gb
      (operations/rr-reg :D)
      (operations/add-cycles 8)))

(defn opcode_1b
  "RR E"
  [gb]
  (-> gb
      (operations/rr-reg :E)
      (operations/add-cycles 8)))

(defn opcode_1c
  "RR H"
  [gb]
  (-> gb
      (operations/rr-reg :H)
      (operations/add-cycles 8)))

(defn opcode_1d
  "RR L"
  [gb]
  (-> gb
      (operations/rr-reg :L)
      (operations/add-cycles 8)))

(defn opcode_1e
  "RR (HL)"
  [gb]
  (-> gb
      (operations/rr-at (:HL gb))
      (operations/add-cycles 16)))

(defn opcode_1f
  "RR A"
  [gb]
  (-> gb
      (operations/rr-reg :A)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 shift left                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_20
  "SLA B"
  [gb]
  (-> gb
      (operations/sla-reg :B)
      (operations/add-cycles 8)))

(defn opcode_21
  "SLA C"
  [gb]
  (-> gb
      (operations/sla-reg :C)
      (operations/add-cycles 8)))

(defn opcode_22
  "SLA D"
  [gb]
  (-> gb
      (operations/sla-reg :D)
      (operations/add-cycles 8)))

(defn opcode_23
  "SLA E"
  [gb]
  (-> gb
      (operations/sla-reg :E)
      (operations/add-cycles 8)))

(defn opcode_24
  "SLA H"
  [gb]
  (-> gb
      (operations/sla-reg :H)
      (operations/add-cycles 8)))

(defn opcode_25
  "SLA L"
  [gb]
  (-> gb
      (operations/sla-reg :L)
      (operations/add-cycles 8)))

(defn opcode_26
  "SLA (HL)"
  [gb]
  (-> gb
      (operations/sla-at (:HL gb))
      (operations/add-cycles 16)))

(defn opcode_27
  "SLA A"
  [gb]
  (-> gb
      (operations/sla-reg :A)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                            shift right (signed)                            ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_28
  "SRA B"
  [gb]
  (-> gb
      (operations/sra-reg :B)
      (operations/add-cycles 8)))

(defn opcode_29
  "SRA C"
  [gb]
  (-> gb
      (operations/sra-reg :C)
      (operations/add-cycles 8)))

(defn opcode_2a
  "SRA D"
  [gb]
  (-> gb
      (operations/sra-reg :D)
      (operations/add-cycles 8)))

(defn opcode_2b
  "SRA E"
  [gb]
  (-> gb
      (operations/sra-reg :E)
      (operations/add-cycles 8)))

(defn opcode_2c
  "SRA H"
  [gb]
  (-> gb
      (operations/sra-reg :H)
      (operations/add-cycles 8)))

(defn opcode_2d
  "SRA L"
  [gb]
  (-> gb
      (operations/sra-reg :L)
      (operations/add-cycles 8)))

(defn opcode_2e
  "SRA (HL)"
  [gb]
  (-> gb
      (operations/sra-at (:HL gb))
      (operations/add-cycles 16)))

(defn opcode_2f
  "SRA A"
  [gb]
  (-> gb
      (operations/sra-reg :A)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                        swap upper and lower nibble                         ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_30
  "SWAP B"
  [gb]
  (-> gb
      (operations/swap-reg :B)
      (operations/add-cycles 8)))

(defn opcode_31
  "SWAP C"
  [gb]
  (-> gb
      (operations/swap-reg :C)
      (operations/add-cycles 8)))

(defn opcode_32
  "SWAP D"
  [gb]
  (-> gb
      (operations/swap-reg :D)
      (operations/add-cycles 8)))

(defn opcode_33
  "SWAP E"
  [gb]
  (-> gb
      (operations/swap-reg :E)
      (operations/add-cycles 8)))

(defn opcode_34
  "SWAP H"
  [gb]
  (-> gb
      (operations/swap-reg :H)
      (operations/add-cycles 8)))

(defn opcode_35
  "SWAP L"
  [gb]
  (-> gb
      (operations/swap-reg :L)
      (operations/add-cycles 8)))

(defn opcode_36
  "SWAP (HL)"
  [gb]
  (-> gb
      (operations/swap-at (:HL gb))
      (operations/add-cycles 16)))

(defn opcode_37
  "SWAP A"
  [gb]
  (-> gb
      (operations/swap-reg :A)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                            shift right unsigned                            ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_38
  "SRL B"
  [gb]
  (-> gb
      (operations/srl-reg :B)
      (operations/add-cycles 8)))

(defn opcode_39
  "SRL C"
  [gb]
  (-> gb
      (operations/srl-reg :C)
      (operations/add-cycles 8)))

(defn opcode_3a
  "SRL D"
  [gb]
  (-> gb
      (operations/srl-reg :D)
      (operations/add-cycles 8)))

(defn opcode_3b
  "SRL E"
  [gb]
  (-> gb
      (operations/srl-reg :E)
      (operations/add-cycles 8)))

(defn opcode_3c
  "SRL H"
  [gb]
  (-> gb
      (operations/srl-reg :H)
      (operations/add-cycles 8)))

(defn opcode_3d
  "SRL L"
  [gb]
  (-> gb
      (operations/srl-reg :L)
      (operations/add-cycles 8)))

(defn opcode_3e
  "SRL (HL)"
  [gb]
  (-> gb
      (operations/srl-at (:HL gb))
      (operations/add-cycles 16)))

(defn opcode_3f
  "SRL A"
  [gb]
  (-> gb
      (operations/srl-reg :A)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 test bit 0                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_40
  "BIT 0,B"
  [gb]
  (-> gb
      (operations/bit-test-reg :B 0)
      (operations/add-cycles 8)))

(defn opcode_41
  "BIT 0,C"
  [gb]
  (-> gb
      (operations/bit-test-reg :C 0)
      (operations/add-cycles 8)))

(defn opcode_42
  "BIT 0,D"
  [gb]
  (-> gb
      (operations/bit-test-reg :D 0)
      (operations/add-cycles 8)))

(defn opcode_43
  "BIT 0,E"
  [gb]
  (-> gb
      (operations/bit-test-reg :E 0)
      (operations/add-cycles 8)))

(defn opcode_44
  "BIT 0,H"
  [gb]
  (-> gb
      (operations/bit-test-reg :H 0)
      (operations/add-cycles 8)))

(defn opcode_45
  "BIT 0,L"
  [gb]
  (-> gb
      (operations/bit-test-reg :L 0)
      (operations/add-cycles 8)))

(defn opcode_46
  "BIT 0,(HL)"
  [gb]
  (-> gb
      (operations/bit-test-at (:HL gb) 0)
      (operations/add-cycles 12)))

(defn opcode_47
  "BIT 0,A"
  [gb]
  (-> gb
      (operations/bit-test-reg :A 0)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 test bit 1                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_48
  "BIT 1,B"
  [gb]
  (-> gb
      (operations/bit-test-reg :B 1)
      (operations/add-cycles 8)))

(defn opcode_49
  "BIT 1,C"
  [gb]
  (-> gb
      (operations/bit-test-reg :C 1)
      (operations/add-cycles 8)))

(defn opcode_4a
  "BIT 1,D"
  [gb]
  (-> gb
      (operations/bit-test-reg :D 1)
      (operations/add-cycles 8)))

(defn opcode_4b
  "BIT 1,E"
  [gb]
  (-> gb
      (operations/bit-test-reg :E 1)
      (operations/add-cycles 8)))

(defn opcode_4c
  "BIT 1,H"
  [gb]
  (-> gb
      (operations/bit-test-reg :H 1)
      (operations/add-cycles 8)))

(defn opcode_4d
  "BIT 1,L"
  [gb]
  (-> gb
      (operations/bit-test-reg :L 1)
      (operations/add-cycles 8)))

(defn opcode_4e
  "BIT 1,(HL)"
  [gb]
  (-> gb
      (operations/bit-test-at (:HL gb) 1)
      (operations/add-cycles 12)))

(defn opcode_4f
  "BIT 1,A"
  [gb]
  (-> gb
      (operations/bit-test-reg :A 1)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 test bit 2                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_50
  "BIT 2,B"
  [gb]
  (-> gb
      (operations/bit-test-reg :B 2)
      (operations/add-cycles 8)))

(defn opcode_51
  "BIT 2,C"
  [gb]
  (-> gb
      (operations/bit-test-reg :C 2)
      (operations/add-cycles 8)))

(defn opcode_52
  "BIT 2,D"
  [gb]
  (-> gb
      (operations/bit-test-reg :D 2)
      (operations/add-cycles 8)))

(defn opcode_53
  "BIT 2,E"
  [gb]
  (-> gb
      (operations/bit-test-reg :E 2)
      (operations/add-cycles 8)))

(defn opcode_54
  "BIT 2,H"
  [gb]
  (-> gb
      (operations/bit-test-reg :H 2)
      (operations/add-cycles 8)))

(defn opcode_55
  "BIT 2,L"
  [gb]
  (-> gb
      (operations/bit-test-reg :L 2)
      (operations/add-cycles 8)))

(defn opcode_56
  "BIT 2,(HL)"
  [gb]
  (-> gb
      (operations/bit-test-at (:HL gb) 2)
      (operations/add-cycles 12)))

(defn opcode_57
  "BIT 2,A"
  [gb]
  (-> gb
      (operations/bit-test-reg :A 2)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 test bit 3                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_58
  "BIT 3,B"
  [gb]
  (-> gb
      (operations/bit-test-reg :B 3)
      (operations/add-cycles 8)))

(defn opcode_59
  "BIT 3,C"
  [gb]
  (-> gb
      (operations/bit-test-reg :C 3)
      (operations/add-cycles 8)))

(defn opcode_5a
  "BIT 3,D"
  [gb]
  (-> gb
      (operations/bit-test-reg :D 3)
      (operations/add-cycles 8)))

(defn opcode_5b
  "BIT 3,E"
  [gb]
  (-> gb
      (operations/bit-test-reg :E 3)
      (operations/add-cycles 8)))

(defn opcode_5c
  "BIT 3,H"
  [gb]
  (-> gb
      (operations/bit-test-reg :H 3)
      (operations/add-cycles 8)))

(defn opcode_5d
  "BIT 3,L"
  [gb]
  (-> gb
      (operations/bit-test-reg :L 3)
      (operations/add-cycles 8)))

(defn opcode_5e
  "BIT 3,(HL)"
  [gb]
  (-> gb
      (operations/bit-test-at (:HL gb) 3)
      (operations/add-cycles 12)))

(defn opcode_5f
  "BIT 3,A"
  [gb]
  (-> gb
      (operations/bit-test-reg :A 3)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 test bit 4                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_60
  "BIT 4,B"
  [gb]
  (-> gb
      (operations/bit-test-reg :B 4)
      (operations/add-cycles 8)))

(defn opcode_61
  "BIT 4,C"
  [gb]
  (-> gb
      (operations/bit-test-reg :C 4)
      (operations/add-cycles 8)))

(defn opcode_62
  "BIT 4,D"
  [gb]
  (-> gb
      (operations/bit-test-reg :D 4)
      (operations/add-cycles 8)))

(defn opcode_63
  "BIT 4,E"
  [gb]
  (-> gb
      (operations/bit-test-reg :E 4)
      (operations/add-cycles 8)))

(defn opcode_64
  "BIT 4,H"
  [gb]
  (-> gb
      (operations/bit-test-reg :H 4)
      (operations/add-cycles 8)))

(defn opcode_65
  "BIT 4,L"
  [gb]
  (-> gb
      (operations/bit-test-reg :L 4)
      (operations/add-cycles 8)))

(defn opcode_66
  "BIT 4,(HL)"
  [gb]
  (-> gb
      (operations/bit-test-at (:HL gb) 4)
      (operations/add-cycles 12)))

(defn opcode_67
  "BIT 4,A"
  [gb]
  (-> gb
      (operations/bit-test-reg :A 4)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 test bit 5                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_68
  "BIT 5,B"
  [gb]
  (-> gb
      (operations/bit-test-reg :B 5)
      (operations/add-cycles 8)))

(defn opcode_69
  "BIT 5,C"
  [gb]
  (-> gb
      (operations/bit-test-reg :C 5)
      (operations/add-cycles 8)))

(defn opcode_6a
  "BIT 5,D"
  [gb]
  (-> gb
      (operations/bit-test-reg :D 5)
      (operations/add-cycles 8)))

(defn opcode_6b
  "BIT 5,E"
  [gb]
  (-> gb
      (operations/bit-test-reg :E 5)
      (operations/add-cycles 8)))

(defn opcode_6c
  "BIT 5,H"
  [gb]
  (-> gb
      (operations/bit-test-reg :H 5)
      (operations/add-cycles 8)))

(defn opcode_6d
  "BIT 5,L"
  [gb]
  (-> gb
      (operations/bit-test-reg :L 5)
      (operations/add-cycles 8)))

(defn opcode_6e
  "BIT 5,(HL)"
  [gb]
  (-> gb
      (operations/bit-test-at (:HL gb) 5)
      (operations/add-cycles 12)))

(defn opcode_6f
  "BIT 5,A"
  [gb]
  (-> gb
      (operations/bit-test-reg :A 5)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 test bit 6                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_70
  "BIT 6,B"
  [gb]
  (-> gb
      (operations/bit-test-reg :B 6)
      (operations/add-cycles 8)))

(defn opcode_71
  "BIT 6,C"
  [gb]
  (-> gb
      (operations/bit-test-reg :C 6)
      (operations/add-cycles 8)))

(defn opcode_72
  "BIT 6,D"
  [gb]
  (-> gb
      (operations/bit-test-reg :D 6)
      (operations/add-cycles 8)))

(defn opcode_73
  "BIT 6,E"
  [gb]
  (-> gb
      (operations/bit-test-reg :E 6)
      (operations/add-cycles 8)))

(defn opcode_74
  "BIT 6,H"
  [gb]
  (-> gb
      (operations/bit-test-reg :H 6)
      (operations/add-cycles 8)))

(defn opcode_75
  "BIT 6,L"
  [gb]
  (-> gb
      (operations/bit-test-reg :L 6)
      (operations/add-cycles 8)))

(defn opcode_76
  "BIT 6,(HL)"
  [gb]
  (-> gb
      (operations/bit-test-at (:HL gb) 6)
      (operations/add-cycles 12)))

(defn opcode_77
  "BIT 6,A"
  [gb]
  (-> gb 
      (operations/bit-test-reg :A 6)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 test bit 7                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_78
  "BIT 7,B"
  [gb]
  (-> gb
      (operations/bit-test-reg :B 7)
      (operations/add-cycles 8)))

(defn opcode_79
  "BIT 7,C"
  [gb]
  (-> gb
      (operations/bit-test-reg :C 7)
      (operations/add-cycles 8)))

(defn opcode_7a
  "BIT 7,D"
  [gb]
  (-> gb
      (operations/bit-test-reg :D 7)
      (operations/add-cycles 8)))

(defn opcode_7b
  "BIT 7,E"
  [gb]
  (-> gb
      (operations/bit-test-reg :E 7)
      (operations/add-cycles 8)))

(defn opcode_7c
  "BIT 7,H"
  [gb]
  (-> gb
      (operations/bit-test-reg :H 7)
      (operations/add-cycles 8)))

(defn opcode_7d
  "BIT 7,L"
  [gb]
  (-> gb
      (operations/bit-test-reg :L 7)
      (operations/add-cycles 8)))

(defn opcode_7e
  "BIT 7,(HL)"
  [gb]
  (-> gb
      (operations/bit-test-at (:HL gb) 7)
      (operations/add-cycles 12)))

(defn opcode_7f
  "BIT 7,A"
  [gb]
  (-> gb
      (operations/bit-test-reg :A 7)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                clear bit 0                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_80
  "RES 0,B"
  [gb]
  (-> gb
      (operations/bit-clear-reg :B 0)
      (operations/add-cycles 8)))

(defn opcode_81
  "RES 0,C"
  [gb]
  (-> gb
      (operations/bit-clear-reg :C 0)
      (operations/add-cycles 8)))

(defn opcode_82
  "RES 0,D"
  [gb]
  (-> gb
      (operations/bit-clear-reg :D 0)
      (operations/add-cycles 8)))

(defn opcode_83
  "RES 0,E"
  [gb]
  (-> gb
      (operations/bit-clear-reg :E 0)
      (operations/add-cycles 8)))

(defn opcode_84
  "RES 0,H"
  [gb]
  (-> gb
      (operations/bit-clear-reg :H 0)
      (operations/add-cycles 8)))

(defn opcode_85
  "RES 0,L"
  [gb]
  (-> gb
      (operations/bit-clear-reg :L 0)
      (operations/add-cycles 8)))

(defn opcode_86
  "RES 0,(HL)"
  [gb]
  (-> gb
      (operations/bit-clear-at (:HL gb) 0)
      (operations/add-cycles 16)))

(defn opcode_87
  "RES 0,A"
  [gb]
  (-> gb
      (operations/bit-clear-reg :A 0)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                clear bit 1                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_88
  "RES 1,B"
  [gb]
  (-> gb
      (operations/bit-clear-reg :B 1)
      (operations/add-cycles 8)))

(defn opcode_89
  "RES 1,C"
  [gb]
  (-> gb
      (operations/bit-clear-reg :C 1)
      (operations/add-cycles 8)))

(defn opcode_8a
  "RES 1,D"
  [gb]
  (-> gb
      (operations/bit-clear-reg :D 1)
      (operations/add-cycles 8)))

(defn opcode_8b
  "RES 1,E"
  [gb]
  (-> gb
      (operations/bit-clear-reg :E 1)
      (operations/add-cycles 8)))

(defn opcode_8c
  "RES 1,H"
  [gb]
  (-> gb
      (operations/bit-clear-reg :H 1)
      (operations/add-cycles 8)))

(defn opcode_8d
  "RES 1,L"
  [gb]
  (-> gb
      (operations/bit-clear-reg :L 1)
      (operations/add-cycles 8)))

(defn opcode_8e
  "RES 1,(HL)"
  [gb]
  (-> gb
      (operations/bit-clear-at (:HL gb) 1)
      (operations/add-cycles 16)))

(defn opcode_8f
  "RES 1,A"
  [gb]
  (-> gb
      (operations/bit-clear-reg :A 1)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                clear bit 02                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_90
  "RES 2,B"
  [gb]
  (-> gb
      (operations/bit-clear-reg :B 2)
      (operations/add-cycles 8)))

(defn opcode_91
  "RES 2,C"
  [gb]
  (-> gb
      (operations/bit-clear-reg :C 2)
      (operations/add-cycles 8)))

(defn opcode_92
  "RES 2,D"
  [gb]
  (-> gb
      (operations/bit-clear-reg :D 2)
      (operations/add-cycles 8)))

(defn opcode_93
  "RES 2,E"
  [gb]
  (-> gb
      (operations/bit-clear-reg :E 2)
      (operations/add-cycles 8)))

(defn opcode_94
  "RES 2,H"
  [gb]
  (-> gb
      (operations/bit-clear-reg :H 2)
      (operations/add-cycles 8)))

(defn opcode_95
  "RES 2,L"
  [gb]
  (-> gb
      (operations/bit-clear-reg :L 2)
      (operations/add-cycles 8)))

(defn opcode_96
  "RES 2,(HL)"
  [gb]
  (-> gb
      (operations/bit-clear-at (:HL gb) 2)
      (operations/add-cycles 16)))

(defn opcode_97
  "RES 2,A"
  [gb]
  (-> gb
      (operations/bit-clear-reg :A 2)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                clear bit 3                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_98
  "RES 3,B"
  [gb]
  (-> gb
      (operations/bit-clear-reg :B 3)
      (operations/add-cycles 8)))

(defn opcode_99
  "RES 3,C"
  [gb]
  (-> gb
      (operations/bit-clear-reg :C 3)
      (operations/add-cycles 8)))

(defn opcode_9a
  "RES 3,D"
  [gb]
  (-> gb
      (operations/bit-clear-reg :D 3)
      (operations/add-cycles 8)))

(defn opcode_9b
  "RES 3,E"
  [gb]
  (-> gb
      (operations/bit-clear-reg :E 3)
      (operations/add-cycles 8)))

(defn opcode_9c
  "RES 3,H"
  [gb]
  (-> gb
      (operations/bit-clear-reg :H 3)
      (operations/add-cycles 8)))

(defn opcode_9d
  "RES 3,L"
  [gb]
  (-> gb
      (operations/bit-clear-reg :L 3)
      (operations/add-cycles 8)))

(defn opcode_9e
  "RES 3,(HL)"
  [gb]
  (-> gb
      (operations/bit-clear-at (:HL gb) 3)
      (operations/add-cycles 16)))

(defn opcode_9f
  "RES 3,A"
  [gb]
  (-> gb
      (operations/bit-clear-reg :A 3)
      (operations/add-cycles 8)))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                clear bit 4                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_a0
  "RES 4,B"
  [gb]
  (-> gb
      (operations/bit-clear-reg :B 4)
      (operations/add-cycles 8)))

(defn opcode_a1
  "RES 4,C"
  [gb]
  (-> gb
      (operations/bit-clear-reg :C 4)
      (operations/add-cycles 8)))

(defn opcode_a2
  "RES 4,D"
  [gb]
  (-> gb
      (operations/bit-clear-reg :D 4)
      (operations/add-cycles 8)))

(defn opcode_a3
  "RES 4,E"
  [gb]
  (-> gb
      (operations/bit-clear-reg :E 4)
      (operations/add-cycles 8)))

(defn opcode_a4
  "RES 4,H"
  [gb]
  (-> gb
      (operations/bit-clear-reg :H 4)
      (operations/add-cycles 8)))

(defn opcode_a5
  "RES 4,L"
  [gb]
  (-> gb
      (operations/bit-clear-reg :L 4)
      (operations/add-cycles 8)))

(defn opcode_a6
  "RES 4,(HL)"
  [gb]
  (-> gb
      (operations/bit-clear-at (:HL gb) 4)
      (operations/add-cycles 16)))

(defn opcode_a7
  "RES 4,A"
  [gb]
  (-> gb
      (operations/bit-clear-reg :A 4)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                clear bit 5                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_a8
  "RES 5,B"
  [gb]
  (-> gb
      (operations/bit-clear-reg :B 5)
      (operations/add-cycles 8)))

(defn opcode_a9
  "RES 5,C"
  [gb]
  (-> gb
      (operations/bit-clear-reg :C 5)
      (operations/add-cycles 8)))

(defn opcode_aa
  "RES 5,D"
  [gb]
  (-> gb
      (operations/bit-clear-reg :D 5)
      (operations/add-cycles 8)))

(defn opcode_ab
  "RES 5,E"
  [gb]
  (-> gb
      (operations/bit-clear-reg :E 5)
      (operations/add-cycles 8)))

(defn opcode_ac
  "RES 5,H"
  [gb]
  (-> gb
      (operations/bit-clear-reg :H 5)
      (operations/add-cycles 8)))

(defn opcode_ad
  "RES 5,L"
  [gb]
  (-> gb
      (operations/bit-clear-reg :L 5)
      (operations/add-cycles 8)))

(defn opcode_ae
  "RES 5,(HL)"
  [gb]
  (-> gb
      (operations/bit-clear-at (:HL gb) 5)
      (operations/add-cycles 16)))

(defn opcode_af
  "RES 5,A"
  [gb]
  (-> gb
      (operations/bit-clear-reg :A 5)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                clear bit 6                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_b0
  "RES 6,B"
  [gb]
  (-> gb
      (operations/bit-clear-reg :B 6)
      (operations/add-cycles 8)))

(defn opcode_b1
  "RES 6,C"
  [gb]
  (-> gb
      (operations/bit-clear-reg :C 6) 
      (operations/add-cycles 8)))

(defn opcode_b2
  "RES 6,D"
  [gb]
  (-> gb
      (operations/bit-clear-reg :D 6) 
      (operations/add-cycles 8)))

(defn opcode_b3
  "RES 6,E"
  [gb]
  (-> gb
      (operations/bit-clear-reg :E 6)
      (operations/add-cycles 8)))

(defn opcode_b4
  "RES 6,H"
  [gb]
  (-> gb
      (operations/bit-clear-reg :H 6)
      (operations/add-cycles 8)))

(defn opcode_b5
  "RES 6,L"
  [gb]
  (-> gb
      (operations/bit-clear-reg :L 6)
      (operations/add-cycles 8)))

(defn opcode_b6
  "RES 6,(HL)"
  [gb]
  (-> gb
      (operations/bit-clear-at (:HL gb) 6)
      (operations/add-cycles 16)))

(defn opcode_b7
  "RES 6,A"
  [gb]
  (-> gb
      (operations/bit-clear-reg :A 6)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                clear bit 7                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_b8
  "RES 7,B"
  [gb]
  (-> gb
      (operations/bit-clear-reg :B 7)
      (operations/add-cycles 8)))

(defn opcode_b9
  "RES 7,C"
  [gb]
  (-> gb
      (operations/bit-clear-reg :C 7)
      (operations/add-cycles 8)))

(defn opcode_ba
  "RES 7,D"
  [gb]
  (-> gb
      (operations/bit-clear-reg :D 7)
      (operations/add-cycles 8)))

(defn opcode_bb
  "RES 7,E"
  [gb]
  (-> gb
      (operations/bit-clear-reg :E 7)
      (operations/add-cycles 8)))

(defn opcode_bc
  "RES 7,H"
  [gb]
  (-> gb
      (operations/bit-clear-reg :H 7)
      (operations/add-cycles 8)))

(defn opcode_bd
  "RES 7,L"
  [gb]
  (-> gb
      (operations/bit-clear-reg :L 7)
      (operations/add-cycles 8)))

(defn opcode_be
  "RES 7,(HL)"
  [gb]
  (-> gb
      (operations/bit-clear-at (:HL gb) 7)
      (operations/add-cycles 16)))

(defn opcode_bf
  "RES 7,A"
  [gb]
  (-> gb
      (operations/bit-clear-reg :A 7)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 set bit 0                                  ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_c0
  "SET 0,B"
  [gb]
  (-> gb
      (operations/bit-set-reg :B 0)
      (operations/add-cycles 8)))

(defn opcode_c1
  "SET 0,C"
  [gb]
  (-> gb
      (operations/bit-set-reg :C 0)
      (operations/add-cycles 8)))

(defn opcode_c2
  "SET 0,D"
  [gb]
  (-> gb
      (operations/bit-set-reg :D 0)
      (operations/add-cycles 8)))

(defn opcode_c3
  "SET 0,E"
  [gb]
  (-> gb
      (operations/bit-set-reg :E 0)
      (operations/add-cycles 8)))

(defn opcode_c4
  "SET 0,H"
  [gb]
  (-> gb
      (operations/bit-set-reg :H 0)
      (operations/add-cycles 8)))

(defn opcode_c5
  "SET 0,L"
  [gb]
  (-> gb
      (operations/bit-set-reg :L 0)
      (operations/add-cycles 8)))

(defn opcode_c6
  "SET 0,(HL)"
  [gb]
  (-> gb
      (operations/bit-set-at (:HL gb) 0)
      (operations/add-cycles 16)))

(defn opcode_c7
  "SET 0,A"
  [gb]
  (-> gb
      (operations/bit-set-reg :A 0)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 set bit 1                                  ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_c8
  "SET 1,B"
  [gb]
  (-> gb
      (operations/bit-set-reg :B 1)
      (operations/add-cycles 8)))

(defn opcode_c9
  "SET 1,C"
  [gb]
  (-> gb
      (operations/bit-set-reg :C 1)
      (operations/add-cycles 8)))

(defn opcode_ca
  "SET 1,D"
  [gb]
  (-> gb
      (operations/bit-set-reg :D 1)
      (operations/add-cycles 8)))

(defn opcode_cb
  "SET 1,E"
  [gb]
  (-> gb
      (operations/bit-set-reg :E 1)
      (operations/add-cycles 8)))

(defn opcode_cc
  "SET 1,H"
  [gb]
  (-> gb
      (operations/bit-set-reg :H 1)
      (operations/add-cycles 8)))

(defn opcode_cd
  "SET 1,L"
  [gb]
  (-> gb
      (operations/bit-set-reg :L 1)
      (operations/add-cycles 8)))

(defn opcode_ce
  "SET 1,(HL)"
  [gb]
  (-> gb
      (operations/bit-set-at (:HL gb) 1)
      (operations/add-cycles 16)))

(defn opcode_cf
  "SET 1,A"
  [gb]
  (-> gb
      (operations/bit-set-reg :A 1)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 set bit 2                                  ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_d0
  "SET 2,B"
  [gb]
  (-> gb
      (operations/bit-set-reg :B 2)
      (operations/add-cycles 8)))

(defn opcode_d1
  "SET 2,C"
  [gb]
  (-> gb
      (operations/bit-set-reg :C 2)
      (operations/add-cycles 8)))

(defn opcode_d2
  "SET 2,D"
  [gb]
  (-> gb
      (operations/bit-set-reg :D 2)
      (operations/add-cycles 8)))

(defn opcode_d3
  "SET 2,E"
  [gb]
  (-> gb
      (operations/bit-set-reg :E 2)
      (operations/add-cycles 8)))

(defn opcode_d4
  "SET 2,H"
  [gb]
  (-> gb
      (operations/bit-set-reg :H 2)
      (operations/add-cycles 8)))

(defn opcode_d5
  "SET 2,L"
  [gb]
  (-> gb
      (operations/bit-set-reg :L 2)
      (operations/add-cycles 8)))

(defn opcode_d6
  "SET 2,(HL)"
  [gb]
  (-> gb
      (operations/bit-set-at (:HL gb) 2)
      (operations/add-cycles 16)))

(defn opcode_d7
  "SET 2,A"
  [gb]
  (-> gb
      (operations/bit-set-reg :A 2)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 set bit 3                                  ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_d8
  "SET 3,B"
  [gb]
  (-> gb
      (operations/bit-set-reg :B 3)
      (operations/add-cycles 8)))

(defn opcode_d9
  "SET 3,C"
  [gb]
  (-> gb
      (operations/bit-set-reg :C 3)
      (operations/add-cycles 8)))

(defn opcode_da
  "SET 3,D"
  [gb]
  (-> gb
      (operations/bit-set-reg :D 3)
      (operations/add-cycles 8)))

(defn opcode_db
  "SET 3,E"
  [gb]
  (-> gb
      (operations/bit-set-reg :E 3)
      (operations/add-cycles 8)))

(defn opcode_dc
  "SET 3,H"
  [gb]
  (-> gb
      (operations/bit-set-reg :H 3)
      (operations/add-cycles 8)))

(defn opcode_dd
  "SET 3,L"
  [gb]
  (-> gb
      (operations/bit-set-reg :L 3)
      (operations/add-cycles 8)))

(defn opcode_de
  "SET 3,(HL)"
  [gb]
  (-> gb
      (operations/bit-set-at (:HL gb) 3)
      (operations/add-cycles 16)))

(defn opcode_df
  "SET 3,A"
  [gb]
  (-> gb
      (operations/bit-set-reg :A 3)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 set bit 4                                  ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_e0
  "SET 4,B"
  [gb]
  (-> gb
      (operations/bit-set-reg :B 4)
      (operations/add-cycles 8)))

(defn opcode_e1
  "SET 4,C"
  [gb]
  (-> gb
      (operations/bit-set-reg :C 4)
      (operations/add-cycles 8)))

(defn opcode_e2
  "SET 4,D"
  [gb]
  (-> gb
      (operations/bit-set-reg :D 4)
      (operations/add-cycles 8)))

(defn opcode_e3
  "SET 4,E"
  [gb]
  (-> gb
      (operations/bit-set-reg :E 4)
      (operations/add-cycles 8)))

(defn opcode_e4
  "SET 4,H"
  [gb]
  (-> gb
      (operations/bit-set-reg :H 4)
      (operations/add-cycles 8)))

(defn opcode_e5
  "SET 4,L"
  [gb]
  (-> gb
      (operations/bit-set-reg :L 4)
      (operations/add-cycles 8)))

(defn opcode_e6
  "SET 4,(HL)"
  [gb]
  (-> gb
      (operations/bit-set-at (:HL gb) 4)
      (operations/add-cycles 16)))

(defn opcode_e7
  "SET 4,A"
  [gb]
  (-> gb
      (operations/bit-set-reg :A 4)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 set bit 5                                  ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_e8
  "SET 5,B"
  [gb]
  (-> gb
      (operations/bit-set-reg :B 5)
      (operations/add-cycles 8)))

(defn opcode_e9
  "SET 5,C"
  [gb]
  (-> gb
      (operations/bit-set-reg :C 5)
      (operations/add-cycles 8)))

(defn opcode_ea
  "SET 5,D"
  [gb]
  (-> gb
      (operations/bit-set-reg :D 5)
      (operations/add-cycles 8)))

(defn opcode_eb
  "SET 5,E"
  [gb]
  (-> gb
      (operations/bit-set-reg :E 5)
      (operations/add-cycles 8)))

(defn opcode_ec
  "SET 5,H"
  [gb]
  (-> gb
      (operations/bit-set-reg :H 5)
      (operations/add-cycles 8)))

(defn opcode_ed
  "SET 5,L"
  [gb]
  (-> gb
      (operations/bit-set-reg :L 5)
      (operations/add-cycles 8)))

(defn opcode_ee
  "SET 5,(HL)"
  [gb]
  (-> gb
      (operations/bit-set-at (:HL gb) 5)
      (operations/add-cycles 16)))

(defn opcode_ef
  "SET 5,A"
  [gb]
  (-> gb
      (operations/bit-set-reg :A 5)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 set bit 6                                  ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_f0
  "SET 6,B"
  [gb]
  (-> gb
      (operations/bit-set-reg :B 6)
      (operations/add-cycles 8)))

(defn opcode_f1
  "SET 6,C"
  [gb]
  (-> gb
      (operations/bit-set-reg :C 6)
      (operations/add-cycles 8)))

(defn opcode_f2
  "SET 6,D"
  [gb]
  (-> gb
      (operations/bit-set-reg :D 6)
      (operations/add-cycles 8)))

(defn opcode_f3
  "SET 6,E"
  [gb]
  (-> gb
      (operations/bit-set-reg :E 6)
      (operations/add-cycles 8)))

(defn opcode_f4
  "SET 6,H"
  [gb]
  (-> gb
      (operations/bit-set-reg :H 6)
      (operations/add-cycles 8)))

(defn opcode_f5
  "SET 6,L"
  [gb]
  (-> gb
      (operations/bit-set-reg :L 6)
      (operations/add-cycles 8)))

(defn opcode_f6
  "SET 6,(HL)"
  [gb]
  (-> gb
      (operations/bit-set-at (:HL gb) 6)
      (operations/add-cycles 16)))

(defn opcode_f7
  "SET 6,A"
  [gb]
  (-> gb
      (operations/bit-set-reg :A 6)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 set bit 7                                  ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_f8
  "SET 7,B"
  [gb]
  (-> gb
      (operations/bit-set-reg :B 7)
      (operations/add-cycles 8)))

(defn opcode_f9
  "SET 7,C"
  [gb]
  (-> gb
      (operations/bit-set-reg :C 7)
      (operations/add-cycles 8)))

(defn opcode_fa
  "SET 7,D"
  [gb]
  (-> gb
      (operations/bit-set-reg :D 7)
      (operations/add-cycles 8)))

(defn opcode_fb
  "SET 7,E"
  [gb]
  (-> gb
      (operations/bit-set-reg :E 7)
      (operations/add-cycles 8)))

(defn opcode_fc
  "SET 7,H"
  [gb]
  (-> gb
      (operations/bit-set-reg :H 7)
      (operations/add-cycles 8)))

(defn opcode_fd
  "SET 7,L"
  [gb]
  (-> gb
      (operations/bit-set-reg :L 7)
      (operations/add-cycles 8)))

(defn opcode_fe
  "SET 7,(HL)"
  [gb]
  (-> gb
      (operations/bit-set-at (:HL gb) 7)
      (operations/add-cycles 16)))

(defn opcode_ff
  "SET 7,A"
  [gb]
  (-> gb
      (operations/bit-set-reg :A 7)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                               execute opcode                               ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn execute-extended-opcode
  "This function executes in `gb` the cb-instruction corresponding to `opcode`."
  [gb opcode]
  (case opcode
    0x00 (opcode_00 gb)
    0x01 (opcode_01 gb)
    0x02 (opcode_02 gb)
    0x03 (opcode_03 gb)
    0x04 (opcode_04 gb)
    0x05 (opcode_05 gb)
    0x06 (opcode_06 gb)
    0x07 (opcode_07 gb)
    0x08 (opcode_08 gb)
    0x09 (opcode_09 gb)
    0x0a (opcode_0a gb)
    0x0b (opcode_0b gb)
    0x0c (opcode_0c gb)
    0x0d (opcode_0d gb)
    0x0e (opcode_0e gb)
    0x0f (opcode_0f gb)
    0x10 (opcode_10 gb)
    0x11 (opcode_11 gb)
    0x12 (opcode_12 gb)
    0x13 (opcode_13 gb)
    0x14 (opcode_14 gb)
    0x15 (opcode_15 gb)
    0x16 (opcode_16 gb)
    0x17 (opcode_17 gb)
    0x18 (opcode_18 gb)
    0x19 (opcode_19 gb)
    0x1a (opcode_1a gb)
    0x1b (opcode_1b gb)
    0x1c (opcode_1c gb)
    0x1d (opcode_1d gb)
    0x1e (opcode_1e gb)
    0x1f (opcode_1f gb)
    0x20 (opcode_20 gb)
    0x21 (opcode_21 gb)
    0x22 (opcode_22 gb)
    0x23 (opcode_23 gb)
    0x24 (opcode_24 gb)
    0x25 (opcode_25 gb)
    0x26 (opcode_26 gb)
    0x27 (opcode_27 gb)
    0x28 (opcode_28 gb)
    0x29 (opcode_29 gb)
    0x2a (opcode_2a gb)
    0x2b (opcode_2b gb)
    0x2c (opcode_2c gb)
    0x2d (opcode_2d gb)
    0x2e (opcode_2e gb)
    0x2f (opcode_2f gb)
    0x30 (opcode_30 gb)
    0x31 (opcode_31 gb)
    0x32 (opcode_32 gb)
    0x33 (opcode_33 gb)
    0x34 (opcode_34 gb)
    0x35 (opcode_35 gb)
    0x36 (opcode_36 gb)
    0x37 (opcode_37 gb)
    0x38 (opcode_38 gb)
    0x39 (opcode_39 gb)
    0x3a (opcode_3a gb)
    0x3b (opcode_3b gb)
    0x3c (opcode_3c gb)
    0x3d (opcode_3d gb)
    0x3e (opcode_3e gb)
    0x3f (opcode_3f gb)
    0x40 (opcode_40 gb)
    0x41 (opcode_41 gb)
    0x42 (opcode_42 gb)
    0x43 (opcode_43 gb)
    0x44 (opcode_44 gb)
    0x45 (opcode_45 gb)
    0x46 (opcode_46 gb)
    0x47 (opcode_47 gb)
    0x48 (opcode_48 gb)
    0x49 (opcode_49 gb)
    0x4a (opcode_4a gb)
    0x4b (opcode_4b gb)
    0x4c (opcode_4c gb)
    0x4d (opcode_4d gb)
    0x4e (opcode_4e gb)
    0x4f (opcode_4f gb)
    0x50 (opcode_50 gb)
    0x51 (opcode_51 gb)
    0x52 (opcode_52 gb)
    0x53 (opcode_53 gb)
    0x54 (opcode_54 gb)
    0x55 (opcode_55 gb)
    0x56 (opcode_56 gb)
    0x57 (opcode_57 gb)
    0x58 (opcode_58 gb)
    0x59 (opcode_59 gb)
    0x5a (opcode_5a gb)
    0x5b (opcode_5b gb)
    0x5c (opcode_5c gb)
    0x5d (opcode_5d gb)
    0x5e (opcode_5e gb)
    0x5f (opcode_5f gb)
    0x60 (opcode_60 gb)
    0x61 (opcode_61 gb)
    0x62 (opcode_62 gb)
    0x63 (opcode_63 gb)
    0x64 (opcode_64 gb)
    0x65 (opcode_65 gb)
    0x66 (opcode_66 gb)
    0x67 (opcode_67 gb)
    0x68 (opcode_68 gb)
    0x69 (opcode_69 gb)
    0x6a (opcode_6a gb)
    0x6b (opcode_6b gb)
    0x6c (opcode_6c gb)
    0x6d (opcode_6d gb)
    0x6e (opcode_6e gb)
    0x6f (opcode_6f gb)
    0x70 (opcode_70 gb)
    0x71 (opcode_71 gb)
    0x72 (opcode_72 gb)
    0x73 (opcode_73 gb)
    0x74 (opcode_74 gb)
    0x75 (opcode_75 gb)
    0x76 (opcode_76 gb)
    0x77 (opcode_77 gb)
    0x78 (opcode_78 gb)
    0x79 (opcode_79 gb)
    0x7a (opcode_7a gb)
    0x7b (opcode_7b gb)
    0x7c (opcode_7c gb)
    0x7d (opcode_7d gb)
    0x7e (opcode_7e gb)
    0x7f (opcode_7f gb)
    0x80 (opcode_80 gb)
    0x81 (opcode_81 gb)
    0x82 (opcode_82 gb)
    0x83 (opcode_83 gb)
    0x84 (opcode_84 gb)
    0x85 (opcode_85 gb)
    0x86 (opcode_86 gb)
    0x87 (opcode_87 gb)
    0x88 (opcode_88 gb)
    0x89 (opcode_89 gb)
    0x8a (opcode_8a gb)
    0x8b (opcode_8b gb)
    0x8c (opcode_8c gb)
    0x8d (opcode_8d gb)
    0x8e (opcode_8e gb)
    0x8f (opcode_8f gb)
    0x90 (opcode_90 gb)
    0x91 (opcode_91 gb)
    0x92 (opcode_92 gb)
    0x93 (opcode_93 gb)
    0x94 (opcode_94 gb)
    0x95 (opcode_95 gb)
    0x96 (opcode_96 gb)
    0x97 (opcode_97 gb)
    0x98 (opcode_98 gb)
    0x99 (opcode_99 gb)
    0x9a (opcode_9a gb)
    0x9b (opcode_9b gb)
    0x9c (opcode_9c gb)
    0x9d (opcode_9d gb)
    0x9e (opcode_9e gb)
    0x9f (opcode_9f gb)
    0xa0 (opcode_a0 gb)
    0xa1 (opcode_a1 gb)
    0xa2 (opcode_a2 gb)
    0xa3 (opcode_a3 gb)
    0xa4 (opcode_a4 gb)
    0xa5 (opcode_a5 gb)
    0xa6 (opcode_a6 gb)
    0xa7 (opcode_a7 gb)
    0xa8 (opcode_a8 gb)
    0xa9 (opcode_a9 gb)
    0xaa (opcode_aa gb)
    0xab (opcode_ab gb)
    0xac (opcode_ac gb)
    0xad (opcode_ad gb)
    0xae (opcode_ae gb)
    0xaf (opcode_af gb)
    0xb0 (opcode_b0 gb)
    0xb1 (opcode_b1 gb)
    0xb2 (opcode_b2 gb)
    0xb3 (opcode_b3 gb)
    0xb4 (opcode_b4 gb)
    0xb5 (opcode_b5 gb)
    0xb6 (opcode_b6 gb)
    0xb7 (opcode_b7 gb)
    0xb8 (opcode_b8 gb)
    0xb9 (opcode_b9 gb)
    0xba (opcode_ba gb)
    0xbb (opcode_bb gb)
    0xbc (opcode_bc gb)
    0xbd (opcode_bd gb)
    0xbe (opcode_be gb)
    0xbf (opcode_bf gb)
    0xc0 (opcode_c0 gb)
    0xc1 (opcode_c1 gb)
    0xc2 (opcode_c2 gb)
    0xc3 (opcode_c3 gb)
    0xc4 (opcode_c4 gb)
    0xc5 (opcode_c5 gb)
    0xc6 (opcode_c6 gb)
    0xc7 (opcode_c7 gb)
    0xc8 (opcode_c8 gb)
    0xc9 (opcode_c9 gb)
    0xca (opcode_ca gb)
    0xcb (opcode_cb gb)
    0xcc (opcode_cc gb)
    0xcd (opcode_cd gb)
    0xce (opcode_ce gb)
    0xcf (opcode_cf gb)
    0xd0 (opcode_d0 gb)
    0xd1 (opcode_d1 gb)
    0xd2 (opcode_d2 gb)
    0xd3 (opcode_d3 gb)
    0xd4 (opcode_d4 gb)
    0xd5 (opcode_d5 gb)
    0xd6 (opcode_d6 gb)
    0xd7 (opcode_d7 gb)
    0xd8 (opcode_d8 gb)
    0xd9 (opcode_d9 gb)
    0xda (opcode_da gb)
    0xdb (opcode_db gb)
    0xdc (opcode_dc gb)
    0xdd (opcode_dd gb)
    0xde (opcode_de gb)
    0xdf (opcode_df gb)
    0xe0 (opcode_e0 gb)
    0xe1 (opcode_e1 gb)
    0xe2 (opcode_e2 gb)
    0xe3 (opcode_e3 gb)
    0xe4 (opcode_e4 gb)
    0xe5 (opcode_e5 gb)
    0xe6 (opcode_e6 gb)
    0xe7 (opcode_e7 gb)
    0xe8 (opcode_e8 gb)
    0xe9 (opcode_e9 gb)
    0xea (opcode_ea gb)
    0xeb (opcode_eb gb)
    0xec (opcode_ec gb)
    0xed (opcode_ed gb)
    0xee (opcode_ee gb)
    0xef (opcode_ef gb)
    0xf0 (opcode_f0 gb)
    0xf1 (opcode_f1 gb)
    0xf2 (opcode_f2 gb)
    0xf3 (opcode_f3 gb)
    0xf4 (opcode_f4 gb)
    0xf5 (opcode_f5 gb)
    0xf6 (opcode_f6 gb)
    0xf7 (opcode_f7 gb)
    0xf8 (opcode_f8 gb)
    0xf9 (opcode_f9 gb)
    0xfa (opcode_fa gb)
    0xfb (opcode_fb gb)
    0xfc (opcode_fc gb)
    0xfd (opcode_fd gb)
    0xfe (opcode_fe gb)
    0xff (opcode_ff gb)
    (println "Cannot execute opcode: " opcode "\ngb: " gb)))
