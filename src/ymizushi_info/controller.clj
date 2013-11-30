(ns ymizushi-info.controller
  (:require [ymizushi-info.db :refer [sel ins]]
            [ymizushi-info.controller.blog]))

(defn control [controller param]
  (eval (list controller param)))
