;P07 (**) Flatten a nested list structure.
;Transform a list, possibly holding lists as elements into a `flat' list by replacing each list with its elements (recursively).
;Example:
;* (my-flatten '(a (b (c d) e))) (A B C D E)
;Hint: Use the predefined functions list and append.

(defn test-flatten [items]
  (cond
    (empty? items) '()
    (list? (first items)) (concat (test-flatten (first items)) (test-flatten (rest items)))
    :else (conj (test-flatten (rest items)) (first items))))
(println (test-flatten '(a (b (c d) e))))


