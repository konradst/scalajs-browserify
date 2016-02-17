name := "hellosjs"

scalaVersion := "2.11.7"

enablePlugins(ScalaJSPlugin)

val bundle = project.in(file("bundle"))

jsDependencies += ProvidedJS / "bundle.js"

persistLauncher in Compile := true
