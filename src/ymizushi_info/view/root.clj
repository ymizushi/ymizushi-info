(ns ymizushi-info.view.root
  (:use
    [hiccup.core]
    [ymizushi-info.view.common]))

(defn sp-body [params]
  (list [:p "ymizushiの個人サイトです"]
        [:ul
          [:li [:a {:href "http://about.me/ymizushi"} "about.me/ymizushi"]]
          [:li [:a {:href "http://soundcloud.com/ymizushi"} "soundcloud.com/ymizushi"]]
          [:li [:a {:href "http://github.com/ymizushi"} "github.com/ymizushi"]]
          [:li [:a {:href "http://facebook.com/ymizush"} "Facebook"]]
          [:li [:a {:href "http://twitter.com/ymizushi"} "Twitter"]]
          [:li [:a {:href "http://ymizushi.hateblo.jp"} "hateblo.jp"]]])) 

(defn index [params]
  (html [:html (list (head) [:body (common-body (sp-body params))])]))
