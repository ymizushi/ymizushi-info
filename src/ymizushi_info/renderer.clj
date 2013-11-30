(ns ymizushi-info.renderer
  (:require
    [environ.core :refer [env]]
    [ymizushi-info.view.root]
    [ymizushi-info.view.downloads]
    [ymizushi-info.view.history]
    [ymizushi-info.view.profile]))

(defn render [view param]
  (eval (list view param)))
