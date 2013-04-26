(ns ymizushi-info.view.root
  (:use
    [hiccup.core]
    [ymizushi-info.view.common]))

(defn sp-body [params]
  (list [:p "ymizushiの個人サイトです"]
        [:a {:href "http://github.com/ymizushi"} "github.com/ymizushi"] [:br]
        [:a {:href "http://facebook.com/ymizush"} "Facebook"] [:br]
        [:a {:href "http://twitter.com/ymizushi"} "Twitter"] [:br]
        [:a {:href "http://ymizushi.hateblo.jp"} "hateblo.jp"] [:br]
        )) 

(defn index [params]
  (html [:html (list (head) [:body (common-body (sp-body params))])]))
