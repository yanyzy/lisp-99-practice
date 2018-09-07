
(defn my-last [items]
  (if (= (count items) 1)
    (first items)
    (my-last (rest items))
    )
  )
(println (my-last '(a b c d)))