(ns grasp.api
  (:require [clojure.spec.alpha :as s]
            [grasp.impl :as impl]))

(defn grasp
  ([path-or-paths spec] (grasp path-or-paths spec nil))
  ([path-or-paths spec opts]
   (impl/grasp path-or-paths spec (assoc opts :valid-fn s/valid?))))

(defn grasp-string
  ([string spec] (grasp-string string spec nil))
  ([string spec opts]
   (impl/grasp-string string spec (assoc opts :valid-fn s/valid?))))

(defn resolve-symbol [sym]
  (impl/resolve-symbol sym))

(defn unwrap [wrapped]
  (impl/unwrap wrapped))
