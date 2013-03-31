(ns ymizushi-info.model.profile
  (:use compojure.core))
(import '(java.util Calendar))

(defstruct profile :hobby :interest :age)

(defn age [era]
  "return <int>age from <int>era"
  (- (.. (Calendar/getInstance) (get (Calendar/YEAR))) era))

(def ymizushi (struct profile
    ["趣味"  "プログラミング、ジャグリング、音楽制作"]
    ["興味" "世の中の仕組みに興味があります"]
    ["年齢" (age 1985)]))
