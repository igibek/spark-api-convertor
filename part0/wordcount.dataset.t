spark.read.textFile("/data/big.txt")
  .flatMap(line => line.split(" "))
  .map(word => (word, 1))
  .groupByKey(_._1)
  .agg(reduceByKeyAggregator(_+_))
  .collect()

