(ns ymizushi-info.controller.blog
  (:require [ymizushi-info.db :refer [sel ins]]
            [clojure.tools.logging :refer (info error)]
            [ymizushi-info.renderer :refer [render]]))

(defn get-blogs []
  (try
    (sel "blogs")
    (catch Exception sqle
      (error sqle "There was an error in calculation"))))

(defn post-blog [params]
  (try
    (ins "blogs" {:title (:title params) :description (:description params)})
    (catch Exception sqle
      (error sqle "There was an error in calculation"))))

(defn index [params]
  (render blog/index {:blogs (get-blogs)}))

(defn post [params]
  (render blog/index {:result (post-blog params)}))
