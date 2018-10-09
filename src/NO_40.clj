(ns NO_40
  (:use NO_31))

(defn goldbach [x]
  (letfn [(goldbach' [y]
            (cond (> y x) '()
                  (is-prime y) (if (is-prime (- x y))
                                   (list (- x y) y)
                                   (goldbach' (inc y)))
                  :else (goldbach' (inc y))))]
    (goldbach' 1)))

(println (goldbach 26))
