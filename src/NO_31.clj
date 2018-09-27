(ns NO_31)

(defn is-prime [x]
  (if (= 1 x)
    true
    (letfn [(is-prime' [y]
              (cond
                (= x y) true
                (= 0 (mod x y)) false
                :else (is-prime' (inc y))))]
      (is-prime' 2))))
(println (is-prime 7))

;(println (= 0 (mod 1 2)))