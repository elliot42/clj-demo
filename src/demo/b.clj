(ns demo.b
  (:require [demo.a :as a]))

(defn bar [y]
  (+ (a/foo 10) y))

(defn -main [& args]
  (println "Hello world!  Your result is:" (bar 42)))
