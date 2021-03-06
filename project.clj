(defproject org.clojars.siscia/clj-facebook-graph "0.4.0"
  :description "A Clojure client for the Facebook Graph API."
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/data.json "0.1.2"]
                 [ring "1.2.0"]
                 [clj-http "0.3.6"]
                 [clj-oauth2 "0.2.0"]
                 [compojure "1.1.5"]
                 [uri "1.1.0"]]
  :profile {:dev {:dependencies  [[ring/ring-devel "1.0.1"]
                                  [ring/ring-jetty-adapter "1.0.1"]
                                  [compojure "1.0.1"]]}}
  :aot [clj-facebook-graph.FacebookGraphException])
