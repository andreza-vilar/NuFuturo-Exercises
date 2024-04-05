(defn msg-rec [msg]
  (println msg)
  (msg-rec msg))

(let [input (read-line)]
  (msg-rec input))


; vai ocorrer um erro de stack overflow. Pois não há condição de parada para a recursão. Portanto, o programa continuará chamando a função com a mesma mensagem repetidamente até que a pilha de chamadas fique cheia, resultando em um estouro de pilha

