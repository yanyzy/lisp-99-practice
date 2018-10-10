(ns NO_41
  (:use NO_40))

(defn goldbach-list [x y]
  (letfn [(goldbach-list' [z]
            (if (> z y)
              (println "")
              (if (= 0 (mod z 2))
                (do
                  (println (goldbach z))
                  (goldbach-list' (inc z)))
                (goldbach-list' (inc z))
                )))]
    (goldbach-list' x)))

(goldbach-list 9 20)


(defn goldbach-list-three [x y n]
  (if (< y 3)
    '()
    (letfn [(goldbach-list-three' [z]
              (if (> z y)
                '()
                (if (= 0 (mod z 2))
                  (if (< n (apply min (goldbach z)))
                    (do (println (goldbach z)) (goldbach-list-three' (inc z)))
                    (goldbach-list-three' (inc z)))
                  (goldbach-list-three' (inc z)))))]
      (goldbach-list-three' 3))))

(println (goldbach-list-three 1 2000 50))
