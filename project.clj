(defproject cambium/cambium.codec-cheshire "0.9.2-SNAPSHOT"
  :description "A nesting-aware codec for Cambium using Cheshire"
  :url "https://github.com/cambium-clojure/cambium.codec-cheshire"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.2.0"
  :pedantic? :abort
  :dependencies [[cheshire "5.8.0"]]
  :global-vars {*warn-on-reflection* true
                *unchecked-math* :warn-on-boxed}
  :profiles {:provided {:dependencies [[org.clojure/clojure "1.5.1"]]}
             :c15 {:dependencies [[org.clojure/clojure "1.5.1"]]}
             :c16 {:dependencies [[org.clojure/clojure "1.6.0"]]}
             :c17 {:dependencies [[org.clojure/clojure "1.7.0"]]}
             :c18 {:dependencies [[org.clojure/clojure "1.8.0"]]}
             :c19 {:dependencies [[org.clojure/clojure "1.9.0"]]}
             :dln {:jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
