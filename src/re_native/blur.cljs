(ns re-native.blur
  (:require [reagent.core :as r]
            [re-frame.core :as re]))

(def react-native-blur (js/require "react-native-blur"))
(def BlurView (.-BlurView react-native-blur))
(def VibrancyView (.-VibrancyView react-native-blur))

(assert react-native-blur)
(assert BlurView)
(assert VibrancyView)

(def blur-view (r/adapt-react-class BlurView))
(def vibrancy-view (r/adapt-react-class VibrancyView))
