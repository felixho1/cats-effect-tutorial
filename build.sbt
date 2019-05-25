name := "cats-effect-tutorial"

version := "1.0"

scalaVersion := "2.12.7"

libraryDependencies += "org.typelevel" %% "cats-effect" % "1.2.0" withSources () withJavadoc ()
// available for Scala 2.11, 2.12
libraryDependencies += "co.fs2" %% "fs2-core" % "1.0.4" // For cats 1.5.0 and cats-effect 1.2.0

scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-language:postfixOps",
  "-language:higherKinds",
  "-Ypartial-unification"
)
