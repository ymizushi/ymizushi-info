(ns ymizushi-info.view.downloads
  (:use
    [hiccup.core]
    [ymizushi-info.view.common]))

(defn sp-body [params]
  (list)) 

(defn index [params]
  (html [:html (list (head) [:body (common-body (sp-body params))])]))
