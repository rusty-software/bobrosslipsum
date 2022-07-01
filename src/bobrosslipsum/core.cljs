(ns bobrosslipsum.core
    (:require
      [reagent.core :as r]
      [reagent.dom :as rdom]
      [clojure.string :as str]
      [bobrosslipsum.quotes :as quotes]))

;; -------------------------
;; Atoms
(defonce num-paragraphs (r/atom 1))
(defonce num-sentences (r/atom 1))

(defn re-display-lipsum []
  (let [num-p @num-paragraphs]
    (reset! num-paragraphs 0)
    (reset! num-paragraphs num-p)))

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
        "Let's Get Crazy"]]])

(defn page-links []
  [:div
   {:class "w3-bar-block"}
   [:a {:class "w3-bar-item w3-button w3-padding-16"
        :href "#home-top"}
    [:i {:class "fa fa-home"}]
    " Home"]
   [:a {:class "w3-bar-item w3-button w3-padding-16"
        :href "#instructions"}
    [:i {:class "fa fa-info-circle"}]
    " Instructions"]
   [:a {:class "w3-bar-item w3-button w3-padding-16"
        :href "#sample"}
    [:i {:class "fa fa-paint-brush"}]
    " Sample"]
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
   {:id "home-top"
    :class "w3-container"}
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

(defn instructions []
  [:div
   {:id "instructions"
    :class "w3-container"}
   [:h2 "Instructions"]
   [:p
    "On loading or refreshing this page, you are shown a single sentence that is a direct quote from a Bob Ross episode.
    Enter the number of paragraphs of lipsum you want in the first textbox, and the number of sentences per paragraph in
    the second. Note that the number of sentences is not guaranteed to be exact, as some quotes are multiple sentences
    in themselves and the generator treats them as a single sentence."]
   [:p
    "The generator will do its best to display unique sentences, but there are two things to consider."
    [:ul
     [:li "There are a limited number of quotes in the database."]
     [:li "Bob Ross said similar things or repeated himself quite a bit from episode to episode."]]
    "The result of this is that some sentences are bound to sound alike if you request enough text, and you aren't
    guaranteed to get the full amount of text if you specify more than exists in the database."]
   [:p
    "If you would like a fresh set of lipsum, clicking the Let's Get Crazy button will generate new content given the
    specified number of paragraphs and sentences in the inputs. The Clipboard It button copies the generated content to
    your system's global clipboard for easy pasting into whatever endeavor needs a good shot of Bob Ross Lipsum."]])

(defn sample []
  [:div
   {:id "sample"
    :class "w3-container"}
   [:h2 "Sample"]
   [:p
    [:i
     "Although the default output when you load this page is a single sentence, the site is intended to be a fully
     functional lorem ipsum generator. The following ten paragraphs are an example of the output that might be generated
     by entering 10 as the number of paragraphs and 5 as the number of sentences."]]
   [:p
    "We'll make some big ol' huge mountains! There's too many complicated things in our life already. All you're worried
    about is this nice outside shape. Always follow the angles. Don't just cover it all up -- leave these spots!"]
    [:p "Everybody should have a friend. Just sorta make these things up in your mind, and let them drop in. Help them
    make a happy buck or two. Sort of an orangy-yellowish color. Water breaks, and it churns, and it has fun!"]
   [:p "Today's such a wonderful day, let's just make a happy little painting. Maybe I'll have a bit mountain today. You
   can do anything that you believe you can do. Get it to where you want it, and leave it alone. That's the fun part of
   this whole technique."]
   [:p "Don't over do it -- be careful. Be careful. Always start with a clean brush in a light area and work outward.
   We planned this son-of-a-gun right from the beginning. People are so excited when they see this happen. Everybody
   will see nature through different eyes."]
   [:p "Let's make some happy little clouds in our world. Be sure it's odorless or you'll be working by yourself. A half
   a hair and some air. Let's build us a little cloud. I lived in Alaska for many, many years."]
   [:p "Begin laying in just some beautiful little highlights. We'll just sort of see what happens. The round brush is
   so fun, let's go back to that. Just make little X's, and we'll put in a happy little sky. Always keep the brush
   moving."]
   [:p "If there's a secret to anything, it's practice. It's easy to add more color, but it's a son of a gun to take it away. Absolutely no limits! You know me, I get crazy. Follow these angles."]
   [:p "Now we'll fluff it. Do a cabin-ectomy. There's some little stringy ones that live down here. There's nothing worse than an angry tree. I think you'll be tickled with what you can do with something that starts out looking this bad."]
   [:p "I like the mountains -- they're my favorite. Zooooom... you've gotta make the little noises or it doesn't work right. Let's build a happy little cloud in the sky. You can do it! We are really trying to teach you a technique. We're not trying to teach you to copy."]
   [:p "Let's have some fun! If you're going to knock a wasp's nest down, you run. Big buildings are just little buildings that had a shot of vitamins. We're ready to get serious with this. We can stir this up a little bit."]])

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
   [instructions]
   [:hr]
   [sample]
   [:hr]
   [about]
   [:hr]
   [contact]
   [:hr]])

(defn home-page []
  [:div
   [:p "my butt"]
   [sidebar]
   [content]])

;; -------------------------
;; Initialize app
(defn ^:export mount-root []
  (rdom/render [home-page] (.getElementById js/document "app"))
  )

(defn init! []
  (mount-root))
