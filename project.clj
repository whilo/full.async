(defproject fullcontact/full.async "0.1.0-SNAPSHOT"
  :description "Extensions and helpers for core.async."
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo}
  :url "https://github.com/fullcontact/full-async"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/core.async "0.1.346.0-17112a-alpha"]]
  :plugins [[lein-midje "3.1.3"]]
  :lein-release {:deploy-via :clojars}
  :profiles {:dev {:dependencies [[midje "1.6.3"]]}})