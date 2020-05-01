(ns opencv4.ok
  (:gen-class)
  (:require [opencv4.core :refer [VERSION]]))

(defn -main [& args]
 (println "Using Clojure Version: " *clojure-version*)
  (println "Using OpenCV Version: " VERSION ".."))