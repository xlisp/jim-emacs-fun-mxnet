(ns jim-emacs-fun-mxnet.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [jim-emacs-fun-mxnet.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[jim-emacs-fun-mxnet started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[jim-emacs-fun-mxnet has shut down successfully]=-"))
   :middleware wrap-dev})
