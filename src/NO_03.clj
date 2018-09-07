(defn element-at [n items]
  (if (= n 1)
    (first items)
    (element-at (dec n) (rest items))
    )
  )
(println (element-at 3 '(a b c d e)))
