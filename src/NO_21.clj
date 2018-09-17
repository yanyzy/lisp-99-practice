(ns NO_21)


;P21 (*) Insert an element at a given position into a list. Example:
;* (insert-at 'alfa '(a b c d) 2) (A ALFA B C D)

(defn insert-at [s items n]
  (cond (empty? items) '()
        (= 1 n) (cons s items)
        :else (cons (first items) (insert-at s (rest items) (dec n)))))

(println (insert-at 'alfa '(a b c d) 2))