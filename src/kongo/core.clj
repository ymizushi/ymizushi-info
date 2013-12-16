(ns kongo.core)

(defn debug-print [x]
  `(let [res# ~x]
     (println "?=" res#)
     res#))
