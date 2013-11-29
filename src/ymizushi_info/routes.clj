(ns ymizushi-info.web
  (:require [compojure.core :refer [defroutes GET PUT POST DELETE ANY]]
            [compojure.route :as route]
            [ymizushi-info.handler :refer [handle]]
            [environ.core :refer [env]]))

(defroutes app
  (route/resources "/")
  (GET "/" [id] (root/action id))
  (GET "/profile" [id] (handle :profile (fn [] nil)))
  (GET "/history" [id] (handle :history))
  (GET "/downloads" [id] (downloads/action id))
  (ANY "*" [] (route/not-found (slurp (io/resource "404.html")))))
