(ns NO_35
  (:require NO_31))

;P35 (**) Determine the prime factors of a given positive integer.
;Construct a flat list containing the prime factors in ascending order. Example:
;* (prime-factors 315)
;(3 3 5 7)

(defn prime-factors [x]
  (let [items' (range 2 x)]
    (letfn [(prime-factors' [x items]
              (cond (empty? items) '()
                    (= 0 (mod x (first items))) (if (true? (NO_31/is-prime (first items)))
                                                  (cons (first items) (prime-factors' x (rest items)))
                                                  (prime-factors' x (rest items)))
                    :else (prime-factors' x (rest items))))]
      (prime-factors' x items'))))

(defn prime-factors-get [x]
  (let [items (prime-factors x)]
    (letfn [(prime-factors-get' [x items]
              (cond (= 1 (/ x (first items))) (list (first items))
                    (= 0 (mod x (first items))) (cons (first items) (prime-factors-get' (/ x (first items)) items))
                    :else (prime-factors-get' x (rest items))))]
      (prime-factors-get' x items))))

(println (prime-factors-get 315))

