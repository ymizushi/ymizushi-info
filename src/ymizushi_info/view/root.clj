(ns ymizushi-info.view.root
  (:use hiccup.core))

(defn contents []
  (html [:html (str (head) (body) )])) 

(defn head []
  (html [:head
         [:meta {:http-equiv "Content-Type" :content "text/html" :charset "shift_jis"}]
         [:meta {:name "author" :content "ymizushi"}]
         [:meta {:name "description" :content "clojure"}]
         [:meta {:name "robots" :content "all"}]
         [:title "ymizushi.info"]
         ])) 

(defn body []
  (html [:body "body"])) 

(defn index [x]
  (contents))
