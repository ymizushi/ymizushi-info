(ns ymizushi-info.view.root
  (:use
    [hiccup.core]
    [ymizushi-info.view.common]))

(defn sp-body [params]
  (list)) 

(defn contents [params]
  (list (common-body (sp-body params))))

(defn body [params]
  [:body (contents params)])

(defn index [params]
  (html [:html (list (head) (body params) )]))
