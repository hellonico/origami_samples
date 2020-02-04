(defproject origami-simple "0.1-SNAPSHOT"
:test-paths ["test"]
:plugins [[lein-jupyter "0.1.16"]]
:auto {:default {:file-pattern #"\.(clj)$"}}
:main opencv4.ok
; :repositories [["vendredi" "https://repository.hellonico.info/repository/hellonico/"]]
:profiles {:dev {
  :resource-paths ["resources"]
  :dependencies [
  [seesaw "1.5.0"]]
  }}
:dependencies [
 [org.clojure/clojure "1.10.1"]
 [org.clojure/tools.cli "0.4.2"]
 [origami "4.2.0-1"]

 ; uncomment to use only the binary for your platform
 ; [origami "4.2.0-0" :exclusions [opencv/opencv-native]]
 
 ; [opencv/opencv-native "4.2.0-0" :classifier "osx_64"]
 ; [opencv/opencv-native "4.2.0-0" :classifier "linux_64"]
 ; [opencv/opencv-native "4.2.0-0" :classifier "arm"]
 ; [opencv/opencv-native "4.2.0-0" :classifier "arm"]
 ; [opencv/opencv-native "4.2.0-0" :classifier "windows_64"]

 ]
 )
