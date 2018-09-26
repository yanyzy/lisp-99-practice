(ns NO_31)

(defn is-prime [x]
  (letfn [(is-prime' [y]
            (cond
              (= x y) true
              (= 0 (mod x y)) false
              :else (is-prime' (inc y))))]
    (is-prime' 2)))
(println (is-prime 7))