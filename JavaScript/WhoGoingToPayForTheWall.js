function whoIsPaying(name){
  var res=[];
  var temp = name;
  if(name.length>2){
    res.push(name);
    res.push(name.slice(0,2));
  }
  else
    res.push(name);
  return res;
}
