(ns ymizushi-info.handler
  (:use compojure.core)
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
  (GET "/" [] "ymizushi-info")
  (GET "/info" [id] (str "info" "this website is powered by clojure/compojure"))
  (GET "/profile" [id] (str "profile"))
  (GET "/history" [id] (str "history"))
  (GET "/downloads" [id] (str "downloads"))
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
