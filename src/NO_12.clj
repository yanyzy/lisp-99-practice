(ns NO_12)

;P12 (**) Decode a run-length encoded list.
;Given a run-length code list generated as specified in problem P11. Construct its uncompressed version.

(defn decode [items]
  (cond (empty? items) '()
        (list? (first items)) (cons (repeat (first (first items)) (second (first items))) (decode (rest items)))
        :else (cons (first items) (decode (rest items)))))

(println (decode '((4 A) B (2 C) (2 A) D (4 E))))