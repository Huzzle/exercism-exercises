#!/usr/bin/env bash

input=$1
length=${#input}

declare -A letters=()

for ch in {A..Z}; do 
  letters[$ch]=$ch
done

declare -u ch
for (( i = 0; i < length; i++ )); do
  ch=${input:$i:1}
  if [[ "$ch" =~ [[:alpha:]] ]]; then
    unset letters["$ch"]
  fi
done

(( ${#letters[@]} == 0 )) && echo "true" || echo "false"
