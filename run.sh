#!/bin/sh

./gradlew build

ret=$?
if [ $ret -ne 0 ]; then
  exit $ret
fi

./gradlew bootRun

rm -rf build
