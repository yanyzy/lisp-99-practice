(ns NO_20)

;P20 (*) Remove the K'th element from a list. Example:
;* (remove-at '(a b c d) 2)
; (A C D)

(defn remove-at [items n]
  (cond (empty? items) '()
        (= 1 n) (rest items)
        :else (cons (first items) (remove-at (rest items) (dec n)))))
(println (remove-at '(a b c d) 2))
