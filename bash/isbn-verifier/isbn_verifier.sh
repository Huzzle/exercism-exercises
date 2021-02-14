#!/usr/bin/env bash

isbn=$1
lastIndex=$(( ${#isbn} - 1 ))
multiplier=10
sum=0
digitsCount=0

for (( i = 0; i <= lastIndex; i++ )); do
  digit=${isbn:$i:1}
  if [[ "$digit" == "X" && "$i" == "$lastIndex" ]]; then
    digit=10
  fi

  if [[ "$digit" =~ [[:digit:]] ]]; then
    (( sum += digit * multiplier ))
    (( digitsCount++ ))
    (( multiplier-- ))
  fi
done

(( sum % 11 == 0 && digitsCount == 10 )) && echo "true" || echo "false"
