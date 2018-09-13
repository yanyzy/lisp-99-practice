(ns NO_18)

;P18 (**) Extract a slice from a list.
;Given two indices, I and K,
;the slice is the list containing the elements between the I'th and K'th element of the original list (both limits included).
;Start counting the elements with 1.
;Example:
;* (slice '(a b c d e f g h i k) 3 7)
; (C D E F G)

(defn slice [items x y]
  (let [items' (take y items)]
    (letfn [(slice-1 [items'-1 x]
              (if (= 0 x)
                items'-1
                (drop (dec x) items'-1)))]
      (slice-1 items' x))))
(println (slice '(a b c d e f g h i k) 3 7))
