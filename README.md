# clj-demo

Barebones demo of Clojure project setup

## Usage via `main`

Invoke your namespace with `main` via `clj -m <namespace>` command-line tool

```bash
> cd clj-demo
> clj -m demo.b
```

## Usage via REPL

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
