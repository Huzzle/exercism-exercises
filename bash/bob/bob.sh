#!/usr/bin/env bash

input=$1
question="\?[[:space:]]*$"
something="[[:alnum:]]|\?|!"

if [[ ! "$input" =~ $something ]]; then
  echo "Fine. Be that way!"
  exit 0
fi

[[ ! "$input" =~ [a-z] && "$input" =~ [A-Z] ]] && allCapitals=1 || allCapitals=0

if [[ "$input" =~ $question ]]; then
  (( allCapitals )) && echo "Calm down, I know what I'm doing!" || echo "Sure."
else
  (( allCapitals )) && echo "Whoa, chill out!" || echo "Whatever."
fi
