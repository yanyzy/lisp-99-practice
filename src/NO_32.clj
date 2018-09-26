(ns NO_32)

(defn gcd [x y]
  (if (= 0 (mod (max x y) (min x y)))
    (min x y)
    (gcd (min x y) (mod (max x y) (min x y)))
    )
  )

(println (gcd 1997 615))
