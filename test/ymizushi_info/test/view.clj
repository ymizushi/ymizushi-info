(ns ymizushi-info.test.view
  (:use clojure.test
        ring.mock.request  
        ymizushi-info.view.common))

(deftest test-head []
  (testing "hoge"
      (is (= (head) (head)))
      ))
