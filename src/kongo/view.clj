(ns kongo.view
  (:require
    [hiccup.core :refer :all]
    [hiccup.page :refer :all]))

(defn table-render [m]
  [:table {:class "table"}
    (for [l (vals m)] 
      [:tr (for [e l]
        [:td  e])])])
