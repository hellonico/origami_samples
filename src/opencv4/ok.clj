(ns opencv4.ok
	(:gen-class)
	(:require [opencv4.core :refer :all]))

(defn -main [& args]
  (println "Using OpenCV Version: " VERSION "..")
	(->
    (imread "resources/cat.jpg")
    (cvt-color! COLOR_RGB2GRAY)
    (imwrite "grey-neko.jpg")
    (println "A new gray neko has arise!")))
