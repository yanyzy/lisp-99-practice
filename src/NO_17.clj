(ns NO_17)

;P17 (*) Split a list into two parts; the length of the first part is given. Do not use any predefined predicates.
;Example:
;* (split '(a b c d e f g h i k) 3) ( (A B C) (D E F G H I K))

(defn split [items n]
  (cons (take n items) (list (drop n items)) )
  )

(println (split '(a b c d e f g h i k) 3))
