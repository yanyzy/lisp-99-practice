(ns NO_40
  (:use NO_31))

;P40 (**) Goldbach's conjecture.
;Goldbach's conjecture says that every positive even number greater than 2 is the sum of two prime numbers.
; Example: 28 = 5 + 23. It is one of the most famous facts in number theory that has not been proved to be correct in the general case.
; It has been numerically confirmed up to very large numbers (much larger than we can go with our Prolog system).
; Write a predicate to find the two prime numbers that sum up to a given even integer.
;Example:
;* (goldbach 28) (5 23)

(defn goldbach [x]
  (letfn [(goldbach' [y]
            (cond (> y x) '()
                  (is-prime y) (if (is-prime (- x y))
                                   (list (- x y) y)
                                   (goldbach' (inc y)))
                  :else (goldbach' (inc y))))]
    (goldbach' 2)))

(println (goldbach 2))
