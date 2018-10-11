(ns NO_48)

;P48 (**) Truth tables for logical expressions (3).
;Generalize problem P47 in such a way that the logical expression may contain any number of logical variables. Define table/2 in a way that table(List,Expr) prints the truth table for the expression Expr, which contains the logical variables enumerated in List.
;Example:
;* table([A,B,C], A and (B or C) equ A and B or A and C). true true true true
;true true fail true
;true fail true true
;true fail fail true
;fail true true true
;fail true fail true
;fail fail true true
;fail fail fail true

(defn get-result [x y z]
  (and x (or y z)))

(defn table []
  (do
    (let [x true]
      (do (let [y true]
            (do (let [z true] (println x y z (get-result x y z)))
                (let [z false] (println x y z (get-result x y z)))))
          (let [y false]
            (do (let [z true] (println x y z (get-result x y z)))
                (let [z false] (println x y z (get-result x y z)))))))
    (let [x false]
      (do (let [y true]
            (do (let [z true] (println x y z (get-result x y z)))
                (let [z false] (println x y z (get-result x y z)))))
          (let [y false]
            (do (let [z true] (println x y z (get-result x y z)))
                (let [z false] (println x y z (get-result x y z)))))))))
(table)