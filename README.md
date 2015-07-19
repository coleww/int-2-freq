# int-2-freq

A Clojure version of [int2freq](https://www.npmjs.com/package/int2freq) (you probably want to be using leipzig)

## Usage



`[org.clojars.coledubs/int-2-freq "1.6.0"]`

```clojure
(require 'int-2-freq.core)

(int-2-freq 0 :A4 :minor)
; => 440.0
```

### API
`(int-2-freq index tonic scale)`

index can be positive or negative
tonic can be :A0 => :C8
:minor :major :pent-maj :pent-min :blues

returns nil if it don't know what to do.
