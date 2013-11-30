(ns ymizushi-info.config
  (:require [environ.core :refer [env]]))

(def shell-env env)

(defn port [& [port]]
  (Integer. (or port (shell-env :port) 8080)))

(def session-secret 
  (if-let [session-secret (shell-env :session-secret)]
    session-secret
    (throw (Exception. "session-secret is not set"))))

(def db-url
  (let [host (:host shell-env)
        port (:port shell-env)
        db (:db shell-env)]
    (if (and host port db)
      (str "postgresql://" host ":" port "/" db)
      (str "postgresql://" "localhost" ":" "5432" "/" "ymizushi"))))

(def db
  (let [db (shell-env :db)
        user (shell-env :user)
        password (shell-env :password)]
    (if (and db user password)
      {:db db :user user :password password}
      {:db "ymizushi" :user "ymizushi" :password ""})))

