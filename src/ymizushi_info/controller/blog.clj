(ns ymizushi-info.controller.blog
  (:require [ymizushi-info.db :refer [sel ins]]
            [ymizushi-info.renderer :refer [render]]))

(defn get-blogs []
    ;(ins "blogs" {:title "hoge" :description "hogehoge"})
    (sel `blogs))

(defn index [params]
  (render `blog/index {:blogs (get-blogs)}))
