(ns kanban.components.boards-menu
  (:require [om.next :as om :refer-macros [defui]]
            [om.dom :as dom]
            [kanban.reconciler :refer [reconciler]]
            [kanban.parsing.boards :as boards]))

(defui BoardMenuItem
  static om/Ident
  (ident [this props]
    [:board/by-id (:id props)])
  static om/IQuery
  (query [this]
    [:id :name])
  Object
  (render [this]
    (dom/li nil
            (dom/a #js {:onClick #(om/transact! reconciler `[(boards/activate {:ref ~(om/get-ident this)})])}
                   (:name (om/props this))))))

(def board-menu-item (om/factory BoardMenuItem {:keyfn :id}))

(defui BoardsMenu
  Object
  (render [this]
    (dom/div #js {:className "header-menu"}
             (dom/a nil "▾ Boards")
             (dom/ul nil
                     (for [board (:boards (om/props this))]
                       (board-menu-item board))
                     (dom/li #js {:className "header-menu-separator"})
                     (dom/li nil
                             (dom/a #js {:onClick #(om/transact! reconciler `[(boards/create-board)])}
                                    "Create"))))))

(def boards-menu (om/factory BoardsMenu))
