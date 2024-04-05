(defn eh_triangulo [a b c]
  (let [lados [a b c]]
    (and (> (+ a b) c)
         (> (+ a c) b)
         (> (+ b c) a))))

(defn main []
  (println "Digite os três lados do triângulo separados por espaços:")
  (let [lados (map read-string (clojure.string/split (read-line) #" "))] ; lê os lados e os converte para números
    (if (= (count lados) 3) ; verifica se foram fornecidos três lados
      (if (eh_triangulo (nth lados 0) (nth lados 1) (nth lados 2))
        (println "É um triângulo válido :)")
        (println "Não é um triângulo válido :("))
      (println "forneça três lados do triângulo."))))

(main) ; chamada da função main para iniciar o teste

