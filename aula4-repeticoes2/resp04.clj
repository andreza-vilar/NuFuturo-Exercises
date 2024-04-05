(defn quadrados-pares-rec [n]
  (loop [i 1
         result ()]
    (if (> i n)
      result
      (recur (inc i)
             (if (even? (* i i))
               (cons (* i i) result)
               result)))))



(assert (= (quadrados-pares-rec 10) [4 16 36 64 100]))
(assert (= (quadrados-pares-rec 15) [4 16 36 64 100 144 196 256]))
(assert (= (quadrados-pares-rec 0) '()))
(assert (= (quadrados-pares-rec 1) '()))

