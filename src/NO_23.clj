(ns NO_23
  (:use NO_03)
  (:use NO_16))

;P23 (**) Extract a given number of randomly selected elements from a list. The selected items shall be returned in a list.
;Example:
;* (rnd-select '(a b c d e f g h) 3)
;(E D A)
;Hint: Use the built-in random number generator and the result of problem P20.

(defn rnd-select [items n]
  (if (>= 0 n)
    '()
    (letfn [(rnd-select' [items' x]
              (let [m (rand-int (count items'))]
                (if (= 0 x)
                  '()
                  (cons (element-at (inc m) items') (rnd-select' (drop' items' (inc m)) (dec x))))))]
      (rnd-select' items n))))

(println (rnd-select '(a b c d e f g h) 3))
