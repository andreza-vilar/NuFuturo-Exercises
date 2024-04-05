(defn tipo_triangulo [a b c]
  (cond
    (and (= a b) (= b c)) :equilátero
    (or (= a b) (= b c) (= a c)) :isósceles
    :else :escaleno))

(defn ler-lados-triangulo []
  (println "Digite os três lados do triângulo, separados por espaço:")
  (let [lados (clojure.string/split (read-line) #"\s+")]
    (mapv #(Integer/parseInt %) lados)))

(defn main []
  (let [lados (ler-lados-triangulo)]
    (if (= (count lados) 3)
      (let [tipo (tipo_triangulo (first lados) (second lados) (last lados))]
        (println "O triângulo é do tipo:" tipo))
      (println "Por favor, forneça exatamente três lados."))))

(main)


