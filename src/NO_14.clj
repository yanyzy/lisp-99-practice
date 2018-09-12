(ns NO_14)

;P14 (*) Duplicate the elements of a list.
;Example:
;* (dupli '(a b c c d))
;(A A B B C C C C D D)

(defn dupli [items]
  (if (empty? items)
    '()
    (concat (repeat 2 (first items)) (dupli (rest items)))))
(println (dupli '(a b c c d)))