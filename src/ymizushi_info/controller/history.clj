(ns ymizushi-info.controller.history
   (:use
     [ymizushi-info.model.profile :only (ymizushi)]
     [ymizushi-info.view.history :only (index)]
     ))

(defn action [x]
  (index {:profile ymizushi}))
