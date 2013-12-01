(ns ymizushi-info.view.signup
  (:require [hiccup.core :refer :all]
            [ymizushi-info.view.common :refer :all]
            [hiccup.form :refer :all]))

(defn signup-form [] 
  (form-to [:post "/signup"]
      [:table 
        [:tr [:td "mail_address"] [:td (text-area "mail_address")]]
        [:tr [:td "password"] [:td (text-area "password")]]]
      [:p (submit-button "Submit")]))

(defn body-get [params]
  (list (if (:success params)
          "登録に成功しました"
          "登録に失敗しました")
        (signup-form)))

(defn body-post [params]
  (list (if (:success params)
          "登録に成功しました"
          "登録に失敗しました") params))

(defn index [params]
  (html [:html (list (head) [:body (common-body (body-get params))])]))

(defn post [params]
  (html [:html (list (head) [:body (common-body (body-post params))])]))
