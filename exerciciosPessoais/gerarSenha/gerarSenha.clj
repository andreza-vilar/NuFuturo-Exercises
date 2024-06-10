(defn gerar-senha [tamanho]
  (let [caracteres "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+-="]
    (apply str (repeatedly tamanho #(rand-nth caracteres)))))

(defn main []
  (println "Digite o tamanho da senha desejada:")
  (let [tamanho (read-line)]
    (println "Senha gerada:" (gerar-senha (Integer/parseInt tamanho)))))

(main)

