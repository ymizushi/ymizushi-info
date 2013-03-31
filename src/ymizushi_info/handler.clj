(ns ymizushi-info.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [ymizushi-info.controller.root :as root]
            [ymizushi-info.controller.profile :as profile]
            [ring.middleware reload stacktrace]
            [ring.adapter.jetty :only [run-jetty]]))

(defroutes app-routes
  (GET "/" [id] (root/action id))
  (GET "/profile" [id] (profile/action id))
  (GET "/history" [id] (str "history"))
  (GET "/downloads" [id] (str "downloads"))
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
