(ns ymizushi-info.view.blog
  (:require [hiccup.core :refer :all]
            [ymizushi-info.view :refer :all]))

(defn blog-render [blogs]
    (for [blog blogs] 
      [:ul [:li (:title blog)]
           [:li (:description blog)]
           [:li (:created_at blog)]
           [:li (:updated_at blog)]]))

(defn sp-body [params]
  (list  (blog-render (:blogs params))))

(defn index [params]
  (html [:html (list (head) [:body (common-body (sp-body params))])]))
