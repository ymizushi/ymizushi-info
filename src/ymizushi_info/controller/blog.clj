(ns ymizushi-info.controller.blog
  (:require [compojure.core :refer [defroutes GET PUT POST DELETE ANY]]
            [ymizushi-info.db :refer [sel ins]]
            [ymizushi-info.view.blog]
            [ymizushi-info.renderer :refer [render]]))

(defn get-blogs []
  (do
    ;(ins "blogs" {:title "hoge" :description "hogehoge"})
    (sel `blogs)))

(defn index [params]
  (render `ymizushi-info.view.blog/index {:blogs (get-blogs)}))

