(ns kongo.controller
  (:require [kongo.db :refer [sel ins]]))

(def prefix "ymizushi-info.controller.")

(defn make-symbol [action]
  (symbol (str prefix (namespace action)) (name action)))

(defmacro control [action param]
  `(~(make-symbol action) ~param))
