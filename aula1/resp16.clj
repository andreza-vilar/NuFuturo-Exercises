(defn fatorial [n]
  (if (or (= n 0) (= n 1))
    1
    (* n (fatorial (dec n)))))

(defn ler-numero []
  (println "Digite um número inteiro:")
  (Integer/parseInt (read-line)))

(defn main []
  (let [numero (ler-numero)]
    (println "O fatorial de" numero "é:" (fatorial numero))))

(main)
