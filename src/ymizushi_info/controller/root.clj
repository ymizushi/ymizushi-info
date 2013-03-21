(ns ymizushi-info.controller.root
  (:require [ymizushi-info.view.root :as root]
            ))

(defn action [x]
  (root/index x)
)
