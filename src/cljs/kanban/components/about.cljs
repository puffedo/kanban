(ns kanban.components.about
  (:require [sablono.core :as html :refer-macros [html]]))

(defn about []
  (html/html
    [:div {:className "about"}
     [:h2 "What is this?"]
     [:p
      "This is an inofficial demo application built with "
      [:a {:href "https://github.com/omcljs/om"} "Om Next"]
      ". It demonstrates how Om Next can be used to write a "
      "Kanban web app with drag and drop, modal dialogs and more. "
      "Why not start by selecting a Kanban board from the menu?"]
     [:h2 "How about user interface tests?"]
     [:p
      "There aren't any for this demo. However, there is a "
      (:a {:href "cards.html"} "devcard interface")
      " exercising "
      "some of the user interface components in isolation from the demo "
      "app itself."]
     [:h2 "Where can I find the source code?"]
     [:p nil
      "The source code for this demo app is "
      [:a {:href "https://github.com/jannis/om-next-kanban-demo"}
       "available on GitHub"] ". It is licensed under GNU Affero "
      "General Public License 3.0."]
     [:p
      "For up-to-date source and documentation for Om, please refer to "
      [:a {:href "https://github.com/omcljs/om"}
       "its official "]
      "GitHub repository" "."]
     [:h2 "Notes"]
     [:ul
      [:li
       "The state and data of this app are reset on every page load or "
       "refresh."]
      [:li
       "Drag and drop may be broken on some browsers. I'm looking "
       "into a fix already."]
      [:li
       [:em
        "This app is based on an alpha version of Om Next, so the "
        "way Om works may have changed in the meantime. I also do "
        "notclaim to be using Om Next correctly in all aspects."]]]]))
