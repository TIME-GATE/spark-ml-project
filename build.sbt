name := "spark-ml-project"

lazy val commonSettings = Seq(
  organization := "com.joseph",
  version := "1.0-SNAPSHOT",
  scalaVersion := "2.11.12"
)


lazy val sparkDependencies = Seq(
  "org.apache.spark" %% "spark-core" % "2.3.0",
  "org.apache.spark" %% "spark-mllib" % "2.3.0"
)

lazy val sparkCommonDependencies = Seq(
  "org.apache.spark" % "spark-core_2.11" % "2.1.2",
  "org.apache.spark" % "spark-mllib_2.11" % "2.1.2"
)


lazy val spark_ml_common = project.in(file("spark-ml-common")).settings(
  commonSettings,
  libraryDependencies ++= Seq(
    "org.scalactic" % "scalactic_2.11" % "3.0.1",
    "org.scalatest" % "scalatest_2.11" % "3.0.5" % "test" 
  ),
  libraryDependencies ++= sparkCommonDependencies.map(_ % "provided")
)

lazy val spark_ml_als = project.in(file("spark-ml-als"))
  .dependsOn(spark_ml_common)
  .settings(commonSettings, 
    libraryDependencies ++= sparkDependencies.map(_ % "provided")
)
