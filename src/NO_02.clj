(defn my-but-last [items]
  (if (= (count items) 2)
    (vector (first items) (second items))
    (my-but-last (rest items))
    )
  )
(println (my-but-last '(a b c d)))
