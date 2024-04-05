; lê um inteiro da entrada e conta até esse valor
(let [limit (read)]
  (doseq [n (range (inc limit))]
    (println n)))
