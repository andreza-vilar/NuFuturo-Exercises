(defn quadrados [lista]
  (map #(* % %) lista))


(assert (= (quadrados [1 2 3 4]) '(1 4 9 16)))
(assert (= (quadrados [0 5 10]) '(0 25 100)))
(assert (= (quadrados []) '()))
(assert (= (quadrados [4]) '(16)))
(assert (= (quadrados [2 4 6]) '(4 16 36)))
~                                              
