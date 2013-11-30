(ns ymizushi-info.controller
  (:require [compojure.core :refer [defroutes GET PUT POST DELETE ANY]]
            [ymizushi-info.renderer :refer [render]]
            [environ.core :refer [env]]))

(defn control [dest param]
  (if-let [view (:view dest)]
    (render view param)))
