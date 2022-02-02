(ns clojure-pocs.roll-dice.core)


(defn read-integer []
   (Integer/parseInt (read-line)))

(defn ask-times []
  (println "How many times do you want to roll the dice? Type only numbers")
  (read-integer))

(defn roll-dice []
  (let [result (rand-int 6)]
    (if (= 0 result)
      (roll-dice)
      result)))

(defn repeatedly-roll-dice []
  (repeatedly #(roll-dice)))

(defn interact-over [times-to-interact number-generator-fn]
  (take times-to-interact (number-generator-fn)))

(defn run-roll-dice []
  (let [x-times (ask-times)
        roll-result (interact-over x-times repeatedly-roll-dice)]
    (println "Your result:" roll-result)))

(defn -main []
  (run-roll-dice))