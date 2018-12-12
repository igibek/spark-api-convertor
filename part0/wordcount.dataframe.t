spark.read.text("/data/big.txt")
  .flatMap(r => r.getString(0).split(" "))
  .map(w=>(w,1))
  .groupBy("_1").sum("_2").collect()