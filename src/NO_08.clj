;P08 (**) Eliminate consecutive duplicates of list elements.
;If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
;Example:
;* (compress '(a a a a b c c a a d e e e e)) (A B C A D E)

(defn compress [items]
  (cond
    (empty? items) '()
    (= 1 (count items)) (list (first items))
    (= (first items) (second items)) (compress (rest items))
    :else (conj (compress (rest items)) (first items))))
(println (compress '(a a a a b c c a a d e e e e)))