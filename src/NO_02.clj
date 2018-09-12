;P02 (*) Find the last but one box of a list. Example:
;* (my-but-last '(a b c d)) (C D)

(defn my-but-last [items]
  (if (= (count items) 2)
    (vector (first items) (second items))
    (my-but-last (rest items))
    )
  )
(println (my-but-last '(a b c d)))
