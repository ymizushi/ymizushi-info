(defproject ymizushi-info "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.1.5"]
                 [hiccup "1.0.2"]
                 ]
  :plugins [[lein-ring "0.8.2"] [lein-daemon "0.5.4"]]
  :ring {:handler ymizushi-info.handler/-main}
  :dev-dependencies [[ring/ring-devel "0.3.11"]]
  :profiles {:dev {:dependencies [[ring-mock "0.1.3"]]}}
  :immutant {:context-path "/"}
  :daemon {:ymizushi-info {:ns ymizushi-info.handler}}
  )

