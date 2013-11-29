(defproject ymizushi-info "1.0.0"
  :description "The websitte about ymizushi."
  :url "http://ymizushi.info"
  :license {:name "Yuta Mizushima"
            :url "http://ymizushi.info"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.1.1"]
                 [ring/ring-jetty-adapter "1.1.0"]
                 [ring/ring-devel "1.1.0"]
                 [ring-basic-authentication "1.0.1"]
                 [environ "0.2.1"]
                 [com.cemerick/drawbridge "0.0.6"]]
  :min-lein-version "2.0.0"
  :plugins [[environ/environ.lein "0.2.1"] [lein-ring "0.8.7"]]
  :hooks [environ.leiningen.hooks]
  :profiles {:production {:env {:production true}}}
  :main ymizushi-info.web
  :ring {:handler ymizushi-info.web/ring-start})
