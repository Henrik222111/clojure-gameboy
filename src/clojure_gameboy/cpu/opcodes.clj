(ns clojure-gameboy.cpu.opcodes
  "This namespace contains all the opcode functions for the GameBoy and a
   function to execute them."
  (:require [clojure-gameboy.cpu.operations :as operations]
            [clojure-gameboy.cpu.extended-opcodes :as extended-opcodes]))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 load to B                                  ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_40
  "LD B,B"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :B :B)
      (operations/add-cycles 4)))

(defn opcode_41
  "LD B,C"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :B :C)
      (operations/add-cycles 4)))

(defn opcode_42
  "LD B,D"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :B :D)
      (operations/add-cycles 4)))

(defn opcode_43
  "LD B,E"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :B :E)
      (operations/add-cycles 4)))

(defn opcode_44
  "LD B,H"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :B :H)
      (operations/add-cycles 4)))

(defn opcode_45
  "LD B,L"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :B :L)
      (operations/add-cycles 4)))

(defn opcode_47
  "LD B,A"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :B :A)
      (operations/add-cycles 4)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 load to C                                  ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_48
  "LD C,B"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :C :B)
      (operations/add-cycles 4)))

(defn opcode_49
  "LD C,C"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :C :C)
      (operations/add-cycles 4)))

(defn opcode_4a
  "LD C,D"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :C :D)
      (operations/add-cycles 4)))

(defn opcode_4b
  "LD C,E"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :C :E)
      (operations/add-cycles 4)))

(defn opcode_4c
  "LD C,H"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :C :H)
      (operations/add-cycles 4)))

(defn opcode_4d
  "LD C,L"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :C :L)
      (operations/add-cycles 4)))

(defn opcode_4f
  "LD C,A"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :C :A)
      (operations/add-cycles 4)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 load to D                                  ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_50
  "LD D,B"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :D :B)
      (operations/add-cycles 4)))

(defn opcode_51
  "LD D,C"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :D :C)
      (operations/add-cycles 4)))

(defn opcode_52
  "LD D,D"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :D :D)
      (operations/add-cycles 4)))

(defn opcode_53
  "LD D,E"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :D :E)
      (operations/add-cycles 4)))

(defn opcode_54
  "LD D,H"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :D :H)
      (operations/add-cycles 4)))

(defn opcode_55
  "LD D,L"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :D :L)
      (operations/add-cycles 4)))

(defn opcode_57
  "LD D,A"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :D :A)
      (operations/add-cycles 4)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 load to E                                  ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_58
  "LD E,B"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :E :B)
      (operations/add-cycles 4)))

(defn opcode_59
  "LD E,C"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :E :C)
      (operations/add-cycles 4)))

(defn opcode_5a
  "LD E,D"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :E :D)
      (operations/add-cycles 4)))

(defn opcode_5b
  "LD E,E"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :E :E)
      (operations/add-cycles 4)))

(defn opcode_5c
  "LD E,H"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :E :H)
      (operations/add-cycles 4)))

(defn opcode_5d
  "LD E,L"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :E :L)
      (operations/add-cycles 4)))

(defn opcode_5f
  "LD E,A"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :E :A)
      (operations/add-cycles 4)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 load to H                                  ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_60
  "LD H,B"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :H :B)
      (operations/add-cycles 4)))

(defn opcode_61
  "LD H,C"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :H :C)
      (operations/add-cycles 4)))

(defn opcode_62
  "LD H,D"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :H :D)
      (operations/add-cycles 4)))

(defn opcode_63
  "LD H,E"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :H :E)
      (operations/add-cycles 4)))

(defn opcode_64
  "LD H,H"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :H :H)
      (operations/add-cycles 4)))

(defn opcode_65
  "LD H,L"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :H :L)
      (operations/add-cycles 4)))

(defn opcode_67
  "LD H,A"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :H :A)
      (operations/add-cycles 4)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 load to L                                  ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_68
  "LD L,B"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :L :B)
      (operations/add-cycles 4)))

(defn opcode_69
  "LD L,C"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :L :C)
      (operations/add-cycles 4)))

(defn opcode_6a
  "LD L,D"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :L :D)
      (operations/add-cycles 4)))

(defn opcode_6b
  "LD L,E"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :L :E)
      (operations/add-cycles 4)))

(defn opcode_6c
  "LD L,H"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :L :H)
      (operations/add-cycles 4)))

(defn opcode_6d
  "LD L,L"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :L :L)
      (operations/add-cycles 4)))

(defn opcode_6f
  "LD L,A"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :L :A)
      (operations/add-cycles 4)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                                 load to A                                  ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn opcode_78
  "LD A,B"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :A :B)
      (operations/add-cycles 4)))

(defn opcode_79
  "LD A,C"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :A :C)
      (operations/add-cycles 4)))

(defn opcode_7a
  "LD A,D"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :A :D)
      (operations/add-cycles 4)))

(defn opcode_7b
  "LD A,E"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :A :E)
      (operations/add-cycles 4)))

(defn opcode_7c
  "LD A,H"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :A :H)
      (operations/add-cycles 4)))

(defn opcode_7d
  "LD A,L"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :A :L)
      (operations/add-cycles 4)))

(defn opcode_7f
  "LD A,A"
  [gb]
  (-> gb
      (operations/load_reg_from_reg :A :A)
      (operations/add-cycles 4)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;                               execute opcode                               ;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defn execute-opcode
  "This function executes in `gb` the instruction corresponding to `opcode`."
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
