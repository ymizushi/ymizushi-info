(ns ymizushi-info.controller.blog
  (:require [ymizushi-info.db :refer [sel ins]]
            [clojure.tools.logging :refer (info error)]
            [ymizushi-info.renderer :refer [render]]))

(defn get-blogs []
  ;(ins "blogs" {:title "hoge" :description "hogehoge"})
  (try
    (info `blogs)
    (sel `blogs)
    (catch Exception sqle
      (error sqle "There was an error in calculation"))))

(defn index [params]
  (render `blog/index {:blogs (get-blogs)}))
