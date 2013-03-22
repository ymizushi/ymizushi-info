(ns ymizushi-info.view.root
  (:use hiccup.core))

(def profile [
  ["趣味" "プログラミング" "ジャグリング" "音楽制作"]
  ["興味" "世の中の仕組みに興味があります"]])

(defn table-render [l]
  (html [:table
         [:tr
            [:th (nth (nth l 0) 0)]
            [:th (nth (nth l 1) 0)]
          
          ]
          ]))

(defn tr-gen [l]
  [:tr [:th (nth (nth l 0) 0)] [:th (nth (nth l 1) 0)]
  ]
          

(defn body []
  (html [:body (str (table-render profile))])) 

(defn head []
  (html [:head
         [:meta {:http-equiv "Content-Type" :content "text/html" :charset "shift_jis"}]
         [:meta {:name "author" :content "ymizushi"}]
         [:meta {:name "description" :content "clojure"}]
         [:meta {:name "robots" :content "all"}]
         [:title "ymizushi.info"]
         ])) 

(defn contents []
  (html [:html (str (head) (body) )])) 

(defn index [x]
  (contents))
