(ns ymizushi-info.controller.root
   (:require [ymizushi-info.view.root :as root])
   (:use [ymizushi-info.model.profile :only (ymizushi)]))

(defn action [x]
  (root/index {:profile ymizushi}))
