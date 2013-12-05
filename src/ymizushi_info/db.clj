(ns ymizushi-info.db
  (:require [ymizushi-info.config :as config]
            [korma.db :refer [defdb postgres]]
            [korma.core :refer [defentity select insert values]]))

(defdb db (postgres config/db))

(defentity admin_users)
(defentity comments)
(defentity tags)
(defentity blogs)

(defn sel [symbol & ext]
  (select symbol))

(defn ins [table value]
  (insert table (values [value])))
