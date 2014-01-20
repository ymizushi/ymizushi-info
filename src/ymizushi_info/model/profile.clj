(ns ymizushi-info.model.profile
  (:use compojure.core))
(import '(java.util Calendar))

(defstruct profile :hobby :interest :age :history)

(defn age [era]
  "return <int>age from <int>era"
  (- (.. (Calendar/getInstance) (get (Calendar/YEAR))) era))

(def ymizushi
  (struct profile
    ["Job"  "Software Engineer."]
    ["Interest" "Do it yourself."]
    ["Age" (age 1985)]))

