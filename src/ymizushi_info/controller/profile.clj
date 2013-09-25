(ns ymizushi-info.controller.profile
  (:use
    [ymizushi-info.model.profile :only (ymizushi)]
    [ymizushi-info.view.profile :only (index)]))

(defn action [x]
  (index {:profile ymizushi}))
