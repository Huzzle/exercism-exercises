#!/usr/bin/env bash

name="you"

if (( $# > 0 )); then
  name=$1
fi

echo "One for $name, one for me."
