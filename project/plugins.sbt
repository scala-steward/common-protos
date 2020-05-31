addSbtPlugin("com.thesamet" % "sbt-protoc" % "0.99.31")

addSbtPlugin("com.geirsson" % "sbt-ci-release" % "1.5.3")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.0")

val scalapbVersion = sys.env.getOrElse("SCALAPB_VERSION", "0.10") match {
  case "0.9"  => "0.9.6"
  case "0.10" => "0.10.2"
}

libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % scalapbVersion
