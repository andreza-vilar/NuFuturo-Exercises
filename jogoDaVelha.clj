(defn create-board []
  (vec (repeat 3 (vec (repeat 3 " ")))))

(defn get-indexes [move]
  (let [row (Integer/parseInt (str (first move)))
        col (Integer/parseInt (str (last move)))]
    [(dec row) (dec col)]))

(defn in-range? [num start end]
  (<= start num end))

(defn numeric? [move]
  (every? #(Character/isDigit %) move))

(defn get-columns [board]
  (apply map vector board))

(defn get-primary-diagonal [board]
  (for [i (range 3)] (get-in board [i i])))

(defn get-secondary-diagonal [board]
  (for [i (range 3)] (get-in board [i (- 3 (inc i))])))

(defn get-all-victory-possibilities [board]
  (concat board
          (get-columns board)
          [(get-primary-diagonal board) (get-secondary-diagonal board)]))

(defn victory [possibility last-player]
  (every? #(= % last-player) possibility))

(defn board-full? [board]
  (every? #(not= " " %) (apply concat board)))

(defn get-elem [board indexes]
  (get-in board indexes))

(defn show-board [board]
  (println "   ")
  (doseq [i (range 3)]
    (println (str "   " (clojure.string/join " │ " (nth board i))))
    (if (< i 2)
      (println "  ───┼───┼─── ")))
  (println "   "))

(defn get-input [msg]
  (println msg)
  (read-line))

(defn valid-move? [board indexes]
  (and (every? #(in-range? % 0 2) indexes)
       (= " " (get-in board indexes))))

(defn valid-input? [input]
  (and (not (empty? input)) (= 2 (count input)) (numeric? input)))

(defn make-move [board player move]
  (let [new-board (vec (map vec board))]
    (assoc-in new-board move player)))

(defn winner? [board player]
  (some #(victory % player) (get-all-victory-possibilities board)))

(defn choose-next-player [current-player]
  (if (= current-player "X") "O" "X"))

(defn choose-next-board [victory is-draw new-board]
  (if (or victory is-draw) (create-board) new-board))

(defn update-scores [victory is-draw scores player]
  (if victory
    (assoc scores player (inc (get scores player)))
    (if is-draw
      (assoc scores "Draw" (inc (get scores "Draw")))
      scores)))

(defn print-winner [player]
  (println (str "\nPlayer " player " is the winner!")))

(defn print-draw []
  (println "\nNo one wins..."))

(defn print-scores [scores]
  (println "--- Scores ---")
  (doseq [[player score] scores]
    (println (str player ": " score)))
  (println "--------------"))

(defn wanna-play? [victory is-draw]
  (if (or victory is-draw)
    (loop []
      (let [response (.toLowerCase (get-input "Wanna play another game? (y/n)"))]
        (cond
          (= response "y") true
          (= response "n") false
          :else (do (println "Invalid input. Please enter 'y' to play again or 'n' to quit.") (recur)))))
    true))

(defn should-quit? [move]
  (= "q!" (apply str move)))

(defn -main []
  (loop [board (create-board)
         player "X"
         scores {"X" 0 "O" 0 "Draw" 0}
         playing true]
    (if playing
      (do
        (show-board board)
        (let [move (vec (get-input (format "Move for player %s: " player)))]
          (if (should-quit? move)
            (do
              (println "Exiting the game...")
              (recur board player scores false))
          (if (valid-input? move)
            (let [indexes (get-indexes move)]
             (if (valid-move? board indexes)
              (let [new-board (make-move board player indexes)
                    victory (winner? new-board player)
                    is-draw (and (not victory) (board-full? new-board))
                    next-player (choose-next-player player)
                    next-board (choose-next-board victory is-draw new-board)
                    next-scores (update-scores victory is-draw scores player)]
                (cond
                  victory (do (show-board new-board) (print-winner player))
                  is-draw (do (show-board new-board) (print-draw)))
                (recur next-board next-player next-scores (wanna-play? victory is-draw)))
              (do
                (print "Invalid move\n")
                (recur board player scores playing))))
            (do
              (print "Invalid input\n")
              (recur board player scores playing))))))
      (print-scores scores))))

(-main)
