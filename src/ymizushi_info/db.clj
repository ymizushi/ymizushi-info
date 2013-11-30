(ns ymizushi-info.db
  (:require [compojure.core :refer [defroutes GET PUT POST DELETE ANY context]]
            [compojure.route :as route]
            [ymizushi-info.controller :refer [control]]
            [clojure.java.io :as io]
            [clojure.java.io :as io]
            [ymizushi-info.renderer :refer [render]]
            [ymizushi-info.config :as config]
            [korma.db :refer [defdb postgres]]
            [korma.core :refer [defentity select]]))

(defdb db
  (postgres config/db))

(defentity users)

(defn sel [symbol]
  (select symbol))
