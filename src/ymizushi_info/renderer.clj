(ns ymizushi-info.renderer
  (:require
    [ymizushi-info.view.root]
    [ymizushi-info.view.downloads]
    [ymizushi-info.view.history]
    [ymizushi-info.view.profile]))

(defn render [view param]
  (eval
    (list
      (symbol (str "ymizushi-info.view." (namespace view)) (name view)) param)))
