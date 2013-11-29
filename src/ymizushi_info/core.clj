(use 'clojure.test)

(deftest test-add []
  (testing "add"
    (is (= 2 (+ 1 1))))) 
(run-tests)
