### 一、算子

* Transformations 

```scala
map(func)
filter(func)
flatMap(func)
mapPartitions(func)
mapPartitionsWithIndex(func)
sample(withReplacement, fraction, seed)
union(otherDataset)
intersection(otherDataset)
distinct([numTasks]))
groupByKey([numTasks])
reduceByKey(func, [numTasks]) 
aggregateByKey(zeroValue)(seqOp, combOp, [numTasks]) 
sortByKey([ascending], [numTasks]) 
join(otherDataset, [numTasks]) 
cogroup(otherDataset, [numTasks]) 
cartesian(otherDataset)
pipe(command, [envVars])
coalesce(numPartitions) 
repartition(numPartitions)
repartitionAndSortWithinPartitions(partitioner)
```

* Actions

```scala
reduce(func)
collect()
count()
first()
take(n)
takeSample(withReplacement, num, [seed])
takeOrdered(n, [ordering])
saveAsTextFile(path)
saveAsSequenceFile(path)
saveAsObjectFile(path)
countByKey()
foreach(func)
```
