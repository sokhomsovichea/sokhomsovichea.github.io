function getGrade (s1, s2, s3) {
  var total=(s1+s2+s3)/3;
  return total>=90?'A':total>=80&&total<=90?'B':total>=70&&total<=80?'C':total>=60&&total<=70?'D':'F';}
