;P05 (*) Reverse a list.

(defn reverse' [items]
  (if (empty? items)
    '()
    (concat (reverse' (rest items)) (list (first items)))))
(println (reverse' '(a b c d)))