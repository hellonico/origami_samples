(defproject origami-simple "0.1-SNAPSHOT"
:test-paths ["test"]
:resource-paths ["rsc"]
:plugins [[hellonico/lein-gorilla "0.4.1"][lein-auto "0.1.3"]]
:auto {:default {:file-pattern #"\.(clj)$"}}
:main opencv4.ok
:repositories [["vendredi" "https://repository.hellonico.info/repository/hellonico/"]]
:aliases {"notebook" ["gorilla" ":ip" "0.0.0.0" ":port" "10000"]}
:profiles {:dev {
  :resource-paths ["resources"]
  :dependencies [
  ; used for proto repl
  [org.clojure/tools.nrepl "0.2.11"]
  ; proto repl
  [proto-repl "0.3.1"]
  ; use to start a gorilla repl
  [hellonico/gorilla-repl "0.4.1"]
  [seesaw "1.4.5"]]
  }}
:dependencies [
 [org.clojure/clojure "1.9.0"]
 [org.clojure/tools.cli "0.3.5"]
 [origami "4.0.0-beta6"]]
 )
