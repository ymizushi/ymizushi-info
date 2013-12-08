(ns ymizushi-info.model.admin-users
  (:require [ymizushi-info.db :refer [sel ins]]
            [korma.core :refer [defentity select insert values]]))

(defn create [values]
  (ins "admin_users" values))

(defn gets [& values]
  (sel "admin_users"))
