#!/usr/bin/env bash

output=""
input=$1
length=${#input}

for (( i = $length - 1; i >= 0; i-- )); do
  output+=${input:$i:1}
done

echo "$output"
