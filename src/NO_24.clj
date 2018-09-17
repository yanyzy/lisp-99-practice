(ns NO_24
  (:use NO_23)
  (:use NO_22))

;P24 (*) Lotto: Draw N different random numbers from the set 1..M. The selected numbers shall be returned in a list.
;Example:
;* (lotto-select 6 49)
;(23 1 17 33 21 37)
;Hint: Combine the solutions of problems P22 and P23.

(defn lotto-select [n m]
    (rnd-select (range' 0 m) n)
  )

(println (lotto-select 6 49))
