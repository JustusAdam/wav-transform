(ns wav-transform.core
  (:gen-class)
  (:import WavTransform))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (WavTransform/fromFile "oxp.wav" "oxp-transformed.wav"))
