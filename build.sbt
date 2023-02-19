val scala3Version = "3.2.2"

lazy val root = project
  .in(file("."))
  .settings(
    organization := "io.github.todokr",
    name := "schemareader",
    version := "0.1.0-SNAPSHOT",
    versionScheme := Some("early-semver"),
    scalaVersion := scala3Version,
    scalacOptions ++= Seq(
      "-new-syntax",
      "-rewrite",
      "-feature",
      "-deprecation",
      "-unchecked",
    ),
    libraryDependencies ++= Seq(
      "org.postgresql" % "postgresql" % "42.5.1",
      "org.scalameta" %% "munit" % "0.7.29" % Test
    )
  )

githubOwner := "todokr"
githubRepository := "schema-reader"
githubTokenSource := TokenSource.GitConfig("github.token")