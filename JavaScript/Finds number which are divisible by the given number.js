function divisibleBy(numbers, divisor){
var i,divisible=[],j=0;
for(i=0;i<numbers.length;i++){
if(numbers[i]%divisor==0){
divisible[j]=numbers[i];
j++;
}
}
return divisible;
}
