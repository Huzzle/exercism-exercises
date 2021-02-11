#!/usr/bin/env bash

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

if [[ ! -v "bands[$1]" || ! -v "bands[$2]" ]]; then
  echo "Error: invalid color"
  exit 1
fi

number=$(( bands[$1] * 10 + bands[$2] ))

echo "$number"
