echo "Enter a number"
read a
rev=0
sd=0
or=$a
while [ $a -gt 0 ]
do 
    sd=$(($a % 10)) 
    rev=$(($rev * 10 + $sd))  
    a=$(($a / 10)) 
done
echo "Reverse of $or is $rev"