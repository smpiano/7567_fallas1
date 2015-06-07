(ns ^{:doc "Main of golf-proximo-tiro"
       :author "Sergio Piano"}
    golf-proximo-tiro.main
    (:require [golf-proximo-tiro.core :as core])
	(:gen-class))



(defn -main
	"Application entry point"
	[& args]
	(println (str "Hello, " (first args) "!"))
	(println (core/next-shoot-yrd-mph 175 101))
)