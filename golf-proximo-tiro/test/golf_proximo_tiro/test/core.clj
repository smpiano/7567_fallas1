(ns golf-proximo-tiro.test.core
  (:use [golf-proximo-tiro.core])
  (:use [clojure.test]))

(deftest test-irons
  (is (= (count irons) 13)))
