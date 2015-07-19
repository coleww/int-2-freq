# int-2-freq

Given a tonic-note, scale, and a postive-or-negative index/integer, returns the frequency for the note in that scale at that index. So for a C4 major scale, an index of 1 would be D4 and -1 would be B4. (you probably want to be using leipzig) 

also available as an [npm](https://www.npmjs.com/package/int2freq) 

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
scale can be [:minor :major :pent-maj :pent-min :blues]

returns nil if it don't know what to do.
