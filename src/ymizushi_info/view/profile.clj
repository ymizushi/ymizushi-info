(ns ymizushi-info.view.profile
  (:use
    [hiccup.core]
    [ymizushi-info.view.common]))

(defn sp-body [params]
  (list (table-render (:profile params)))) 

(defn index [params]
  (html [:html (list (head) [:body (common-body (sp-body params))])]))
