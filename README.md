# clj-demo

Barebones demo of Clojure project setup

## Usage

1. Start the repl with `clj`

```bash
> cd clj-demo
> clj
```

2. Import your namespace, that can use other namespaces, and call functions from your namespace


```clojure
(require '[demo.b :as b])
(b/bar 4)
```
