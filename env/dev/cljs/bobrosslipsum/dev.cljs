(ns ^:figwheel-no-load bobrosslipsum.dev
  (:require
    [bobrosslipsum.core :as core]
    [devtools.core :as devtools]))


(enable-console-print!)

(devtools/install!)

(core/init!)
