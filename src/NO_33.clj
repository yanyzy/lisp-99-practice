(ns NO_33
  (:use NO_32))

;P33 (*) Determine whether two positive integer numbers are coprime. Two numbers are coprime if their greatest common divisor equals 1. Example:
;* (coprime 35 64)
;T
(defn coprime [x y]
  (= 1 (gcd x y)))

(println (coprime 35 64))
