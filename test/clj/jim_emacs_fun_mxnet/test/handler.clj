(ns jim-emacs-fun-mxnet.test.handler
  (:require
    [clojure.test :refer :all]
    [ring.mock.request :refer :all]
    [jim-emacs-fun-mxnet.handler :refer :all]
    [jim-emacs-fun-mxnet.middleware.formats :as formats]
    [muuntaja.core :as m]
    [mount.core :as mount]))

(defn parse-json [body]
  (m/decode formats/instance "application/json" body))

(use-fixtures
  :once
  (fn [f]
    (mount/start #'jim-emacs-fun-mxnet.config/env
                 #'jim-emacs-fun-mxnet.handler/app-routes)
    (f)))

(deftest test-app
  (testing "main route"
    (let [response ((app) (request :get "/"))]
      (is (= 200 (:status response)))))

  (testing "not-found route"
    (let [response ((app) (request :get "/invalid"))]
      (is (= 404 (:status response))))))
