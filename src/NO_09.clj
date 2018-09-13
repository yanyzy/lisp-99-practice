(ns NO_09)
;P09 (**) Pack consecutive duplicates of list elements into sublists.
;If a list contains repeated elements they should be placed in separate sublists.
;Example:
;* (pack '(a a a a b c c a a d e e e e))
;((A A A A) (B) (C C) (A A) (D) (E E E E))

(defn pack [items]
  (let [items' (map list items)]
    (letfn [(pack' [items']
              (cond (empty? items') '()
                    (= (first (first items')) (first (second items'))) (pack' (cons (concat (first items') (second items'))  (drop 2 items' )  ))
                    :else (cons (first items') (pack' (rest items')))))]
      (pack' items'))))
(println (pack '(a a a a b c c a a d e e e e)))

