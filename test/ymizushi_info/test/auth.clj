(ns ymizushi-info.test.auth
  (:require
    [clojure.test :refer :all]
    [ymizushi-info.auth :refer :all]))

(deftest test-encrypt []
  (testing "encrypt"
    (let [key "abcdefghijklmabc"
          password "1234567890123abc"]
      (is (= password (decrypt (encrypt password key) key))))))

