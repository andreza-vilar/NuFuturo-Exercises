(defn calcular-raizes [a b c]
  (let [delta (- (* b b) (* 4 a c))]
    (if (< delta 0)
      "sem raízes"
      (let [raiz1 (/ (+ (- b) (Math/sqrt delta)) (* 2 a))
            raiz2 (/ (- (- b) (Math/sqrt delta)) (* 2 a))]
        (str "Raízes: " raiz1 " e " raiz2)))))

(println "Digite os coeficientes a, b e c da equação de segundo grau separados por espaço:")
(let [entrada (clojure.string/split (read-line) #" ")]
  (let [a (Integer/parseInt (nth entrada 0))
        b (Integer/parseInt (nth entrada 1))
        c (Integer/parseInt (nth entrada 2))]
    (println (calcular-raizes a b c))))

