(ns ymizushi-info.view.blog
  (:use
    [hiccup.core]
    [ymizushi-info.view.common]))

(defn sp-body [params]
  (list  (:title (first (:blogs params))))) 

(defn index [params]
  (html [:html (list (head) [:body (common-body (sp-body params))])]))
