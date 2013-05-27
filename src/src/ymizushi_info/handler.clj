(ns ymizushi-info.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]
            [ymizushi-info.controller.root :as root]
            [ymizushi-info.controller.profile :as profile]
            [ymizushi-info.controller.history :as history]
            [ymizushi-info.controller.downloads :as downloads]
            [ring.middleware reload stacktrace]
            [ring.adapter.jetty :only [run-jetty]]))

(defroutes app-routes
  (route/resources "/")
  (GET "/" [id] (root/action id))
  (GET "/profile" [id] (profile/action id))
  (GET "/history" [id] (history/action id))
  (GET "/downloads" [id] (downloads/action id))
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
