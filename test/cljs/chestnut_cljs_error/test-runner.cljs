(ns test-runner
  (:require
   [cljs.test :refer-macros [run-tests]]
   [chestnut_cljs_error.test.core]))


(enable-console-print!)

(defn runner []
  (if (cljs.test/successful?
       (run-tests
        'chestnut_cljs_error.test.core))
    0
    1))
