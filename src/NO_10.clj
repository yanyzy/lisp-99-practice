;P10 (*) Run-length encoding of a list.
(ns NO_10
  (:use NO_09))

(defn encode [items]
  (let [items' (pack items)]
      (letfn [(encode' [items']
                (if (empty? items')
                  '()
                  (cons (list (count (first items')) (first (first items'))) (encode' (rest items')))))]
        (encode' items'))))

(println (encode '(a a a a b c c a a d e e e e)))
