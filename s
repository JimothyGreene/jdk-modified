#!/bin/bash

cd tests
../build/*/jdk/bin/javac $@.java
../build/*/jdk/bin/java $@
rm *.class