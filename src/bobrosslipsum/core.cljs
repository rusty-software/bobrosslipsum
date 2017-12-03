(ns bobrosslipsum.core
    (:require
      [reagent.core :as r]
      [clojure.string :as str]
      [cljsjs.clipboard :as clipboard]
      [bobrosslipsum.quotes :as quotes]))

;; -------------------------
;; Atoms
(defonce num-paragraphs (r/atom 1))
(defonce num-sentences (r/atom 1))

(defn display-lipsum [num-p num-s]
  [:div
   {:id "lipsum-text"
    :class "translucent"
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

(defn clipboard-button [label target]
  (let [clipboard-atom (atom nil)]
    (r/create-class
     {:display-name "clipboard-button"
      :component-did-mount
      #(let [clipboard (new js/Clipboard (r/dom-node %))]
         (reset! clipboard-atom clipboard))
      :component-will-unmount
      #(when-not (nil? @clipboard-atom)
         (.destroy @clipboard-atom)
         (reset! clipboard-atom nil))
      :reagent-render
      (fn []
        [:button.clipboard
         {:data-clipboard-target target}
         label])})))

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
             :on-change #(reset! num-sentences (-> % .-target .-value))}]]]
     [:tr
      [:td
       {:col-span 2
        :style {:text-align "center"}}
       [clipboard-button "Copy to Happy Little Clipboard" "#lipsum-text"]]]]]
   (display-lipsum @num-paragraphs @num-sentences)
   ])

;; -------------------------
;; Initialize app
(defn mount-root []
  (r/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
