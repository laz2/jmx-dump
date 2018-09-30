(defproject jmx-dump "0.8.3"
  :description "Dump JMX Metrics"
  :url "https://github.com/r4um/jmx-dump"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [org.clojure/tools.cli "0.4.1"]
                 [org.clojure/java.jmx "0.3.4"]
                 [cheshire "5.8.1"]]
  :main ^:skip-aot jmx-dump.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
