(ns clojure-pocs.web-server.controllers.produto
  (:require [clojure-pocs.web-server.services.produto :as s.produto]
            [clojure-pocs.web-server.logic.produto :as l.produto]))

(defn listar-produtos []
  (let [produtos (s.produto/listar-produtos)]
    (l.produto/remover-produtos-inativos produtos)))
