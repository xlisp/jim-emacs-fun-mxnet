(ns jim-emacs-fun-mxnet.app
  (:require [jim-emacs-fun-mxnet.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
