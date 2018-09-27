(ns NO_32)

;P32 (**) Determine the greatest common divisor of two positive integer numbers. Use Euclid's algorithm.
;Example:
;* (gcd 36 63) 9
;
(defn gcd [x y]
  (if (= 0 (mod (max x y) (min x y)))
    (min x y)
    (gcd (min x y) (mod (max x y) (min x y)))))

(println (gcd 63 36))
