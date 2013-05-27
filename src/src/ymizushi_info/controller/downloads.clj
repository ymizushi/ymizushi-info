(ns ymizushi-info.controller.downloads
   (:use
     [ymizushi-info.model.profile :only (ymizushi)]
     [ymizushi-info.view.downloads :only (index)]
     ))

(defn action [x]
  (index {:profile ymizushi}))
