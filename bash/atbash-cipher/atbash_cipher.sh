#!/usr/bin/env bash

command=$1
text=$2
textLength=${#text}
index=-1
transformedText=""
declare -l ch

declare -A letters=(
  [0]=0 [1]=1 [2]=2 [3]=3 [4]=4 [5]=5 [6]=6 [7]=7 [8]=8 [9]=9
  [a]=z [b]=y [c]=x [d]=w [e]=v [f]=u [g]=t [h]=s [i]=r [j]=q
  [k]=p [l]=o [m]=n [n]=m [o]=l [p]=k [q]=j [r]=i [s]=h [t]=g
  [u]=f [v]=e [w]=d [x]=c [y]=b [z]=a
)

for (( i = 0; i < textLength; i++ )); do
  ch=${text:$i:1}
  if [[ ! "$ch" =~ [[:alnum:]] ]]; then
    continue
  fi

  if [[ "$command" == "encode" ]]; then
    (( index++ ))
    if (( index > 0 &&  index % 5 == 0 )); then
      transformedText+=" "
    fi
  fi

  transformedText+=${letters[$ch]}
done

echo "$transformedText"
