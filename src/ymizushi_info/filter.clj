(ns ymizushi-info.filter
  (:require [compojure.core :refer [defroutes GET PUT POST DELETE ANY]]
            [compojure.route :as route]
            [ymizushi-info.controller :refer [control]]
            [clojure.java.io :as io]
            [ymizushi-info.renderer :refer [render]]))

(defn auth? [req]
  true)

