function findSum(n) {
var ans=0;
for (var i=0;i<=n;i++)
{
  if (i%3==0 || i%5==0)
  {
    ans+=i;
  }
}
return ans;
return 0;
}
