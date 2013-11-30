(ns ymizushi-info.config
  (:require [environ.core :refer [env]]))

(defn port [& [port]]
  (Integer. (or port (env :port) 8080)))

(defn session-secret [& [session-secret]]
  (or (env :session-secret) session-secret))

(def db-url
  (if-let [host (:host env)
           port (:port env)
           db (:db env)]
    (str "postgresql://" host ":" port "/" db)
    (str "postgresql://" "localhost" ":" "5432" "/" "minosound")))

(def db
  (let [db (env :db)
        user (env :user)
        password (env :password)]
    (if (and db user password)
      {:db db :user user :password password}
      {:db "minosound" :user "ymizushi" :password ""})))
