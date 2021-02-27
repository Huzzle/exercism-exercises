#!/usr/bin/env bash

square=$1

if [[ "$square" == "total" ]]; then
  echo "2 ^ 64 - 1" | bc
  exit 0
fi

if (( square < 1 || square > 64 )); then
  echo "Error: invalid input"
  exit 1
fi

echo "2 ^ ($square - 1)" | bc
