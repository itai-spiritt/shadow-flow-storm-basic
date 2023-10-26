(ns org.foo.myscript)

(defn factorial [n]
  (if (zero? n)
    1
    (* n (factorial (dec n)))))

(defn main []
  (js/console.log "Main executed"))
