(ns ymizushi-info.model.admin-users
  (:require [ymizushi-info.db :refer [sel ins]]))

(defn create [values]
  (if (sel "admin_users") (ins "admin_users" values)))

(defn gets [table values]
  (sel "admin_users"))

