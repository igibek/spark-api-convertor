spark.range(1, 100)
  .map(i=>if(i%3!=0) 0 else 1)
  .reduce((a, b)=>a+b)