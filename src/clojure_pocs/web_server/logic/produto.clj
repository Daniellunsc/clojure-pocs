(ns clojure-pocs.web-server.logic.produto)

(defn produto-ativo?
  [produto]
  (not (= (:status produto) :inativo)))

(defn remover-produtos-inativos
  [produtos]
  (filter produto-ativo? produtos))