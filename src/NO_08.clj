(defn compress [items]
  (cond
    (empty? items) '()
    (= 1 (count items)) (list (first items))
    (= (first items) (second items)) (compress (rest items))
    :else (conj (compress (rest items)) (first items))))
(println (compress '(a a a a b c c a a d e e e e)))