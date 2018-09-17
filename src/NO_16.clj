(ns NO_16)

;P16 (**) Drop every N'th element from a list. Example:
;* (drop '(a b c d e f g h i k) 3)
; (A B D E G H K)

(defn drop' [items n]
  (let [n' n]
    (letfn [(drop-1 [items x]
              (cond (empty? items) '()
                    (= x 1) (rest items)
                    :else (cons (first items) (drop-1 (rest items) (dec x))))
              )]
      (drop-1 items n'))))

(println (drop' '(a b c d e f g h i k) 8))
