(ns kongo.db
  (:require [kongo.config :as config]
            [korma.db :refer [defdb postgres]]
            [korma.core :refer [defentity select insert values]]))

(defn sel [symbol & ext]
  (select symbol))

(defn ins [table value]
  (insert table (values [value])))
