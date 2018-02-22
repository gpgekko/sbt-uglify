organization := "com.typesafe.sbt"
name := "sbt-uglify"
description := "sbt-web plugin for gzipping assets"
addSbtJsEngine("1.2.2")
libraryDependencies ++= Seq(
  "org.webjars.npm" % "uglify-es" % "3.3.12",
  "io.monix" %% "monix" % "2.3.0"
)

//scriptedBufferLog := false
