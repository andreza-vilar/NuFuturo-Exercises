(defn quadrados-rec [lista]
  (if (empty? lista)
    '()
    (cons (* (first lista) (first lista))
          (quadrados-rec (rest lista)))))



(assert (= (quadrados-rec [1 2 3 4]) '(1 4 9 16)))
(assert (= (quadrados-rec [0 5 10]) '(0 25 100)))
(assert (= (quadrados-rec []) '()))
(assert (= (quadrados-rec [4]) '(16)))
(assert (= (quadrados-rec [-1 -2 -3 -4]) '(1 4 9 16)))
(assert (= (quadrados-rec [2 4 6 7 9]) '(4 16 36 49 81)))
(assert (= (quadrados-rec [-1 -2 0 1 2]) '(1 4 0 1 4)))
