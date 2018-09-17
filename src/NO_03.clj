;P03 (*) Find the K'th element of a list.
;The first element in the list is number 1. Example:
;* (element-at '(a b c d e) 3)
;C
(ns NO_03)
(defn element-at [n items]
  (if (= n 1)
    (first items)
    (element-at (dec n) (rest items))))
(println (element-at 3 '(a b c d e)))
