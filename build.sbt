name := "Process"

version := "1.0"

scalaVersion := "2.10.5"

javacOptions in (ThisBuild, compile) ++= Seq("-source", "1.7", "-target", "1.7",
  "-Xlint:deprecation", "-Xlint:unchecked")

elasticsearchVersion in ThisBuild := "1.4.4"

json4sVersion in ThisBuild := "3.2.10"

sparkVersion in ThisBuild := "1.4.0"

lazy val pioBuildInfoSettings = buildInfoSettings ++ Seq(
  sourceGenerators in Compile <+= buildInfo,
  buildInfoKeys := Seq[BuildInfoKey](
    name,
    version,
    scalaVersion,
    sbtVersion,
    sparkVersion),
  buildInfoPackage := "io.prediction.core")

lazy val conf = file(".") / "conf"

lazy val root = project in file(".") aggregate(
  common,
  core,
  data,
  tools,
  e2)

lazy val common = (project in file("common")).
  settings(unmanagedClasspath in Test += conf)

lazy val core = (project in file("core")).
  dependsOn(data).
  settings(pioBuildInfoSettings: _*).
  enablePlugins(SbtTwirl).
  settings(unmanagedClasspath in Test += conf)

lazy val data = (project in file("data")).
  dependsOn(common).
  settings(unmanagedClasspath in Test += conf)

lazy val tools = (project in file("tools")).
  dependsOn(core).
  dependsOn(data).
  enablePlugins(SbtTwirl).
  settings(unmanagedClasspath in Test += conf)

lazy val e2 = (project in file("e2")).
  settings(unmanagedClasspath in Test += conf)