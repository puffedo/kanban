(ns kanban.test-runner
  (:require
   [doo.runner :refer-macros [doo-tests]]
   [kanban.core-test]))

(enable-console-print!)

(doo-tests 'kanban.core-test)
