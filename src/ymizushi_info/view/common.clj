(ns ymizushi-info.view.common
  (:use
    [hiccup.core]
    [hiccup.page]))

(defn head []
  [:head
    (include-css "/css/bootstrap.min.css")
    [:meta {:http-equiv "Content-Type" :content "text/html" :charset "shift_jis"}]
    [:meta {:name "author" :content "ymizushi"}]
    [:meta {:name "description" :content "clojure"}]
    [:meta {:name "robots" :content "all"}]
    [:title "ymizushi.info"]])

(defn left-body []
  (list
    [:h1  "ymizushi.info"]
    [:ul
      [:li [:a {:href "/"} "info"]]
      [:li [:a {:href "/profile"} "profile"]]
      [:li [:a {:href "history"} "history"]]
      [:li [:a {:href "downloads"} "downloads"]]
      [:li [:a {:href "history"} "history"]]]))

(defn common-body [right-body]
  (list
    (include-js "https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js")
    (include-js "/js/bootstrap.min.js")
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
