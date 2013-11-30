(ns ymizushi-info.web
  (:require [compojure.handler :refer [site]]
            [clojure.java.io :as io]
            [ring.middleware.stacktrace :as trace]
            [ring.middleware.session.cookie :as cookie]
            [ring.adapter.jetty :as jetty]
            [ymizushi-info.routes :refer [app]]
            [environ.core :refer [env]]
            [ymizushi-info.config :as config])
  (:gen-class))

(defn wrap-error-page [handler]
  (fn [req]
    (try (handler req)
         (catch Exception e
           {:status 500
            :headers {"Content-Type" "text/html"}
            :body (slurp (io/resource "500.html"))}))))

(defn -main [& [port]]
  (let [port (config/port)
        store (cookie/cookie-store {:key (config/session-secret)})]
    (jetty/run-jetty (-> #'app
                         ((if (env :production)
                            wrap-error-page
                            trace/wrap-stacktrace))
                         (site {:session {:store store}}))
                     {:port port :join? false})))
(def ring-start 
  (site app))
