# int-2-freq

A Clojure version of [int2freq](https://www.npmjs.com/package/int2freq) (you probably want to be using leipzig)

## Install

[![Clojars Project](http://clojars.org/org.clojars.coledubs/int-2-freq/latest-version.svg)](http://clojars.org/org.clojars.coledubs/int-2-freq)

## Usage

```clojure
(require 'int-2-freq.core)

(int-2-freq 0 :A4 :major)
; => 440.0
(int-2-freq 3 :A4 :pent-min)
; => 659.255
(int-2-freq -2 :A4 :minor)
; => 523.251
```

### API
`(int-2-freq index tonic scale)`

index can be positive or negative
tonic can be :A0 => :C8
:minor :major :pent-maj :pent-min :blues

returns nil if it don't know what to do.
