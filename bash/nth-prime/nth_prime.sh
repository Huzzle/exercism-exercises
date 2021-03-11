#!/usr/bin/env bash

declare -A numbers=()
nth=$1
start=2
primes=()
(( capacity = nth * 2 ))

if (( nth < 1 )); then
  echo "invalid input"
  exit 1
fi

while :; do
  for (( i = start; i <= capacity; i++ )); do
    numbers[$i]="true"
  done

  for (( i = 2; i * i <= capacity; i++ )); do
    if [[ "${numbers[$i]}" == "true" ]]; then
      for (( j = i * i; j <= capacity; j+=i )); do
        numbers[$j]="false"
      done
    fi
  done

  for (( i = start; i <= capacity; i++ )); do
    if [[ "${numbers[$i]}" == "true" ]]; then
      primes+=($i)
    fi
  done

  if (( ${#primes[@]} >= nth ));then
    echo "${primes[nth - 1]}"
    exit 0
  fi

  (( start = capacity + 1 ))
  (( capacity *= 2 ))
done
