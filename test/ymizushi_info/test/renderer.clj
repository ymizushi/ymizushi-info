(ns ymizushi-info.test.renderer
  (:require [clojure.test :refer :all]
            [ymizushi-info.renderer :refer :all]))

(deftest test-render []
  (testing "render"
    (is
      (ymizushi-info.view.profile/index {:hoge "hoge"})
      (render profile/index {:hoge "hoge"}))))
