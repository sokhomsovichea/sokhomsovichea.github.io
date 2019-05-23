function digital_root(n) {
  var a,b;
  while(n>10){
    a=n%10;
    b=n/10;
    b=Math.floor(b);
    n=a+b;
  }
  return n;
}
