(defproject clojure-pocs "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [io.pedestal/pedestal.service       "0.5.10"]
                 [io.pedestal/pedestal.service-tools "0.5.10"] ;; Only needed for ns-watching; WAR tooling
                 [io.pedestal/pedestal.jetty         "0.5.10"]
                 [io.pedestal/pedestal.immutant      "0.5.10"]
                 [io.pedestal/pedestal.tomcat        "0.5.10"]
                 [org.clojure/data.json "2.4.0"]
                 [io.pedestal/pedestal.aws           "0.5.10" ;; API-Gateway, Lambda, and X-Ray support]
                   :repl-options {:init-ns clojure-pocs.roll-dice.core}]])
