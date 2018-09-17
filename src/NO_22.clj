(ns NO_22)

;P22 (*) Create a list containing all integers within a given range.
;If first argument is smaller than second, produce a list in decreasing order. Example:
;* (range 4 9)
;(4 5 6 7 8 9)

(defn range' [x y]
    (cond (> x y) '()
          (< x y) (cons x (range' (inc x) y))))

(println (range' 4 9))