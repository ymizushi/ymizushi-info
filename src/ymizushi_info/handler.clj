(ns ymizushi-info.handler
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
            [environ.core :refer [env]]))

(defn handle []
  nil)
(defn view []
  nil)

(defhand ())
