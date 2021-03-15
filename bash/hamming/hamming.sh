#!/usr/bin/env bash

left=$1
right=$2

if (( $# != 2 )); then
  echo "Usage: hamming.sh <string1> <string2>"
  exit 1
fi

if (( ${#left} != ${#right} )); then
  echo "left and right strands must be of equal length"
  exit 1
fi

distance=0
length=${#left}

for (( i = 0; i < $length; i++ )); do
  if [[ "${left:$i:1}" !=  "${right:$i:1}" ]]; then
    (( distance++ ))
  fi
done

echo $distance
