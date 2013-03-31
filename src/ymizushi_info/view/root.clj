(ns ymizushi-info.view.root
  (:use hiccup.core))

(defn table-render [m]
  (html
    [:table
      (for [l (vals m)] 
        [:tr (for [e l]
          [:td  e])])]))

(defn body [params]
  (html [:body (str (table-render (:profile params)))])) 

(defn head []
  (html [:head
         [:meta {:http-equiv "Content-Type" :content "text/html" :charset "shift_jis"}]
         [:meta {:name "author" :content "ymizushi"}]
         [:meta {:name "description" :content "clojure"}]
         [:meta {:name "robots" :content "all"}]
         [:title "ymizushi.info"]
         ])) 

(defn contents [params]
  (html [:html (str (head) (body params) )])) 

(defn index [params]
  (contents params))
