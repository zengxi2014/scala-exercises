val pluginVersion = System.getProperty("plugin.version")

lazy val content = (project in file("content"))
  .enablePlugins(ExerciseCompilerPlugin)
  .settings(
    scalaVersion := "2.11.7"
  )
  .settings(libraryDependencies ++= Seq(
    "org.scala-exercises" %% "runtime" % pluginVersion changing(),
    "org.scala-exercises" %% "definitions" % pluginVersion changing()
  ))

lazy val check = (project in file("check"))
  .dependsOn(content)
  .settings(scalaVersion := "2.11.7")
