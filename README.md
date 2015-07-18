# int-2-freq

A Clojure version of [int2freq](https://www.npmjs.com/package/int2freq)

## Usage

```clojure
(int-2-freq 0 :A4 :minor)
; 440.0
```

### API
`(int-2-freq index tonic scale)`

index can be positive or negative
tonic can be :A0 => :C8
:minor :major :pentMaj :pentMin :blues

returns nil if it don't know what to do.