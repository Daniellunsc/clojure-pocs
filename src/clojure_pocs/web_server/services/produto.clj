(ns clojure-pocs.web-server.services.produto)

(defn listar-produtos []
  [{:produto 1 :codigo 1 :alias "UM" :status :ativo}
   {:produto 2 :codigo 2 :alias "DOIS" :status :ativo}
   {:produto 3 :codigo 3 :alias "TRES" :status :ativo}
   {:produto 4 :codigo 4 :alias "QUATRO" :status :inativo}])