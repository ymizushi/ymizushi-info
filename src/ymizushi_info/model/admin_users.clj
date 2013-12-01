(ns ymizushi-info.model.admin-users
  (:require [ymizushi-info.db :refer [sel ins]]))

(defn create [values & ext]
  (ins "admin_users" values ext))

(defn gets [values & ext]
  (sel "admin_users" ext))

