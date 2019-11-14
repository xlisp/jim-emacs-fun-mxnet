(ns jim-emacs-fun-mxnet.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[jim-emacs-fun-mxnet started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[jim-emacs-fun-mxnet has shut down successfully]=-"))
   :middleware identity})
