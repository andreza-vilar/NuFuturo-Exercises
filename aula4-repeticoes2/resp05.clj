(defn soma-quadrados [lista]
  (apply + (map #(* % %) lista)))




(assert (= (soma-quadrados '(1 2 3 4 5)) 55))
(assert (= (soma-quadrados '(0 0 0 0 0)) 0))
(assert (= (soma-quadrados '(-1 -2 -3 -4 -5)) 55))
(assert (= (soma-quadrados '(1)) 1))
(assert (= (soma-quadrados '()) 0))
(assert (= (soma-quadrados '(10 20 30)) 1400))


