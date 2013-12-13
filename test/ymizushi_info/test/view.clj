(ns ymizushi-info.test.view
  (:require [clojure.test :refer :all]
            [ymizushi-info.view :refer :all]))

(deftest test-table-render []
  (testing "table-render"
    (let [arg {:job ["Job" "Engineer"] :interest ["Intereset" "Do it yourself."]}
          expected [:table {:class "table"}
                     [:tr 
                       [:td "Job" ] [:td "Engineer"]]
                     [:tr
                       [:td "Intereset"] [:td "Do it yourself."]]]]
      (is
        expected
        (table-render arg)))))

