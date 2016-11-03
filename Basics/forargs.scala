#!/bin/bash
exec scala "$0" "$@"
!#

for (arg <- args)
  println(arg)