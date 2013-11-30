(ns ymizushi-info.routes
  (:require [compojure.core :refer [defroutes GET PUT POST DELETE ANY context]]
            [compojure.route :as route]
            [ymizushi-info.controller :refer [control]]
            [clojure.java.io :as io]
            [ymizushi-info.renderer :refer [render]]))

(defroutes app
  (route/resources "/")
  (GET "/" [params] (render `root/index params))
  (GET "/profile" [params] (render `profile/index params))
  (GET "/history" [params] (render `history/index params))
  (GET "/downloads" [params] (render `downloads/index params))
  (GET "/blog" [params] (control `blog/index params))
  (ANY "*" [] (route/not-found (slurp (io/resource "404.html")))))
