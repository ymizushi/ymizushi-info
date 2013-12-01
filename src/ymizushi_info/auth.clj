(ns ymizushi-info.auth
  (:require
    [org.clojars.tnoda.simple-crypto :as simple-crypto]))

(defn encrypt [secret-message secret-key]
  (simple-crypto/encrypt secret-message secret-key))

(defn decrypt [encrypted-message secret-message]
  (simple-crypto/decrypt encrypted-message secret-message))
