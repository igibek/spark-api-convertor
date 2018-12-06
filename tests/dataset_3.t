sc.range(1,10000000)
  .map(i=>(i%11))
  .reduceByKey((a:Int, b:Int) => a+b)
  .collect()