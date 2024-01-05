ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.1"

lazy val root = (project in file("."))
  .settings(
    name := "OOP-Trial-Exam"
  )
  libraryDependencies += "com.github.nscala-time" %% "nscala-time" % "2.32.0"
