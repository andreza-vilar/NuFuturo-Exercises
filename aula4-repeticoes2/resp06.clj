(defn soma-quadrados [lista]
  (apply + (map #(* % %) lista)))


(assert (= (soma-quadrados '(1 2 3 4 5)) 55))
(assert (= (soma-quadrados '(0 0 0 0 0)) 0))
(assert (= (soma-quadrados '(-1 -2 -3 -4 -5)) 55))
(assert (= (soma-quadrados '(1)) 1))
(assert (= (soma-quadrados '()) 0))
(assert (= (soma-quadrados '(10 20 30)) 1400))
(assert (= (soma-quadrados '(2 3 4 5 6)) 90))
(assert (= (soma-quadrados '(9 8 7 6 5 4 3 2 1)) 285))
(assert (= (soma-quadrados '(3 3 3 3 3 3 3)) 63))


