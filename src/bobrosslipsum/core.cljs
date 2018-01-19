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
        :href "#lipsum-text"}
    [:i {:class "fa fa-home"}]
    " Home"]
   [:a {:class "w3-bar-item w3-button w3-padding-16"
        :href "#about"}
    [:i {:class "fa fa-user"}]
    " About"]
   [:a {:class "w3-bar-item w3-button w3-padding-16"
        :href "#contact"}
    [:i {:class "fa fa-envelope"}]
    " Contact"]])

(defn sidebar []
  [:nav
   {:class "w3-sidebar w3-light-grey w3-collapse w3-top"
    :style {:z-index 3
            :width "260px"}
    :id "inputs"}
   [inputs]
   [page-links]])

(defn display-lipsum [num-p num-s]
  [:div
   {:class "w3-container"}
   [:h2
    {:class "w3-text-green"}
    "Bob says..."]
   [:div
    {:id "lipsum-text"}
    (let [lipsum (shuffle (set quotes/lines))
          num-p (js/parseInt num-p)
          num-s (js/parseInt num-s)
          paragraphs (partition-all num-s lipsum)]
      (doall
        (for [p (take num-p paragraphs)]
          ^{:key (str "paragraph" p)}
          [:p
           (str/join " " p)])))]])

(defn about []
  [:div
   {:id "about"
    :class "w3-container"}
   [:h2 "About"]
   [:p
    "For a brief time in late 2017, a light was dimmed on the Internet. That light was:"]
   [:a
    {:href "http://bobrosslipsum.com/"
     :target "_blank"}
    "http://bobrosslipsum.com/"]
   [:p
    "My team and I relied on that site's inspiration to help keep us focused and motivated throughout each and every
    workday. When it stopped working, I considered it a happy accident, and spent a weekend standing up this site as an
    alternative. It's full of quotes I gathered from re-watching episodes on youtube."]
   [:p
    "Shortly after completing initial work on the site, bobrosslipsum.com was working again, good as new. I've chosen
    to keep this site up and running for the time being, because the Internet can use all of the Bob Ross it can get!"]
   [:p
    "One last thing: this site is open-source. Have a look at the following github link if you want to see how it's
    implemented. Happy coding!"]
   [:a
    {:href "https://github.com/rusty-software/bobrosslipsum"
     :target "_blank"}
    "https://github.com/rusty-software/bobrosslipsum"]])

(defn contact []
  [:div
   {:id "contact"
    :class "w3-container"}
   [:h2 "Contact"]
   [:p
    "If you'd like more information regarding this site, drop us a line at:"]
   [:a
    {:href "mailto:info@bobrosslipsum.net"}
    "info@bobrosslipsum.net"]])

(defn content []
  [:div
   {:class "w3-main w3-white"
    :style {:margin-left "260px"}}
   (display-lipsum @num-paragraphs @num-sentences)
   [:hr]
   [about]
   [:hr]
   [contact]
   [:hr]])

(defn home-page []
  [:div
   [sidebar]
   [content]])

;; -------------------------
;; Initialize app
(defn mount-root []
  (r/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
