(ns org.foo.cljs.myscript)

(defn factorial [n]
  (if (zero? n)
    1
    (* n (factorial (dec n)))))

(js/console.log "Main executed. Factorial of 5 is : " (factorial 5))

;; (def ^:export app factorial)

(comment
  (factorial 2)
  ;
  )
