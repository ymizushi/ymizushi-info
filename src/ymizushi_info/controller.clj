(ns ymizushi-info.controller
  (:require [ymizushi-info.db :refer [sel ins]]
            [ymizushi-info.controller.blog]
            [ymizushi-info.controller.signup]
            [ymizushi-info.controller.profile]))

(def prefix "ymizushi-info.controller.")

(defn make-symbol [action]
  (symbol (str prefix (namespace action)) (name action)))

(defmacro control [action param]
  `(~(make-symbol action) ~param))
