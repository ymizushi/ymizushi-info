(ns ymizushi-info.controller
  (:require [ymizushi-info.db :refer [sel ins]]
            [ymizushi-info.controller.blog]
            [ymizushi-info.controller.signup]
            [ymizushi-info.controller.profile]))

(defn control [action param]
  (eval
    (list
      (symbol (str "ymizushi-info.controller." (namespace action)) (name action)) param)))
