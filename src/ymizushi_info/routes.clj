(ns ymizushi-info.routes
  (:require [compojure.core :refer [defroutes GET PUT POST DELETE ANY context]]
            [compojure.route :as route]
            [ymizushi-info.controller :refer [control]]
            [clojure.java.io :as io]
            [ymizushi-info.renderer :refer [render]]))

(defroutes app
  (route/resources "/")
  (GET "/" [params] (render root/index params))
  (GET "/profile" [params] (control profile/index params))
  (GET "/blog" [params] (control blog/index params))
  (GET "/signup" [params] (control signup/index params))
  (POST "/signup" {params :params} (control signup/post params))
  (ANY "*" [] (route/not-found (slurp (io/resource "404.html")))))
