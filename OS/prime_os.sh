read -p "How many prime numbers?: " num
c=0
k=0
n=2

while [ $k -lt $num ]; do
    c=0
    for i in $(seq 2 $(($n - 1))); do
        r=$(($n % $i))
        if [ $r -eq 0 ]; then
            c=$(($c + 1))
        fi
    done

    if [ $c -eq 0 ]; then
        echo $n
        k=$(($k + 1))
    fi

    n=$(($n + 1))
done