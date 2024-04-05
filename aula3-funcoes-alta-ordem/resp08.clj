(defn soma-quadrados-de-pares [seq]
  (reduce + (map #(if (even? %) (* % %) 0) seq)))



(assert (= 0 (soma-quadrados-de-pares [])))
(assert (= 0 (soma-quadrados-de-pares [1 3 5])))
(assert (= 20 (soma-quadrados-de-pares [2 4])))

