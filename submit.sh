#sbt clean

#sbt package

spark-submit \
  --class "ALSExample" \
  --master local[4] \
  target/scala-2.11/als-simple-project_2.11-1.0.jar
