(ns ymizushi-info.web
  (:require [compojure.core :refer [defroutes GET PUT POST DELETE ANY]]
            [compojure.handler :refer [site]]
            [compojure.route :as route]
            [clojure.java.io :as io]
            [ring.middleware.stacktrace :as trace]
            [ring.middleware.session.cookie :as cookie]
            [ring.adapter.jetty :as jetty]
            [ring.middleware.basic-authentication :as basic]
            [ymizushi-info.controller.root :as root]
            [ymizushi-info.controller.profile :as profile]
            [ymizushi-info.controller.history :as history]
            [ymizushi-info.controller.downloads :as downloads]
            [ymizushi-info.domain.blog :as blog]
            [environ.core :refer [env]])
  (:gen-class))

(defn wrap-error-page [handler]
  (fn [req]
    (try (handler req)
         (catch Exception e
      {:status 500
       :headers {"Content-Type" "text/html"}
       :body (slurp (io/resource "500.html"))}))))

(defroutes blog-routes
  (GET "/entry/:year/:month/:day/:time"
    [year month day time]
      (blog/gets
        {:year year :month month :day day :time time}))
  ;(PUT "/entry/:year/:month/:day/:time"
  ;  {:year year :month month :day day :time time :params params}
  ;    (blog/edit
  ;      {:year year :month month :day day :time time :params params}))
  ;(DELETE "/entry/:year/:month/:day/:time"
  ;  {:year year :month month :day day :time time :params params}
  ;    (blog/delete
  ;      {:year year :month month :day day :time time :params params}))
  ;(POST "/entry"
  ;  {:params params}
  ;    (blog/create
  ;      {:params params}))
  ;(GET "/entry"
  ;  {:params params}
  ;    (blog/lis
  ;      {:params params}))
  )

(defroutes app
  (route/resources "/")
  (GET "/" [id] (root/action id))
  (GET "/profile" [id] (profile/action id))
  ;(context "/blog" [] blog-routes)
  (GET "/history" [id] (history/action id))
  (GET "/downloads" [id] (downloads/action id))
  (ANY "*" [] (route/not-found (slurp (io/resource "404.html")))))

(defn -main [& [port]]
  (let [port (Integer. (or port (env :port) 80))
        store (cookie/cookie-store {:key (env :session-secret)})]
    (jetty/run-jetty (-> #'app
                         ((if (env :production)
                            wrap-error-page
                            trace/wrap-stacktrace))
                         (site {:session {:store store}}))
                     {:port port :join? false})))
(def ring-start 
  (site app))
