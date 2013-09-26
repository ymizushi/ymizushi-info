(ns ymizushi-info.controller.fook
  (:require [ymizushi-info.view.root :as root]))

(defn action [params]
  (fook/index {:params params}))
