(ns demo.b
  (:require [demo.a :as a]))

(defn bar [y]
  (+ (a/foo 10) y))
