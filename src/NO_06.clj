;P06 (*) Find out whether a list is a palindrome.
;A palindrome can be read forward or backward; e.g. (x a m a x).

(defn is-palindrome [items]
  (if (= items (reverse items))
    true
    false))
(println (is-palindrome '(x a m a x)))
