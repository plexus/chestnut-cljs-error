(ns chestnut_cljs_error.test.core
  (:require-macros [cljs.test :refer (is deftest testing)])
  (:require [cljs.test]))

(deftest dummyPasses
  (is (= 1 1)))
