; letra a
(defn length [lista]
  (if (empty? lista)
    0
    (inc (length (rest lista)))))


(assert (= 0 (length ())))
(assert (= 0 (length [])))
(assert (= 3 (length '(1 2 3))))
(assert (= 5 (length [1 2 3 4 5])))
(assert (= 0 (length "")))
(assert (= 3 (length "abc")))
(assert (= 0 (length {})))
(assert (= 5 (length [0 0 0 0 0])))




; letra b

(defn value-at [i lista]
  (if (zero? i)
    (first lista)
    (recur (dec i) (rest lista))))

(assert (= 1 (value-at 0 [1 2 3])))
(assert (= 3 (value-at 2 [1 2 3])))
(assert (= \a (value-at 0 "abc")))
(assert (= \c (value-at 2 "abc")))


; letra c

(defn index [v lista]
  (letfn [(index-helper [idx lista]
            (if (empty? lista)
              -1
              (if (= v (first lista))
                idx
                (recur (inc idx) (rest lista)))))]
    (index-helper 0 lista)))



(assert (= 0 (index 1 [1 2 3])))
(assert (= 2 (index 3 [1 2 3])))
(assert (= 0 (index \a "abc")))
(assert (= 2 (index \c "abc")))
(assert (= -1 (index :d {})))

