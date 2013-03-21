(ns ymizushi-info.view.root
  (:use hiccup.core))

(defn header []
  ())

(defn index [x]
  (html [:span {:class "index"} "index!"]))

(defn get []
  (html [:span {:class "get"} "gets!"]))
