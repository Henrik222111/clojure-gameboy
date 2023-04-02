(ns clojure-gameboy.cpu.extended-opcodes
  "This namespace contains all the extended opcode functions
   for the prefix-cb instruction."
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

(defn opcode_18
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

(defn opcode_88
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
