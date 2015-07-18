(ns int-2-freq.core-test
  (:require [clojure.test :refer :all]
            [int-2-freq.core :refer :all]))

(deftest a-basic-test
  (testing "convert stuff"
    (is (= 440.0 (int-2-freq 0 :A4 :major)))))

(deftest a-positive-test
  (testing "convert stuff up"
    (is (= 493.883 (int-2-freq 1 :A4 :major)))))

(deftest a-negative-test
  (testing "convert stuff"
    (is (= 110.0 (int-2-freq -2 :C3 :major)))))

(deftest a-scaley-test
  (testing "use other scales"
    (is (= 659.255 (int-2-freq 3 :A4 :pent-min)))
    (is (= 277.183 (int-2-freq -3 :A4 :pent-maj)))
    (is (= 329.628 (int-2-freq -2 :A4 :blues)))
    (is (= 523.251 (int-2-freq 2 :A4 :minor)))))

(deftest a-rangey-test
  (testing "A0-C8"
    (is (= 27.5 (int-2-freq -1 :B0 :minor)))
    (is (= 4186.01 (int-2-freq 2 :A7 :minor)))))


(deftest failure-test
  (testing "returns nil for bad input"
    (is (nil? (int-2-freq -2 :B0 :minor)))
    (is (nil? (int-2-freq 0 :B0 :pasta-sauce)))
    (is (nil? (int-2-freq 0 :bob-dole :minor)))
    (is (nil? (int-2-freq 3 :A7 :minor)))))
