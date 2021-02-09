#!/usr/bin/env bash

input=$1
length=${#input}
acronym=""
prev=" "
current=""
isLetter="[[:alpha:]]"
isNotLetter="[^[:alpha:]]"
isNotApostrophe="[^\']"

for (( i = 0; i < $length; i++ )); do
  current=${input:$i:1}
  if [[ "$prev" =~ $isNotLetter && "$prev" =~ $isNotApostrophe && "$current" =~ $isLetter ]]; then
    acronym+=${current^^}
  fi
  prev=$current
done

echo "$acronym"
