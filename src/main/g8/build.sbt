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
// scala compiler options
// ----------------------------------------------------------------------------

scalacOptions in ThisBuild ++= Seq(
  "-deprecation",
  "-encoding",
  "UTF-8",
  "-feature",
  "-unchecked"
)

// ----------------------------------------------------------------------------
// build info
// ----------------------------------------------------------------------------

buildInfoKeys := Seq[BuildInfoKey](name, version)

buildInfoPackage := "$name$"

// ----------------------------------------------------------------------------
// formatting
// ----------------------------------------------------------------------------

scalafmtVersion := "1.3.0"

scalafmtOnCompile := true

// ----------------------------------------------------------------------------
// linting
// ----------------------------------------------------------------------------

scalastyleConfig := file(".scalastyle-config.xml")

wartremoverErrors in (Compile, compile) ++= Seq(
  Wart.ArrayEquals,
  Wart.FinalCaseClass,
  Wart.OptionPartial,
  Wart.TraversableOps,
  Wart.TryPartial
)

