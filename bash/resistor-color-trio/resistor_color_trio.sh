#!/usr/bin/env bash

prefixes=("" "kilo" "mega" "giga")

declare -A bands=(
  [black]=0
  [brown]=1
  [red]=2
  [orange]=3
  [yellow]=4
  [green]=5
  [blue]=6
  [violet]=7
  [grey]=8
  [white]=9
)

if [[ ! -v "bands[$1]" || ! -v "bands[$2]" || ! -v "bands[$3]" ]]; then
  echo "Error: Invalid input"
  exit 1
fi

prefixNumber=0
number=$(( (bands[$1] * 10 + bands[$2]) * 10 ** bands[$3] ))

if (( number > 0 )); then
  for (( i = 1; i <= 3; i++ )); do
    if (( number % (1000 ** i) == 0 )); then
      (( prefixNumber++ ))
    else
      break
    fi
  done
fi

result="$(( number / 1000 ** prefixNumber )) ${prefixes[$prefixNumber]}ohms"

echo "$result"
