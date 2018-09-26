(ns NO_33
  (:use NO_32))

(defn coprime [x y]
  (= 1 (gcd x y))
  )

(println (coprime 35 64))
