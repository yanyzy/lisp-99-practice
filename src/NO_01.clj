;P01 (*) Find the last box of a list. Example:
;* (my-last '(a b c d)) (D)

(defn my-last [items]
  (if (= (count items) 1)
    (first items)
    (my-last (rest items))))
(println (my-last '(a b c d)))