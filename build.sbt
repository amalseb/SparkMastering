//ThisBuild / version := "0.1.0-SNAPSHOT"
//
//ThisBuild / scalaVersion := "2.13.9"
//
//lazy val root = (project in file("."))
//  .settings(
//    name := "SparkMastering"
//  )
////// https://mvnrepository.com/artifact/log4j/log4j
////libraryDependencies += "log4j" % "log4j" % "1.2.17"
////
////// https://mvnrepository.com/artifact/org.apache.spark/spark-sql
////libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.2.1" % "provided"
////libraryDependencies += "org.apache.spark" %% "spark-core" % "3.2.1" % "provided"
//
//
//libraryDependencies ++= Seq(
//  "org.apache.spark" %% "spark-core" % "3.0.0",
//  "org.apache.spark" %% "spark-sql" % "3.0.0",
//  "org.apache.spark" %% "spark-mllib" % "3.0.0",
//  "org.apache.spark" %% "spark-streaming" % "3.0.0",
//  "org.twitter4j" % "twitter4j-core" % "4.0.4",
//  "org.twitter4j" % "twitter4j-stream" % "4.0.4"
//)

name := "SparkMastering"

version := "0.1"

scalaVersion := "2.12.12"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.0.0",
  "org.apache.spark" %% "spark-sql" % "3.0.0",
  "org.apache.spark" %% "spark-mllib" % "3.0.0",
  "org.apache.spark" %% "spark-streaming" % "3.0.0",
  "org.twitter4j" % "twitter4j-core" % "4.0.4",
  "org.twitter4j" % "twitter4j-stream" % "4.0.4"
)