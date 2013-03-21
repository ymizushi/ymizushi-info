(ns ymizushi-info.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [ymizushi-info.controller.root :as root]
            ))

(defroutes app-routes
  (GET "/" [id] (root/action id))
  (GET "/info" [id] (str "info" "this website is powered by clojure/compojure"))
  (GET "/profile" [id] (str "profile"))
  (GET "/history" [id] (str "history"))
  (GET "/downloads" [id] (str "downloads"))
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
