// ----------------------------------------------------------------------------
// sbt plugins
// ----------------------------------------------------------------------------

enablePlugins(BuildInfoPlugin)
enablePlugins(GitVersioning)

// ----------------------------------------------------------------------------
// basic project settings
// ----------------------------------------------------------------------------

name := "$name$"

git.baseVersion in ThisBuild := "$version$"

organization in ThisBuild := "$organization$"

scalaVersion in ThisBuild := "$scalaversion$"

libraryDependencies += "com.lihaoyi" %% "utest" % "0.6.0" % "test"

testFrameworks := Seq(new TestFramework("utest.runner.Framework"))

// ----------------------------------------------------------------------------
// build info
// ----------------------------------------------------------------------------

buildInfoKeys := Seq[BuildInfoKey](name, version)

buildInfoPackage := "$name$"

// ----------------------------------------------------------------------------
// scalafmt integration
// ----------------------------------------------------------------------------

scalafmtVersion := "1.3.0"

scalafmtOnCompile := true

// ----------------------------------------------------------------------------
// scalastyle integration
// ----------------------------------------------------------------------------

scalastyleConfig := file(".scalastyle-config.xml")
