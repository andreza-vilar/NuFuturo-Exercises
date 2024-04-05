(defn somador [operador]
  (letfn [(soma [seq]
            (loop [acc 0 s seq]
              (if (empty? s)
                acc
                (recur (+ acc (operador (first s))) (next s)))))]
    soma))

