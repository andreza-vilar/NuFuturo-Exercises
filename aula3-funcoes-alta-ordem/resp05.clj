(defn somador [operador]
  (fn [seq]
    (reduce + (map operador seq))))

(assert (= ((somador #(Math/pow % 3)) '(1 2 3 4 5)) 225.0))
(assert (= ((somador #(* % 2)) '(1 2 3 4 5)) 30))
(assert (= ((somador #(* % 3)) '(1 2 3 4 5)) 45))
(assert (= ((somador identity) '(1 2 3 4 5)) 15))
(assert (= ((somador (constantly 1)) '(1 2 3 4 5)) 5))

