(ns ymizushi-info.controller.signup
  (:require [ymizushi-info.model.admin-users :refer [create gets]]
            [ymizushi-info.renderer :refer [render]]))

(defn index [params]
  (render signup/index params))

(defn post [params]
  (let [mail-address (:mail_address params)
        password (:password params)]
    (if (and mail-address password)
      (let [result (create {:name mail-address :mail_address mail-address :password password})] 
        (render signup/post {:success true :result result}))
      (render signup/post {:success false}))))
