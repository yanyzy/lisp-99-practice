(ns NO_36
  (:require [NO_35 :as n35 :refer [prime-factors-get]] [NO_10]))

(defn prime-factors-mult [x]
  (let [items (n35/prime-factors-get x)]
    (NO_10/encode items)))

(println (prime-factors-mult 315))