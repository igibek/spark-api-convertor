spark.range(1, 100).selectExpr("id as _1")
  .selectExpr("if(_1%3!=0,0,1) as _1")
  .agg(sum("_1"))
  .collect()