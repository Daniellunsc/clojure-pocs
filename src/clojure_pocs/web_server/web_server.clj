(ns clojure-pocs.web_server.web-server
  (:gen-class)
  (:require [io.pedestal.http :as http]
            [io.pedestal.http.route.definition.table :as table]
            [clojure-pocs.web-server.routes.produto :as r.produto]))


(def rotas
  (table/table-routes [r.produto/produtos-disponiveis-rota]))

(defn create-server []
  (http/create-server {::http/routes rotas
                       ::http/type :jetty
                       ::http/port 3000}))

(defn -main []
  (http/start (create-server)))
