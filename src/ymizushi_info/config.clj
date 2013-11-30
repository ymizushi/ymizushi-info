(ns ymizushi-info.config
  (:require [environ.core :refer [env]]))

(defn port [& [port]]
  (Integer. (or port (env :port) 8080)))

(defn session-secret [& [session-secret]]
  (or (env :session-secret) session-secret))
