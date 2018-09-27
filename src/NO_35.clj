(ns NO_35
  (:use NO_31))

;P35 (**) Determine the prime factors of a given positive integer.
;Construct a flat list containing the prime factors in ascending order. Example:
;* (prime-factors 315)
;(3 3 5 7)

(defn prime-factors [x]
  (let [items' (range 1 x)]
    (letfn [(prime-factors' [x items]
              (cond (empty? items) '()
                    (= 0 (mod x (first items))) (if (true? (is-prime (first items)))
                                                  (cons (first items) (prime-factors' x (rest items)))
                                                  (prime-factors' x (rest items)))
                    :else (prime-factors' x (rest items))))]
      (prime-factors' x items'))))

(println (prime-factors 315))

