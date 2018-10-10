(ns NO_36
  (:require [NO_35 :as n35 :refer [prime-factors-get]] [NO_10]))

;P36 (**) Determine the prime factors of a given positive integer (2). Construct a list containing the prime factors and their multiplicity. Example:
;* (prime-factors-mult 315)
;((3 2) (5 1) (7 1))

(defn prime-factors-mult [x]
  (let [items (n35/prime-factors-get x)]
    (NO_10/encode items)))

(println (prime-factors-mult 315))