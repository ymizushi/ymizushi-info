(ns ymizushi-info.view.profile
  (:use
    [hiccup.core]
    [ymizushi-info.view.common]))

(defn sp-body [params]
  (list (table-render(:profile params)))) 

(defn contents [params]
  (list (common-body (sp-body params))))

(defn body [params]
  [:body (contents params)])

(defn index [params]
  (html [:html (list (head) (body params) )]))
