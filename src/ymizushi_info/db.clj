(ns ymizushi-info.db
  (:require [ymizushi-info.config :as config]
            [kongo.db :refer [defdb postgres defentity select insert values]]))

(defdb db (postgres config/db))

(defentity admin_users)
(defentity comments)
(defentity tags)
(defentity blogs)
