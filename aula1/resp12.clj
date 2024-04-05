(defn eh-bissexto? [ano]
  (or (and (= (rem ano 4) 0) (not= (rem ano 100) 0))
      (= (rem ano 400) 0)))

(defn main []
  (println "Digite um ano para verificar se é bissexto:")
  (let [ano (Integer/parseInt (read-line))]
    (if (eh-bissexto? ano)
      (println "O ano" ano "é bissexto.")
      (println "O ano" ano "não é bissexto."))))

(main)


