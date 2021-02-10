#!/usr/bin/env bash

number=$1
power=${#number}
sum=0

for (( i = 0; i < $power; i++ )); do
  sum=$(( $sum + ${number:$i:1} ** $power ))
done

[[ "$number" -eq "$sum" ]] && echo "true" || echo "false"
