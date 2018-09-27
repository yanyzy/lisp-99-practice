(ns NO_25
  (:use NO_23))

;P25 (*) Generate a random permutation of the elements of a list. Example:
;* (rnd-permu '(a b c d e f)) (B A D C E F)
;Hint: Use the solution of problem P23.

(defn rnd-permu [items]
  (rnd-select items (count items)))

(println (rnd-permu '(a b c d e f)))
