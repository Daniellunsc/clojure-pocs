(ns clojure-pocs.web-server.routes.produto
  (:require [clojure-pocs.web-server.controllers.produto :as c.produto]
            [clojure.data.json :as json]))

(defn listar-produtos-disponiveis
  [request]
  {:status 200
   :body (json/write-str (c.produto/listar-produtos))
   :headers {"Content-Type" "application/json"}})

(def produtos-disponiveis-rota
  ["/produtos-disponiveis" :get listar-produtos-disponiveis :route-name :listar-produtos-disponiveis])
