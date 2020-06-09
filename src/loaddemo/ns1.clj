(ns loaddemo.ns1)

(defn foo [x]
  (str "loaddemo.ns1/foo" x))

(load "no_ns_form1")
