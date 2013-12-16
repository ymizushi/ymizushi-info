(ns kongo.renderer)

(def prefix "ymizushi-info.view.")

(defn make-symbol [view]
  (symbol (str prefix (namespace view)) (name view)))

(defmacro render [view param]
  `(~(make-symbol view) ~param))
