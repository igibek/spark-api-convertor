sc.textFile("filename").filter( a => a%2==0 )
  .map( a => a+3 )
  .map(a => a%7)
  .map(a => a*(7+3))
  .reduce( (c, d) => c + d)