
(defn element-at [k items]
  (if (= k (first items))
    1
    (+ 1 (element-at k (rest items))))
  )
(print (element-at 'c '(a b c d e)))
