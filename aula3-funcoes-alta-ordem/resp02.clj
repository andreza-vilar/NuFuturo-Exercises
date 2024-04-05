; letra A
(defn length [seq]
  (if (empty? seq)
    0
    (inc (length (rest seq)))))

(assert (= (length []) 0))
(assert (= (length [1 2 3 4 5]) 5))
(assert (= (length '(1 2 3 4 5)) 5))
(assert (= (length "hello") 5))
(assert (= (length #{1 2 3 4 5}) 5))


; letra B
(defn value_at [i seq]
  (if (zero? i)
    (first seq)
    (value_at (dec i) (rest seq))))



(assert (= (value_at 0 [1 2 3 4 5]) 1))
(assert (= (value_at 2 [1 2 3 4 5]) 3))
(assert (= (value_at 4 [1 2 3 4 5]) 5))
(assert (= (value_at 1 '(a b c d e)) 'b))
(assert (= (value_at 3 "hello") \l))



; letra C
(defn index [v seq]
  (letfn [(index-helper [idx seq]
            (if (empty? seq)
              -1
              (if (= v (first seq))
                idx
                (index-helper (inc idx) (rest seq)))))]
    (index-helper 0 seq)))


(assert (= (index 3 [1 2 3 4 5]) 2))
(assert (= (index 5 [1 2 3 4 5]) 4))
(assert (= (index \l "hello") 2))

