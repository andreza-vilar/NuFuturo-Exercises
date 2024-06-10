(defn celsius->fahrenheit [c]
  (* 9/5 c 32))

(defn celsius->kelvin [c]
  (+ c 273.15))

(defn fahrenheit->celsius [f]
  (/ (- f 32) 9/5))

(defn fahrenheit->kelvin [f]
  (celsius->kelvin (fahrenheit->celsius f)))

(defn kelvin->celsius [k]
  (- k 273.15))

(defn kelvin->fahrenheit [k]
  (celsius->fahrenheit (kelvin->celsius k)))

(defn main []
  (println "Escolha a conversão desejada:")
  (println "1. Celsius para Fahrenheit")
  (println "2. Celsius para Kelvin")
  (println "3. Fahrenheit para Celsius")
  (println "4. Fahrenheit para Kelvin")
  (println "5. Kelvin para Celsius")
  (println "6. Kelvin para Fahrenheit")
  (let [opcao (read-line)
        temperatura (read-line)]
    (case (Integer/parseInt opcao)
      1 (println "Resultado:" (celsius->fahrenheit (Double/parseDouble temperatura)))
      2 (println "Resultado:" (celsius->kelvin (Double/parseDouble temperatura)))
      3 (println "Resultado:" (fahrenheit->celsius (Double/parseDouble temperatura)))
      4 (println "Resultado:" (fahrenheit->kelvin (Double/parseDouble temperatura)))
      5 (println "Resultado:" (kelvin->celsius (Double/parseDouble temperatura)))
      6 (println "Resultado:" (kelvin->fahrenheit (Double/parseDouble temperatura))))))

(main)

