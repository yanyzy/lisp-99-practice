;P09 (**) Pack consecutive duplicates of list elements into sublists.
(defn pack [items]
  (let [items' (map list items)]
    (letfn [(pack' [items']
              (cond (empty? items') '()
                    (= (first (first items')) (first (second items'))) (pack' (cons (concat (first items') (second items'))  (drop 2 items' )  ))
                    :else (cons   (first items') (pack' (rest items')) )))]
      (pack' items'))))
(println (pack '(a a a a b c c a a d e e e e)))


