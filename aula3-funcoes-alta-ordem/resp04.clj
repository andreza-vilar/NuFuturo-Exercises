(defn somador [op]
  (fn [sq]
    (letfn [(sum [sq acc]
              (if (empty? sq)
                acc
                (recur (rest sq) (op acc (first sq)))))]
      (sum sq 0))))

