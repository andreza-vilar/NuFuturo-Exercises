(defn calculadora [expressao]
  (eval (read-string expressao)))

(defn main []
  (println "Digite uma expressão matemática (ex: (+ 2 3)):")
  (let [expressao (read-line)]
    (try
      (println "Resultado:" (calculadora expressao))
      (catch Exception e
        (println "Erro ao avaliar a expressão:" (.getMessage e)))))

  ;; Chamada para a função main
  (main))

