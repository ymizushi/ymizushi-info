(ns kongo.renderer)

(def prefix "kongo.view.")

(defn make-symbol [view]
  (symbol (str prefix (namespace view)) (name view)))

(defmacro render [view param]
  `(~(make-symbol view) ~param))
