(ns ymizushi-info.db
  (:require [ymizushi-info.config :as config]
            [korma.db :refer [defdb postgres]]
            [korma.core :refer [defentity select insert values]]))

(defdb db
  (postgres config/db))

(defentity admin_users)
(defentity comments)
(defentity tags)
(defentity blogs)

(defmacro sel [symbol & ext]
  `(select ~symbol ~@ext))

(defmacro ins [table & ext]
  `(insert ~table ~@ext))
