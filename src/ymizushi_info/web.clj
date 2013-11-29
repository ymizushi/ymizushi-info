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
            [environ.core :refer [env]])
  (:gen-class))

(defn wrap-error-page [handler]
  (fn [req]
    (try (handler req)
         (catch Exception e
      {:status 500
       :headers {"Content-Type" "text/html"}
       :body (slurp (io/resource "500.html"))}))))


(defn -main [& [port]]
  (let [port (Integer. (or port (env :port) 8080))
        store (cookie/cookie-store {:key (env :session-secret)})]
    (jetty/run-jetty (-> #'app
                         ((if (env :production)
                            wrap-error-page
                            trace/wrap-stacktrace))
                         (site {:session {:store store}}))
                     {:port port :join? false})))
(def ring-start 
  (site app))
