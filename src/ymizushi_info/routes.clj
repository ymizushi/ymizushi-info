(ns ymizushi-info.routes
  (:require [compojure.core :refer [defroutes GET PUT POST DELETE ANY context]]
            [compojure.route :as route]
            [ymizushi-info.controller :refer [control]]
            [clojure.java.io :as io]
            [ymizushi-info.db :refer [sel ins]]
            [ymizushi-info.renderer :refer [render]]))

(defroutes app
  (route/resources "/")
  (GET "/" [params] (render `ymizushi-info.view.root/index params))
  (GET "/profile" [params] (render `ymizushi-info.view.profile/index params))
  (GET "/history" [params] (render `ymizushi-info.view.history/index params))
  (GET "/downloads" [params] (render `ymizushi-info.view.downloads/index params))
  (GET "/blog" [params] (control `ymizushi-info.controller.blog/index params))
  (ANY "*" [] (route/not-found (slurp (io/resource "404.html")))))
