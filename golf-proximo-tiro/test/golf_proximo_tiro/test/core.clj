(ns golf-proximo-tiro.test.core
  (:use [golf-proximo-tiro.core])
  (:use [clojure.test]))

(deftest test-irons ;; FIXME: write
  (is (= (count irons) 8))
