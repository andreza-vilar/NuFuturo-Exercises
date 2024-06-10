(defn contar-palavras [caminho-arquivo]
  (with-open [arquivo (clojure.java.io/reader caminho-arquivo)]
    (->> arquivo
         (line-seq)
         (mapcat #(clojure.string/split % #"\s+"))
         (frequencies))))

(defn main []
  (println "Digite o caminho para o arquivo de texto:")
  (let [caminho-arquivo (read-line)
        contagem (contar-palavras caminho-arquivo)]
    (doseq [[palavra frequencia] contagem]
      (println (str "A palavra '" palavra "' aparece " frequencia " vez(es).")))))

(main)

