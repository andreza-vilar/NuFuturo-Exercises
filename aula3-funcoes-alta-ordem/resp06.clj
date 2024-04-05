(defn fahr-celsius [temperaturas]
  (let [fahr->celsius (fn [fahr] (/ (* (- fahr 32) 5) 9))]
    (map fahr->celsius temperaturas)))


(assert (= (fahr-celsius [32 68 104 140]) [0 20 40 60]))
(assert (= (fahr-celsius [212 32]) [100 0]))
(assert (= (fahr-celsius [-40 -22]) [-40 -30]))
(assert (= (fahr-celsius [98.6]) [37.0]))
(assert (= (fahr-celsius []) []))

