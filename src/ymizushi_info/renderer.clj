(ns ymizushi-info.renderer
  (:require
    [ymizushi-info.view.root]
    [ymizushi-info.view.profile]
    [ymizushi-info.view.blog]
    [ymizushi-info.view.signup]))

(def prefix "ymizushi-info.view.")

(defn make-symbol [view]
  (symbol (str prefix (namespace view)) (name view)))

(defmacro render [view param]
  `(~(make-symbol view) ~param))
