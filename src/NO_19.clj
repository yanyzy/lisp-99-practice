(ns NO_19)

;P19 (**) Rotate a list N places to the left. Examples:
;* (rotate '(a b c d e f g h) 3) (D E F G H A B C)
;* (rotate '(a b c d e f g h) -2) (G H A B C D E F)
;Hint: Use the predefined functions length and append, as well as the result of problem P17.

(defn rotate [items n]
  (cond (= 0 n) (items)
        (< n 0)
        (concat (drop (+ n (count items)) items) (take (+ n (count items)) items))
        :else (concat (drop n items) (take n items))))

(println (rotate '(a b c d e f g h) -2))
(println (rotate '(a b c d e f g h) 3))
