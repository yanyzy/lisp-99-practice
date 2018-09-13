(ns NO_15)

;P15 (**) Replicate the elements of a list a given number of times. Example:
;* (repli '(a b c) 3)
;(A A A B B B C C C)

(defn repli [items n]
  (if (empty? items)
    '()
    (concat (repeat n (first items)) (repli  (rest items) n)))
  )

(println (repli '(a b c) 3))
