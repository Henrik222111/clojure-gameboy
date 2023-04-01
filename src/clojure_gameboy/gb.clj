(ns clojure-gameboy.gb)

(def gameboy {:cycles 0
              :AF [0 0]
              :BC [0 0]
              :DE [0 0]
              :HL [0 0]
              :SP 0
              :PC 0})