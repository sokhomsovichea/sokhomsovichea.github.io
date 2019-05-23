var countBits = function(n) {
  var sum = 0 ;
  while (n != 0)
  {
    if (n % 2 == 1)
    {
      sum += 1;
    }
    n = n / 2;
    n = Math.floor(n);
  }
    return sum;
};
