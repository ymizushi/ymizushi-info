(ns ymizushi-info.view.root
  (:use
    [hiccup.core]
    [ymizushi-info.view.common]))

(defn sp-body [params]
  (list)) 

(defn index [params]
  (html [:html (list (head) [:body (common-body (sp-body params))])]))
