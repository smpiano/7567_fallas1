(defproject golf-proximo-tiro "1.0.0-SNAPSHOT"
  :description "Guia de caddy"
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main golf-proximo-tiro.main
  :test-paths ["test" "test/golf-proximo-tiro/test"]
  :test-selectors {:default (fn [m] (not (or (:integration m) (:regression m))))
                   :integration :integration
                   :regression :regression}
  )