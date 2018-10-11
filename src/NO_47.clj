(ns NO_47)

;P47 (*) Truth tables for logical expressions (2).
;Continue problem P46 by defining and/2, or/2, etc as being operators. This allows to write the logical expression in the more natural way, as in the example: A and (A or not B). Define operator precedence as usual; i.e. as in Java.
;Example:
;* table(A,B, A and (A or not B)).
; true true true
; true fail true
; fail true fail
; fail fail fail

(defn get-result [x y]
  (and x (or x (not y))))

(defn table []
  (do
    (let [x true y true] (println x y (get-result x y)))
    (let [x true y false] (println x y (get-result x y)))
    (let [x false y true] (println x y (get-result x y)))
    (let [x false y false] (println x y (get-result x y)))))

(table)
