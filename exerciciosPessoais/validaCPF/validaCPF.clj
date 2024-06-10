(defn validar-cpf [cpf]
  (let [cpf (map #(Integer/parseInt (str %)) (re-seq #"\d" cpf))]
    (and (= (count cpf) 11)
         (not-any? #(apply = %) (partition 3 1 cpf))
         (let [digito1 (rem (apply + (map * (range 10 1 -1) cpf)) 11)
               digito2 (rem (apply + (map * (range 11 1 -1) (conj cpf digito1))) 11)]
           (and (or (= digito1 0) (= digito1 1)) (= digito2 0))))))

(defn main []
  (println "Digite um número de CPF (apenas números):")
  (let [cpf (read-line)]
    (if (validar-cpf cpf)
      (println "CPF válido!")
      (println "CPF inválido!"))))

(main)

