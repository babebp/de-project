name := "de-project"

version := "0.1"

scalaVersion := "2.13.12"

val sparkVersion = "3.5.0"
val postgresVersion = "42.6.0"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.postgresql" % "postgresql" % postgresVersion
)