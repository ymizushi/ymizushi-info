(ns ymizushi-info.view.profile
  (:use [hiccup.core]))

(defn table-render [m]
  (html
    [:table
      (for [l (vals m)] 
        [:tr (for [e l]
          [:td  e])])]))

(defn common-body [params]
  (html
    [:body
      [:table [:tr
        [:td 
          [:h1  "ymizushi.info"]
          [:a {:href "/"} "info"] [:br]
          [:a {:href "/profile"} "profile"] [:br]
          [:a {:href "history"} "history"] [:br]
          [:a {:href "downloads"} "downloads"] [:br]]
        [:td
          (str (table-render(:profile params)))]]]
      [:p "powered by clojure/compojure"] [:br] ])) 

(defn head []
  (html [:head
    [:meta {:http-equiv "Content-Type" :content "text/html" :charset "shift_jis"}]
    [:meta {:name "author" :content "ymizushi"}]
    [:meta {:name "description" :content "clojure"}]
    [:meta {:name "robots" :content "all"}]
    [:title "ymizushi.info"]]))

(defn contents [params]
  (html [:html (str (head) (common-body params) )])) 

(defn index [params]
  (contents params))

(defn sp-body [params]
  (html [:body
    (str (table-render(:profile params)))
         ])) 
