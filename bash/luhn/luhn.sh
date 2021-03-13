#!/usr/bin/env bash

input=$1
length=${#input}
index=0
sum=0
digitsCount=0

for (( i = length - 1; i >= 0; i-- )); do
  digit=${input:$i:1}

  case $digit in
    [[:space:]]) ;;
    [[:digit:]])
      (( index++ ))

      if (( index % 2 == 0 )); then
        (( digit = digit * 2 ))
        (( digit > 9 )) && (( digit-=9 )) || (( digit-=0 ))
      fi

      (( digitsCount++ ))
      (( sum += digit ))
      ;;
    *) echo "false"; exit 0 ;;
  esac
done

(( digitsCount > 1 && sum % 10 == 0 )) && echo "true" || echo "false"
