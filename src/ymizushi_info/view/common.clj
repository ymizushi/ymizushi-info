(ns ymizushi-info.view.common
  (:use
    [hiccup.core]
    [hiccup.page]))

(defn head []
  [:head
    (include-css "/css/bootstrap.css")
    [:style "body { padding-top: 60px; /* 60px to make the container go all the way to the bottom of the topbar */ }"]
    [:meta {:http-equiv "Content-Type" :content "text/html" :charset "shift_jis"}]
    [:meta {:name "author" :content "ymizushi"}]
    [:meta {:name "description" :content "clojure"}]
    [:meta {:name "robots" :content "all"}]
    [:title "ymizushi.info"]])

(defn left-body []
  (list
    [:ul {:class "nav"}
      [:li [:a {:href "/"} "info"]]
      [:li [:a {:href "/blog"} "blog"]]
      [:li [:a {:href "/profile"} "profile"]]]))

(defn common-body [right-body]
  (list
    (include-js "https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js")
    (include-js "/js/bootstrap.min.js")
    [:div {:class "navbar navbar-inverse navbar-fixed-top"}
      [:div {:class "navbar-inner"}
        [:div {:class "container"}
          [:a {:class "brand" :href "/"} "ymizushi.info" ]
           [:div {:class "nav-collapse collapse"}
              (left-body)]]]]
    [:div {:class "container"}
      right-body
      [:center [:b "powered by clojure"]]]
      [:center [:b "2013 ymizushi"]])) 


(defn table-render [m]
  [:table {:class "table"}
    (for [l (vals m)] 
      [:tr (for [e l]
        [:td  e])])])
