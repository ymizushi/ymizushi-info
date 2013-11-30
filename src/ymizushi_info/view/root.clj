(ns ymizushi-info.view.root
  (:use
    [hiccup.core]
    [ymizushi-info.view.common]))

(defn sp-body [params]
  (list [:p "ymizushiの個人サイトです"]
        [:a {:href "http://about.me/ymizushi"} "about.me/ymizushi"] [:br]
        [:a {:href "http://soundcloud.com/ymizushi"} "soundcloud.com/ymizushi"] [:br]
        [:a {:href "http://github.com/ymizushi"} "github.com/ymizushi"] [:br]
        [:a {:href "http://facebook.com/ymizush"} "Facebook"] [:br]
        [:a {:href "http://twitter.com/ymizushi"} "Twitter"] [:br]
        [:p (:created_at params) (:min_time params)] [:br]
        [:a {:href "http://ymizushi.hateblo.jp"} "hateblo.jp"] [:br])) 

(defn index [params]
  (html [:html (list (head) [:body (common-body (sp-body params))])]))
