
(defn test-flatten [items]
  (cond
    (empty? items) '()
    (list? (first items)) (concat (test-flatten (first items)) (test-flatten (rest items)))
    :else (conj (test-flatten (rest items)) (first items))))
(println (test-flatten '(a (b (c d) e))))


