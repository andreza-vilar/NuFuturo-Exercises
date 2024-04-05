(defn calcular-raizes [a b c]
  (let [delta (- (* b b) (* 4 a c))]
    (cond
      (< delta 0) []
      (= delta 0) [(float (/ (- b) (* 2 a)))]
      :else [(float (/ (+ (- b) (Math/sqrt delta)) (* 2 a)))
             (float (/ (- (- b) (Math/sqrt delta)) (* 2 a)))])))

