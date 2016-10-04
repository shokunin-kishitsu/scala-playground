#!/bin/sh
exec scala "$0" "$@"
!#

// some comment, whatever
println("Hello, " + args(0) + ", from the script!")

var i = 0

println("imperative:")
while (i < args.length) {
  println(args(i))
  i += 1
}

println("functional:")
args.foreach(arg => println(arg))

// and more concise
args.foreach(println)