(ns ymizushi-info.controller.profile
  (:require [ymizushi-info.db :refer [sel ins]]
            [clojure.tools.logging :refer (info error)]
            [ymizushi-info.model.profile :refer [ymizushi]]
            [ymizushi-info.renderer :refer [render]]))

(defn index [params]
  (render profile/index {:profile ymizushi}))
