(ns bobrosslipsum.core
    (:require
      [reagent.core :as r]
      [clojure.string :as str]
      [bobrosslipsum.quotes :as quotes]))

;; -------------------------
;; Atoms
(defonce num-paragraphs (r/atom 1))
(defonce num-sentences (r/atom 1))

(defn display-lipsum [num-p num-s]
  [:div
   {:class "translucent"}
   (let [lipsum (shuffle (set quotes/lines))
         num-p (js/parseInt num-p)
         num-s (js/parseInt num-s)
         paragraphs (partition-all num-s lipsum)]
     (doall
       (for [p (take num-p paragraphs)]
         ^{:key (str "paragraph" p)}
         [:p
          (str/join " " p)])))])

;; -------------------------
;; Views
(defn home-page []
  [:div
   [:h2 "Welcome to Bob Ross Lipsum"]
   [:div
    {:class "translucent"}
    "Number of paragraphs: "
    [:input {:type "text"
             :value @num-paragraphs
             :on-change #(reset! num-paragraphs (-> % .-target .-value))}]]
   [:div
    {:class "translucent"}
    "Number of sentences "
    [:input {:type "text"
             :value @num-sentences
             :on-change #(reset! num-sentences (-> % .-target .-value))}]]
   (display-lipsum @num-paragraphs @num-sentences)])

;; -------------------------
;; Initialize app
(defn mount-root []
  (r/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
