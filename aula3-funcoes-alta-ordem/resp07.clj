(require '[clojure.string :as str])

(defn ini-vogais [palavras]
  (let [vogal? (fn [c] (#{\a \e \i \o \u \A \E \I \O \U} c))]
    (->> palavras
          (filter #(vogal? (first %)))
          (map str/lower-case))))

