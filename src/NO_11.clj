(ns NO_11
  (:use NO_10))

(defn encode-modified [items]
  (let [items' (encode items)]
    (letfn [(encode-modified' [items']
              (cond (empty? items') '()
                    (= 1 (first (first items'))) (cons (second (first items')) (encode-modified' (rest items')))
                    :else (cons (first items') (encode-modified' (rest items')))))]
      (encode-modified' items'))))

(println (encode-modified '(a a a a b c c a a d e e e e)))
