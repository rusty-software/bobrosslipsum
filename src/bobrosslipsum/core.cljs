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
   {:class "translucent"
    :style {:max-width "600px"
            :margin-left "auto"
            :margin-right "auto"}}
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
   [:table
    {:style {:width "600px"
             :margin "0 auto"}}
    [:thead
     [:tr
      [:th
       {:col-span 2
        :style {:text-align "center"}}
       [:h2 "Welcome to Bob Ross Lipsum"]]]]
    [:tbody
     [:tr
      [:td {:style {:text-align "right"}} "Number of paragraphs:"]
      [:td [:input {:type "text"
                    :value @num-paragraphs
                    :on-change #(reset! num-paragraphs (-> % .-target .-value))}]]]
     [:tr
      [:td {:style {:text-align "right"}} "Number of paragraphs:"]
      [:td [:input {:type "text"
             :value @num-sentences
             :on-change #(reset! num-sentences (-> % .-target .-value))}]]]]]
   (display-lipsum @num-paragraphs @num-sentences)])

;; -------------------------
;; Initialize app
(defn mount-root []
  (r/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
