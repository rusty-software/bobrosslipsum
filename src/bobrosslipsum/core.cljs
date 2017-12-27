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
    :class "w3-main w3-white"
    :style {:margin-left "260px"}}
   [:div
    {:class "w3-container"
     :style {:align "center"}}
    [:h2
     {:class "w3-text-green"}
     "Bob says..."]
    [:div
     {:class "w3-display-container"}
     [:img
      {:src "bg.jpg"
       :style {:width "50%"
               :align "middle"
               :margin-bottom "-6px"}}]]
    (let [lipsum (shuffle (set quotes/lines))
          num-p (js/parseInt num-p)
          num-s (js/parseInt num-s)
          paragraphs (partition-all num-s lipsum)]
      (doall
        (for [p (take num-p paragraphs)]
          ^{:key (str "paragraph" p)}
          [:p
           (str/join " " p)])))]])

(defn re-display-lipsum []
  (let [num-p @num-paragraphs]
    (reset! num-paragraphs 0)
    (reset! num-paragraphs num-p)))

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
         {:class "w3-button w3-block w3-green"
          :data-clipboard-target target}
         label])})))

(defn inputs []
  [:div
    {:class "w3-container w3-display-container w3-padding-16"}
    [:h3 "Happy Lipsum!"]
    [:hr]
    [:p
     [:label "Number of Paragraphs"]
     [:input
      {:type "text"
       :value @num-paragraphs
       :on-change #(reset! num-paragraphs (-> % .-target .-value))}]]
    [:p
     [:label "Number of Sentences"]
     [:input
      {:type "text"
       :value @num-sentences
       :on-change #(reset! num-sentences (-> % .-target .-value))}]]
    [:p
     [:button
        {:class "w3-button w3-block w3-green"
         :on-click #(re-display-lipsum)}
        "Let's Get Crazy"]]
    [:p
     [clipboard-button "Clipboard It" "#lipsum-text"]]])

(defn page-links []
  [:div
   {:class "w3-bar-block"}
   [:a {:class "w3-bar-item w3-button w3-padding-16"
        :href "#"}
    [:i {:class "fa fa-user"}]
    " About"]
   [:a {:class "w3-bar-item w3-button w3-padding-16"
        :href "#"}
    [:i {:class "fa fa-envelope"}]
    " Contact"]]
  )

(defn sidebar []
  [:nav
   {:class "w3-sidebar w3-light-grey w3-collapse w3-top"
    :style {:z-index 3
            :width "260px"}
    :id "inputs"}
   [inputs]
   [page-links]]
  )
;; -------------------------
;; Views
(defn home-page []
  [:div
   [sidebar]
   [display-lipsum @num-paragraphs @num-sentences]])

;; -------------------------
;; Initialize app
(defn mount-root []
  (r/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
