(ns ymizushi-info.config
  (:require [environ.core :refer [env]]))

(defn port [& [port]]
  (Integer. (or port (env :port) 8080)))

(defn session-secret [& [session-secret]]
  (or (env :session-secret) session-secret))

(def db-url
  (let [host (:host env)
        port (:port env)
        db (:db env)]
    (if (and host port db)
      (str "postgresql://" host ":" port "/" db)
      (str "postgresql://" "localhost" ":" "5432" "/" "ymizushi"))))

(def db
  (let [db (env :db)
        user (env :user)
        password (env :password)]
    (if (and db user password)
      {:db db :user user :password password}
      {:db "ymizushi" :user "ymizushi" :password ""})))
