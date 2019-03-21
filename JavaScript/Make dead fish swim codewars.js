// Return the output array, and ignore all non-op characters
function parse( data )
{
  var arr = [];
  var res=0;
  for (j=0; j<data.length; j++)
  {
    var word = data.slice(j,j+1);
    if (word == 'i')
    {
      res +=1;
    }
    else if (word == 'd')
    {
      res -= 1;
    }
    else if (word == 's')
    {
      res *= res;
    }
    else if (word == 'o')
    {
      arr.push(res);
    }
  }
  return arr;
}
