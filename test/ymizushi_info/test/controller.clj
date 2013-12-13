(ns ymizushi-info.test.controller
  (:require [clojure.test :refer :all]
            [ymizushi-info.controller :refer :all]))

(deftest test-control []
  (testing "control"
    (is
      (ymizushi-info.controller.profile/index {:hoge "hoge"})
      (control profile/index {:hoge "hoge"}))))

(deftest test-make-symbol []
  (testing "make-symbol"
    (is
      `ymizushi-info.controller.profile/index
      (make-symbol `profile/index))))
