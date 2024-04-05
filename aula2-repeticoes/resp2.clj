(defn conta-rec [n]
  (println n)
  (conta-rec (inc n)))

(defn conta []
  (conta-rec 0))

; Chamada para iniciar a contagem
(conta)


;precisamos de duas funções para deixar o código mais modular e legível. a primeira função serve como caso base, e a segunda fica resposável por realizar a recursão, de fato, do programa
~                             
