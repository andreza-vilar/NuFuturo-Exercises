(defn conta
  []
  (loop [n 0]
    (println n)
    (recur (inc n))))

(conta)

;o estouro de pilha é evitado pois a funcão foi reescrita usando a forma especial 'recur'. Isso ocorre porque o compilador intepertea como uma instrucão para voltar ao inicio do loop, eliminando o stack overflow
~                                                         
