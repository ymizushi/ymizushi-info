(ns ymizushi-info.view.root
  (:use hiccup.core))

(def contents [
  ["satisfies?" "プログラミング" "ジャグリング" "音楽制作"]
  ["興味" "世の中の仕組みに興味があります"]])

(def profile [
  [:hobby ["趣味" "プログラミング" "ジャグリング" "音楽制作"]]
  [:interests ["興味" "世の中の仕組みに興味があります"]]
  ;[:age (
  ;       (.get (.getInstance Calendar)
  ;       (. (.getInstance Calendar) (. YEAR Calendar))
  ;             
  ;             
  ;             
  ;             ) ]
  ;           ; Calendar now = Calendar.getInstance().get(Calendar.YEAR);
  ;          (.getInstance now Calendar)
  ;            
  ;            ])

(defn table-render [ll]
  (html
    [:table
      (for [l ll] 
        [:tr (for [e l]
          [:td  e])])]))

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
