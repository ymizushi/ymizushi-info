(ns ymizushi-info.routes
  (:require [compojure.core :refer [defroutes GET PUT POST DELETE ANY]]
            [compojure.route :as route]
            [ymizushi-info.controller :refer [control]]
            [clojure.java.io :as io]
            [clojure.java.io :as io]
            [ymizushi-info.renderer :refer [render]]))

(defroutes app
  (route/resources "/")
  (GET "/" [params] (control {:view `ymizushi-info.view.root/index} params))
  (GET "/profile" [params] (control {:view `ymizushi-info.view.profile/index} params))
  (GET "/history" [params] (control {:view `ymizushi-info.view.history/index} params))
  (GET "/downloads" [params] (control {:view `ymizushi-info.view.downloads/index} params))
  (context "/admin" [] admin-routes)
  (ANY "*" [] (route/not-found (slurp (io/resource "404.html")))))

(defroutes admin-routes
  (GET "/" {params :params} (control {:view `ymizushi-info.view.admin/index} params))
  (GET "/login" {params :params} (control {:view `ymizushi-info.view.admin/login} params))
  (GET "/users" {params :params} (control {:view `ymizushi-info.view.admin/users} params)))

(defn auth [req normal]
  (if (auth? req)
    normal
    (control {:view `ymizushi-info.view.admin/error} params)))
