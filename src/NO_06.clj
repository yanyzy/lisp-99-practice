(defn is-palindrome [items]
  (if (= items (reverse items))
    true
    false))
(println (is-palindrome '(x a m a x)))
