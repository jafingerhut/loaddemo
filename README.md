# loaddemo

A tiny demo project showing that one can create a Clojure namespace
whose contents are spread across multiple files, with the 'main' one
using clojure.core/load to load the other files.

There is no requirement to ever use this capability of Clojure, and
many applications and libraries do not do this, instead choosing to
put all of the code that is in the same namespace into a single file.


## Usage

FIXME
```
$ lein repl
nREPL server started on port 54574 on host 127.0.0.1 - nrepl://127.0.0.1:54574
REPL-y 0.4.4, nREPL 0.6.0
Clojure 1.10.1
Java HotSpot(TM) 64-Bit Server VM 1.8.0_192-b12
    Docs: (doc function-name-here)
          (find-doc "part-of-name-here")
  Source: (source function-name-here)
 Javadoc: (javadoc java-object-or-class-here)
    Exit: Control+D or (exit) or (quit)
 Results: Stored in vars *1, *2, *3, an exception in *e

user=> (require '[loaddemo.ns1 :as a])
nil
user=> (a/foo "x")
"loaddemo.ns1/foox"
user=> (a/foo2 "y")
"loaddemo.ns1/foo2y"
user=> 
```

## License

Copyright © 2020 Andy Fingerhut

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
