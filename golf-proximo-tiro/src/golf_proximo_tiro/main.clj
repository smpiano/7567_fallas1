(ns ^{:doc "Main of golf-proximo-tiro"
       :author "Sergio Piano"}
    golf-proximo-tiro.main
    (:require [golf-proximo-tiro.core :as core])
	(:gen-class))



(defn -main
	"Application entry point"
	[& args]
	(with-open [rdr (clojure.java.io/reader "src/golf_proximo_tiro/banner.txt")]
 		(doseq [line (line-seq rdr)]
			(println line)))
	(println "\n\nBienvenido al Caddy master!\n\nIngrese la distancia en (yardas): \n")
	(def dist (read-line))
	(println (str " -> La distancia ingresada es de: " dist " yardas."))
	(println "\nIngrese la velocidad del viento en (mph): \n")
	(def wind (read-line))
	(println (str " -> La velocidad del viento ingresada es de: " wind " mph."))
	(println "\nTu palo recomendado sería el: \n")
	(def dist (Integer. (re-find #"\d+" dist)))
	(def wind (Integer. (re-find #"\d+" wind)))
	(println (core/next-shoot-yrd-mph dist wind))
)