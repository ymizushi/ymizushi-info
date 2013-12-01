(ns ymizushi-info.controller.signup
  (:require [ymizushi-info.model.admin-users :refer [create gets]]
            [ymizushi-info.renderer :refer [render]]))

(defn index [params]
  (render `signup/index params))

(defn post [params]
  (let [mail-address (:mail_address params)
        password (:password params)]
    (if (and mail-address password)
      (do 
        (create {:name mail-address :mail_address mail-address :password password})
        (render `signup/post {:success true}))
      (render `signup/post {:success false}))))
