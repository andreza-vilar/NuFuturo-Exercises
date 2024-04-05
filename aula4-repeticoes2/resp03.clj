(defn quadrados-pares [lista]
  (filter even? (quadrados lista)))


(assert (= (quadrados-pares [1 2 3 4]) '(4 16)))

