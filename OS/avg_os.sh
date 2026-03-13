sum=0
for i in $*
do
sum=`expr $sum + $i`
done
echo "Summation of "$#" no. is: "$sum
avg=`expr $sum / $#`
echo Average=$avg