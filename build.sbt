name := "ALS Simple Project"

version := "1.0"

scalaVersion := "2.11.12"

lazy val sparkDependencies = Seq(
  "org.apache.spark" %% "spark-core" % "2.3.0",
  "org.apache.spark" %% "spark-mllib" % "2.3.0"
)

libraryDependencies ++= sparkDependencies.map(_ % "provided")
