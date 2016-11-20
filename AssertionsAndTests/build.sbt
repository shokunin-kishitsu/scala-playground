name := "FunSuiteTest"

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test"
libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % "3.8.5" % "test")
libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.13.4" % "test"

scalacOptions in Test ++= Seq("-Yrangepos")