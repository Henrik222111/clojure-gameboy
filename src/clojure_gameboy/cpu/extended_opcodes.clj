(ns clojure-gameboy.cpu.extended-opcodes
  "This namespace contains all the extended opcode functions
   for the prefix-cb instruction."
  (:require [clojure-gameboy.cpu.operations :as operations]))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 test bit 0                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_40
  "BIT 0,B"
  [gb]
  (-> gb
      (operations/bit-test-B 0)
      (operations/add-cycles 8)))

(defn opcode_41
  "BIT 0,C"
  [gb]
  (-> gb
      (operations/bit-test-C 0)
      (operations/add-cycles 8)))

(defn opcode_42
  "BIT 0,D"
  [gb]
  (-> gb
      (operations/bit-test-D 0)
      (operations/add-cycles 8)))

(defn opcode_43
  "BIT 0,E"
  [gb]
  (-> gb
      (operations/bit-test-E 0)
      (operations/add-cycles 8)))

(defn opcode_44
  "BIT 0,H"
  [gb]
  (-> gb
      (operations/bit-test-H 0)
      (operations/add-cycles 8)))

(defn opcode_45
  "BIT 0,L"
  [gb]
  (-> gb
      (operations/bit-test-L 0)
      (operations/add-cycles 8)))

(defn opcode_46
  "BIT 0,(HL)"
  [gb]
  (-> gb
      (operations/bit-test-at-HL 0)
      (operations/add-cycles 8)))

(defn opcode_47
  "BIT 0,A"
  [gb]
  (-> gb
      (operations/bit-test-A 0)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 test bit 1                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_48
  "BIT 1,B"
  [gb]
  (-> gb
      (operations/bit-test-B 1)
      (operations/add-cycles 8)))

(defn opcode_49
  "BIT 1,C"
  [gb]
  (-> gb
      (operations/bit-test-C 1)
      (operations/add-cycles 8)))

(defn opcode_4a
  "BIT 1,D"
  [gb]
  (-> gb
      (operations/bit-test-D 1)
      (operations/add-cycles 8)))

(defn opcode_4b
  "BIT 1,E"
  [gb]
  (-> gb
      (operations/bit-test-E 1)
      (operations/add-cycles 8)))

(defn opcode_4c
  "BIT 1,H"
  [gb]
  (-> gb
      (operations/bit-test-H 1)
      (operations/add-cycles 8)))

(defn opcode_4d
  "BIT 1,L"
  [gb]
  (-> gb
      (operations/bit-test-L 1)
      (operations/add-cycles 8)))

(defn opcode_4e
  "BIT 1,(HL)"
  [gb]
  (-> gb
      (operations/bit-test-at-HL 1)
      (operations/add-cycles 8)))

(defn opcode_4f
  "BIT 1,A"
  [gb]
  (-> gb
      (operations/bit-test-A 1)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 test bit 2                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_50
  "BIT 2,B"
  [gb]
  (-> gb
      (operations/bit-test-B 2)
      (operations/add-cycles 8)))

(defn opcode_51
  "BIT 2,C"
  [gb]
  (-> gb
      (operations/bit-test-C 2)
      (operations/add-cycles 8)))

(defn opcode_52
  "BIT 2,D"
  [gb]
  (-> gb
      (operations/bit-test-D 2)
      (operations/add-cycles 8)))

(defn opcode_53
  "BIT 2,E"
  [gb]
  (-> gb
      (operations/bit-test-E 2)
      (operations/add-cycles 8)))

(defn opcode_54
  "BIT 2,H"
  [gb]
  (-> gb
      (operations/bit-test-H 2)
      (operations/add-cycles 8)))

(defn opcode_55
  "BIT 2,L"
  [gb]
  (-> gb
      (operations/bit-test-L 2)
      (operations/add-cycles 8)))

(defn opcode_56
  "BIT 2,(HL)"
  [gb]
  (-> gb
      (operations/bit-test-at-HL 2)
      (operations/add-cycles 8)))

(defn opcode_57
  "BIT 2,A"
  [gb]
  (-> gb
      (operations/bit-test-A 2)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 test bit 3                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_58
  "BIT 3,B"
  [gb]
  (-> gb
      (operations/bit-test-B 3)
      (operations/add-cycles 8)))

(defn opcode_59
  "BIT 3,C"
  [gb]
  (-> gb
      (operations/bit-test-C 3)
      (operations/add-cycles 8)))

(defn opcode_5a
  "BIT 3,D"
  [gb]
  (-> gb
      (operations/bit-test-D 3)
      (operations/add-cycles 8)))

(defn opcode_5b
  "BIT 3,E"
  [gb]
  (-> gb
      (operations/bit-test-E 3)
      (operations/add-cycles 8)))

(defn opcode_5c
  "BIT 3,H"
  [gb]
  (-> gb
      (operations/bit-test-H 3)
      (operations/add-cycles 8)))

(defn opcode_5d
  "BIT 3,L"
  [gb]
  (-> gb
      (operations/bit-test-L 3)
      (operations/add-cycles 8)))

(defn opcode_5e
  "BIT 3,(HL)"
  [gb]
  (-> gb
      (operations/bit-test-at-HL 3)
      (operations/add-cycles 8)))

(defn opcode_5f
  "BIT 3,A"
  [gb]
  (-> gb
      (operations/bit-test-A 3)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 test bit 4                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_60
  "BIT 4,B"
  [gb]
  (-> gb
      (operations/bit-test-B 4)
      (operations/add-cycles 8)))

(defn opcode_61
  "BIT 4,C"
  [gb]
  (-> gb
      (operations/bit-test-C 4)
      (operations/add-cycles 8)))

(defn opcode_62
  "BIT 4,D"
  [gb]
  (-> gb
      (operations/bit-test-D 4)
      (operations/add-cycles 8)))

(defn opcode_63
  "BIT 4,E"
  [gb]
  (-> gb
      (operations/bit-test-E 4)
      (operations/add-cycles 8)))

(defn opcode_64
  "BIT 4,H"
  [gb]
  (-> gb
      (operations/bit-test-H 4)
      (operations/add-cycles 8)))

(defn opcode_65
  "BIT 4,L"
  [gb]
  (-> gb
      (operations/bit-test-L 4)
      (operations/add-cycles 8)))

(defn opcode_66
  "BIT 4,(HL)"
  [gb]
  (-> gb
      (operations/bit-test-at-HL 4)
      (operations/add-cycles 8)))

(defn opcode_67
  "BIT 4,A"
  [gb]
  (-> gb
      (operations/bit-test-A 4)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 test bit 5                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_68
  "BIT 5,B"
  [gb]
  (-> gb
      (operations/bit-test-B 5)
      (operations/add-cycles 8)))

(defn opcode_69
  "BIT 5,C"
  [gb]
  (-> gb
      (operations/bit-test-C 5)
      (operations/add-cycles 8)))

(defn opcode_6a
  "BIT 5,D"
  [gb]
  (-> gb
      (operations/bit-test-D 5)
      (operations/add-cycles 8)))

(defn opcode_6b
  "BIT 5,E"
  [gb]
  (-> gb
      (operations/bit-test-E 5)
      (operations/add-cycles 8)))

(defn opcode_6c
  "BIT 5,H"
  [gb]
  (-> gb
      (operations/bit-test-H 5)
      (operations/add-cycles 8)))

(defn opcode_6d
  "BIT 5,L"
  [gb]
  (-> gb
      (operations/bit-test-L 5)
      (operations/add-cycles 8)))

(defn opcode_6e
  "BIT 5,(HL)"
  [gb]
  (-> gb
      (operations/bit-test-at-HL 5)
      (operations/add-cycles 8)))

(defn opcode_6f
  "BIT 5,A"
  [gb]
  (-> gb
      (operations/bit-test-A 5)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 test bit 6                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_70
  "BIT 6,B"
  [gb]
  (-> gb
      (operations/bit-test-B 6)
      (operations/add-cycles 8)))

(defn opcode_71
  "BIT 6,C"
  [gb]
  (-> gb
      (operations/bit-test-C 6)
      (operations/add-cycles 8)))

(defn opcode_72
  "BIT 6,D"
  [gb]
  (-> gb
      (operations/bit-test-D 6)
      (operations/add-cycles 8)))

(defn opcode_73
  "BIT 6,E"
  [gb]
  (-> gb
      (operations/bit-test-E 6)
      (operations/add-cycles 8)))

(defn opcode_74
  "BIT 6,H"
  [gb]
  (-> gb
      (operations/bit-test-H 6)
      (operations/add-cycles 8)))

(defn opcode_75
  "BIT 6,L"
  [gb]
  (-> gb
      (operations/bit-test-L 6)
      (operations/add-cycles 8)))

(defn opcode_76
  "BIT 6,(HL)"
  [gb]
  (-> gb
      (operations/bit-test-at-HL 6)
      (operations/add-cycles 8)))

(defn opcode_77
  "BIT 6,A"
  [gb]
  (-> gb 
      (operations/bit-test-A 6)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 test bit 7                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_78
  "BIT 7,B"
  [gb]
  (-> gb
      (operations/bit-test-B 7)
      (operations/add-cycles 8)))

(defn opcode_79
  "BIT 7,C"
  [gb]
  (-> gb
      (operations/bit-test-C 7)
      (operations/add-cycles 8)))

(defn opcode_7a
  "BIT 7,D"
  [gb]
  (-> gb
      (operations/bit-test-D 7)
      (operations/add-cycles 8)))

(defn opcode_7b
  "BIT 7,E"
  [gb]
  (-> gb
      (operations/bit-test-E 7)
      (operations/add-cycles 8)))

(defn opcode_7c
  "BIT 7,H"
  [gb]
  (-> gb
      (operations/bit-test-H 7)
      (operations/add-cycles 8)))

(defn opcode_7d
  "BIT 7,L"
  [gb]
  (-> gb
      (operations/bit-test-L 7)
      (operations/add-cycles 8)))

(defn opcode_7e
  "BIT 7,(HL)"
  [gb]
  (-> gb
      (operations/bit-test-at-HL 7)
      (operations/add-cycles 8)))

(defn opcode_7f
  "BIT 7,A"
  [gb]
  (-> gb
      (operations/bit-test-A 7)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                clear bit 0                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_80
  "RES 0,B"
  [gb]
  (-> gb
      (operations/bit-clear-B 0)
      (operations/add-cycles 8)))

(defn opcode_81
  "RES 0,C"
  [gb]
  (-> gb
      (operations/bit-clear-C 0)
      (operations/add-cycles 8)))

(defn opcode_82
  "RES 0,D"
  [gb]
  (-> gb
      (operations/bit-clear-D 0)
      (operations/add-cycles 8)))

(defn opcode_83
  "RES 0,E"
  [gb]
  (-> gb
      (operations/bit-clear-E 0)
      (operations/add-cycles 8)))

(defn opcode_84
  "RES 0,H"
  [gb]
  (-> gb
      (operations/bit-clear-H 0)
      (operations/add-cycles 8)))

(defn opcode_85
  "RES 0,L"
  [gb]
  (-> gb
      (operations/bit-clear-L 0)
      (operations/add-cycles 8)))

(defn opcode_86
  "RES 0,(HL)"
  [gb]
  (-> gb
      (operations/bit-clear-at-HL 0)
      (operations/add-cycles 8)))

(defn opcode_87
  "RES 0,A"
  [gb]
  (-> gb
      (operations/bit-clear-A 0)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                clear bit 1                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_88
  "RES 1,B"
  [gb]
  (-> gb
      (operations/bit-clear-B 1)
      (operations/add-cycles 8)))

(defn opcode_89
  "RES 1,C"
  [gb]
  (-> gb
      (operations/bit-clear-C 1)
      (operations/add-cycles 8)))

(defn opcode_8a
  "RES 1,D"
  [gb]
  (-> gb
      (operations/bit-clear-D 1)
      (operations/add-cycles 8)))

(defn opcode_8b
  "RES 1,E"
  [gb]
  (-> gb
      (operations/bit-clear-E 1)
      (operations/add-cycles 8)))

(defn opcode_8c
  "RES 1,H"
  [gb]
  (-> gb
      (operations/bit-clear-H 1)
      (operations/add-cycles 8)))

(defn opcode_8d
  "RES 1,L"
  [gb]
  (-> gb
      (operations/bit-clear-L 1)
      (operations/add-cycles 8)))

(defn opcode_8e
  "RES 1,(HL)"
  [gb]
  (-> gb
      (operations/bit-clear-at-HL 1)
      (operations/add-cycles 8)))

(defn opcode_8f
  "RES 1,A"
  [gb]
  (-> gb
      (operations/bit-clear-A 1)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                clear bit 02                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_90
  "RES 2,B"
  [gb]
  (-> gb
      (operations/bit-clear-B 2)
      (operations/add-cycles 8)))

(defn opcode_91
  "RES 2,C"
  [gb]
  (-> gb
      (operations/bit-clear-C 2)
      (operations/add-cycles 8)))

(defn opcode_92
  "RES 2,D"
  [gb]
  (-> gb
      (operations/bit-clear-D 2)
      (operations/add-cycles 8)))

(defn opcode_93
  "RES 2,E"
  [gb]
  (-> gb
      (operations/bit-clear-E 2)
      (operations/add-cycles 8)))

(defn opcode_94
  "RES 2,H"
  [gb]
  (-> gb
      (operations/bit-clear-H 2)
      (operations/add-cycles 8)))

(defn opcode_95
  "RES 2,L"
  [gb]
  (-> gb
      (operations/bit-clear-L 2)
      (operations/add-cycles 8)))

(defn opcode_96
  "RES 2,(HL)"
  [gb]
  (-> gb
      (operations/bit-clear-at-HL 2)
      (operations/add-cycles 8)))

(defn opcode_97
  "RES 2,A"
  [gb]
  (-> gb
      (operations/bit-clear-A 2)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                clear bit 3                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_88
  "RES 3,B"
  [gb]
  (-> gb
      (operations/bit-clear-B 3)
      (operations/add-cycles 8)))

(defn opcode_99
  "RES 3,C"
  [gb]
  (-> gb
      (operations/bit-clear-C 3)
      (operations/add-cycles 8)))

(defn opcode_9a
  "RES 3,D"
  [gb]
  (-> gb
      (operations/bit-clear-D 3)
      (operations/add-cycles 8)))

(defn opcode_9b
  "RES 3,E"
  [gb]
  (-> gb
      (operations/bit-clear-E 3)
      (operations/add-cycles 8)))

(defn opcode_9c
  "RES 3,H"
  [gb]
  (-> gb
      (operations/bit-clear-H 3)
      (operations/add-cycles 8)))

(defn opcode_9d
  "RES 3,L"
  [gb]
  (-> gb
      (operations/bit-clear-L 3)
      (operations/add-cycles 8)))

(defn opcode_9e
  "RES 3,(HL)"
  [gb]
  (-> gb
      (operations/bit-clear-at-HL 3)
      (operations/add-cycles 8)))

(defn opcode_9f
  "RES 3,A"
  [gb]
  (-> gb
      (operations/bit-clear-A 3)
      (operations/add-cycles 8)))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                clear bit 4                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_a0
  "RES 4,B"
  [gb]
  (-> gb
      (operations/bit-clear-B 4)
      (operations/add-cycles 8)))

(defn opcode_a1
  "RES 4,C"
  [gb]
  (-> gb
      (operations/bit-clear-C 4)
      (operations/add-cycles 8)))

(defn opcode_a2
  "RES 4,D"
  [gb]
  (-> gb
      (operations/bit-clear-D 4)
      (operations/add-cycles 8)))

(defn opcode_a3
  "RES 4,E"
  [gb]
  (-> gb
      (operations/bit-clear-E 4)
      (operations/add-cycles 8)))

(defn opcode_a4
  "RES 4,H"
  [gb]
  (-> gb
      (operations/bit-clear-H 4)
      (operations/add-cycles 8)))

(defn opcode_a5
  "RES 4,L"
  [gb]
  (-> gb
      (operations/bit-clear-L 4)
      (operations/add-cycles 8)))

(defn opcode_a6
  "RES 4,(HL)"
  [gb]
  (-> gb
      (operations/bit-clear-at-HL 4)
      (operations/add-cycles 8)))

(defn opcode_a7
  "RES 4,A"
  [gb]
  (-> gb
      (operations/bit-clear-A 4)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                clear bit 5                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_a8
  "RES 5,B"
  [gb]
  (-> gb
      (operations/bit-clear-B 5)
      (operations/add-cycles 8)))

(defn opcode_a9
  "RES 5,C"
  [gb]
  (-> gb
      (operations/bit-clear-C 5)
      (operations/add-cycles 8)))

(defn opcode_aa
  "RES 5,D"
  [gb]
  (-> gb
      (operations/bit-clear-D 5)
      (operations/add-cycles 8)))

(defn opcode_ab
  "RES 5,E"
  [gb]
  (-> gb
      (operations/bit-clear-E 5)
      (operations/add-cycles 8)))

(defn opcode_ac
  "RES 5,H"
  [gb]
  (-> gb
      (operations/bit-clear-H 5)
      (operations/add-cycles 8)))

(defn opcode_ad
  "RES 5,L"
  [gb]
  (-> gb
      (operations/bit-clear-L 5)
      (operations/add-cycles 8)))

(defn opcode_ae
  "RES 5,(HL)"
  [gb]
  (-> gb
      (operations/bit-clear-at-HL 5)
      (operations/add-cycles 8)))

(defn opcode_af
  "RES 5,A"
  [gb]
  (-> gb
      (operations/bit-clear-A 5)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                clear bit 6                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_b0
  "RES 6,B"
  [gb]
  (-> gb
      (operations/bit-clear-B 6)
      (operations/add-cycles 8)))

(defn opcode_b1
  "RES 6,C"
  [gb]
  (-> gb
      (operations/bit-clear-C 6) 
      (operations/add-cycles 8)))

(defn opcode_b2
  "RES 6,D"
  [gb]
  (-> gb
      (operations/bit-clear-D 6) 
      (operations/add-cycles 8)))

(defn opcode_b3
  "RES 6,E"
  [gb]
  (-> gb
      (operations/bit-clear-E 6)
      (operations/add-cycles 8)))

(defn opcode_b4
  "RES 6,H"
  [gb]
  (-> gb
      (operations/bit-clear-H 6)
      (operations/add-cycles 8)))

(defn opcode_b5
  "RES 6,L"
  [gb]
  (-> gb
      (operations/bit-clear-L 6)
      (operations/add-cycles 8)))

(defn opcode_b6
  "RES 6,(HL)"
  [gb]
  (-> gb
      (operations/bit-clear-at-HL 6)
      (operations/add-cycles 8)))

(defn opcode_b7
  "RES 6,A"
  [gb]
  (-> gb
      (operations/bit-clear-A 6)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                clear bit 7                                 ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_b8
  "RES 7,B"
  [gb]
  (-> gb
      (operations/bit-clear-B 7)
      (operations/add-cycles 8)))

(defn opcode_b9
  "RES 7,C"
  [gb]
  (-> gb
      (operations/bit-clear-C 7)
      (operations/add-cycles 8)))

(defn opcode_ba
  "RES 7,D"
  [gb]
  (-> gb
      (operations/bit-clear-D 7)
      (operations/add-cycles 8)))

(defn opcode_bb
  "RES 7,E"
  [gb]
  (-> gb
      (operations/bit-clear-E 7)
      (operations/add-cycles 8)))

(defn opcode_bc
  "RES 7,H"
  [gb]
  (-> gb
      (operations/bit-clear-H 7)
      (operations/add-cycles 8)))

(defn opcode_bd
  "RES 7,L"
  [gb]
  (-> gb
      (operations/bit-clear-L 7)
      (operations/add-cycles 8)))

(defn opcode_be
  "RES 7,(HL)"
  [gb]
  (-> gb
      (operations/bit-clear-at-HL 7)
      (operations/add-cycles 8)))

(defn opcode_bf
  "RES 7,A"
  [gb]
  (-> gb
      (operations/bit-clear-A 7)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 set bit 0                                  ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_c0
  "SET 0,B"
  [gb]
  (-> gb
      (operations/bit-set-B 0)
      (operations/add-cycles 8)))

(defn opcode_c1
  "SET 0,C"
  [gb]
  (-> gb
      (operations/bit-set-C 0)
      (operations/add-cycles 8)))

(defn opcode_c2
  "SET 0,D"
  [gb]
  (-> gb
      (operations/bit-set-D 0)
      (operations/add-cycles 8)))

(defn opcode_c3
  "SET 0,E"
  [gb]
  (-> gb
      (operations/bit-set-E 0)
      (operations/add-cycles 8)))

(defn opcode_c4
  "SET 0,H"
  [gb]
  (-> gb
      (operations/bit-set-H 0)
      (operations/add-cycles 8)))

(defn opcode_c5
  "SET 0,L"
  [gb]
  (-> gb
      (operations/bit-set-L 0)
      (operations/add-cycles 8)))

(defn opcode_c6
  "SET 0,(HL)"
  [gb]
  (-> gb
      (operations/bit-set-at-HL 0)
      (operations/add-cycles 8)))

(defn opcode_c7
  "SET 0,A"
  [gb]
  (-> gb
      (operations/bit-set-A 0)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 set bit 1                                  ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_c8
  "SET 1,B"
  [gb]
  (-> gb
      (operations/bit-set-B 1)
      (operations/add-cycles 8)))

(defn opcode_c9
  "SET 1,C"
  [gb]
  (-> gb
      (operations/bit-set-C 1)
      (operations/add-cycles 8)))

(defn opcode_ca
  "SET 1,D"
  [gb]
  (-> gb
      (operations/bit-set-D 1)
      (operations/add-cycles 8)))

(defn opcode_cb
  "SET 1,E"
  [gb]
  (-> gb
      (operations/bit-set-E 1)
      (operations/add-cycles 8)))

(defn opcode_cc
  "SET 1,H"
  [gb]
  (-> gb
      (operations/bit-set-H 1)
      (operations/add-cycles 8)))

(defn opcode_cd
  "SET 1,L"
  [gb]
  (-> gb
      (operations/bit-set-L 1)
      (operations/add-cycles 8)))

(defn opcode_ce
  "SET 1,(HL)"
  [gb]
  (-> gb
      (operations/bit-set-at-HL 1)
      (operations/add-cycles 8)))

(defn opcode_cf
  "SET 1,A"
  [gb]
  (-> gb
      (operations/bit-set-A 1)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 set bit 2                                  ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_d0
  "SET 2,B"
  [gb]
  (-> gb
      (operations/bit-set-B 2)
      (operations/add-cycles 8)))

(defn opcode_d1
  "SET 2,C"
  [gb]
  (-> gb
      (operations/bit-set-C 2)
      (operations/add-cycles 8)))

(defn opcode_d2
  "SET 2,D"
  [gb]
  (-> gb
      (operations/bit-set-D 2)
      (operations/add-cycles 8)))

(defn opcode_d3
  "SET 2,E"
  [gb]
  (-> gb
      (operations/bit-set-E 2)
      (operations/add-cycles 8)))

(defn opcode_d4
  "SET 2,H"
  [gb]
  (-> gb
      (operations/bit-set-H 2)
      (operations/add-cycles 8)))

(defn opcode_d5
  "SET 2,L"
  [gb]
  (-> gb
      (operations/bit-set-L 2)
      (operations/add-cycles 8)))

(defn opcode_d6
  "SET 2,(HL)"
  [gb]
  (-> gb
      (operations/bit-set-at-HL 2)
      (operations/add-cycles 8)))

(defn opcode_d7
  "SET 2,A"
  [gb]
  (-> gb
      (operations/bit-set-A 2)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 set bit 3                                  ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_d8
  "SET 3,B"
  [gb]
  (-> gb
      (operations/bit-set-B 3)
      (operations/add-cycles 8)))

(defn opcode_d9
  "SET 3,C"
  [gb]
  (-> gb
      (operations/bit-set-C 3)
      (operations/add-cycles 8)))

(defn opcode_da
  "SET 3,D"
  [gb]
  (-> gb
      (operations/bit-set-D 3)
      (operations/add-cycles 8)))

(defn opcode_db
  "SET 3,E"
  [gb]
  (-> gb
      (operations/bit-set-E 3)
      (operations/add-cycles 8)))

(defn opcode_dc
  "SET 3,H"
  [gb]
  (-> gb
      (operations/bit-set-H 3)
      (operations/add-cycles 8)))

(defn opcode_dd
  "SET 3,L"
  [gb]
  (-> gb
      (operations/bit-set-L 3)
      (operations/add-cycles 8)))

(defn opcode_de
  "SET 3,(HL)"
  [gb]
  (-> gb
      (operations/bit-set-at-HL 3)
      (operations/add-cycles 8)))

(defn opcode_df
  "SET 3,A"
  [gb]
  (-> gb
      (operations/bit-set-A 3)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 set bit 4                                  ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_e0
  "SET 4,B"
  [gb]
  (-> gb
      (operations/bit-set-B 4)
      (operations/add-cycles 8)))

(defn opcode_e1
  "SET 4,C"
  [gb]
  (-> gb
      (operations/bit-set-C 4)
      (operations/add-cycles 8)))

(defn opcode_e2
  "SET 4,D"
  [gb]
  (-> gb
      (operations/bit-set-D 4)
      (operations/add-cycles 8)))

(defn opcode_e3
  "SET 4,E"
  [gb]
  (-> gb
      (operations/bit-set-E 4)
      (operations/add-cycles 8)))

(defn opcode_e4
  "SET 4,H"
  [gb]
  (-> gb
      (operations/bit-set-H 4)
      (operations/add-cycles 8)))

(defn opcode_e5
  "SET 4,L"
  [gb]
  (-> gb
      (operations/bit-set-L 4)
      (operations/add-cycles 8)))

(defn opcode_e6
  "SET 4,(HL)"
  [gb]
  (-> gb
      (operations/bit-set-at-HL 4)
      (operations/add-cycles 8)))

(defn opcode_e7
  "SET 4,A"
  [gb]
  (-> gb
      (operations/bit-set-A 4)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 set bit 5                                  ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_e8
  "SET 5,B"
  [gb]
  (-> gb
      (operations/bit-set-B 5)
      (operations/add-cycles 8)))

(defn opcode_e9
  "SET 5,C"
  [gb]
  (-> gb
      (operations/bit-set-C 5)
      (operations/add-cycles 8)))

(defn opcode_ea
  "SET 5,D"
  [gb]
  (-> gb
      (operations/bit-set-D 5)
      (operations/add-cycles 8)))

(defn opcode_eb
  "SET 5,E"
  [gb]
  (-> gb
      (operations/bit-set-E 5)
      (operations/add-cycles 8)))

(defn opcode_ec
  "SET 5,H"
  [gb]
  (-> gb
      (operations/bit-set-H 5)
      (operations/add-cycles 8)))

(defn opcode_ed
  "SET 5,L"
  [gb]
  (-> gb
      (operations/bit-set-L 5)
      (operations/add-cycles 8)))

(defn opcode_ee
  "SET 5,(HL)"
  [gb]
  (-> gb
      (operations/bit-set-at-HL 5)
      (operations/add-cycles 8)))

(defn opcode_ef
  "SET 5,A"
  [gb]
  (-> gb
      (operations/bit-set-A 5)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 set bit 6                                  ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_f0
  "SET 6,B"
  [gb]
  (-> gb
      (operations/bit-set-B 6)
      (operations/add-cycles 8)))

(defn opcode_f1
  "SET 6,C"
  [gb]
  (-> gb
      (operations/bit-set-C 6)
      (operations/add-cycles 8)))

(defn opcode_f2
  "SET 6,D"
  [gb]
  (-> gb
      (operations/bit-set-D 6)
      (operations/add-cycles 8)))

(defn opcode_f3
  "SET 6,E"
  [gb]
  (-> gb
      (operations/bit-set-E 6)
      (operations/add-cycles 8)))

(defn opcode_f4
  "SET 6,H"
  [gb]
  (-> gb
      (operations/bit-set-H 6)
      (operations/add-cycles 8)))

(defn opcode_f5
  "SET 6,L"
  [gb]
  (-> gb
      (operations/bit-set-L 6)
      (operations/add-cycles 8)))

(defn opcode_f6
  "SET 6,(HL)"
  [gb]
  (-> gb
      (operations/bit-set-at-HL 6)
      (operations/add-cycles 8)))

(defn opcode_f7
  "SET 6,A"
  [gb]
  (-> gb
      (operations/bit-set-A 6)
      (operations/add-cycles 8)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 set bit 7                                  ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_f8
  "SET 7,B"
  [gb]
  (-> gb
      (operations/bit-set-B 7)
      (operations/add-cycles 8)))

(defn opcode_f9
  "SET 7,C"
  [gb]
  (-> gb
      (operations/bit-set-C 7)
      (operations/add-cycles 8)))

(defn opcode_fa
  "SET 7,D"
  [gb]
  (-> gb
      (operations/bit-set-D 7)
      (operations/add-cycles 8)))

(defn opcode_fb
  "SET 7,E"
  [gb]
  (-> gb
      (operations/bit-set-E 7)
      (operations/add-cycles 8)))

(defn opcode_fc
  "SET 7,H"
  [gb]
  (-> gb
      (operations/bit-set-H 7)
      (operations/add-cycles 8)))

(defn opcode_fd
  "SET 7,L"
  [gb]
  (-> gb
      (operations/bit-set-L 7)
      (operations/add-cycles 8)))

(defn opcode_fe
  "SET 7,(HL)"
  [gb]
  (-> gb
      (operations/bit-set-at-HL 7)
      (operations/add-cycles 8)))

(defn opcode_ff
  "SET 7,A"
  [gb]
  (-> gb
      (operations/bit-set-A 7)
      (operations/add-cycles 8)))
