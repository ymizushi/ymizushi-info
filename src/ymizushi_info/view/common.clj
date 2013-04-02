(ns ymizushi-info.view.common
  (:use hiccup.core))

(defn head []
  [:head
    [:meta {:http-equiv "Content-Type" :content "text/html" :charset "shift_jis"}]
    [:meta {:name "author" :content "ymizushi"}]
    [:meta {:name "description" :content "clojure"}]
    [:meta {:name "robots" :content "all"}]
    [:title "ymizushi.info"]])

(defn left-body []
  (list
    [:h1  "ymizushi.info"]
    [:a {:href "/"} "info"] [:br]
    [:a {:href "/profile"} "profile"] [:br]
    [:a {:href "history"} "history"] [:br]
    [:a {:href "downloads"} "downloads"] [:br]))

(defn common-body [right-body]
  (list
    [:table
      [:tr
        [:td (left-body)]
        [:td right-body]]]
    [:p "powered by clojure/compojure"] [:br])) 


(defn table-render [m]
  [:table
    (for [l (vals m)] 
      [:tr (for [e l]
        [:td  e])])])
