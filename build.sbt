import SocrataSbtKeys._

seq(socrataSettings(): _*)

name := "eurybates"

scalaVersion := "2.9.2"

crossScalaVersions := Seq("2.9.2")

libraryDependencies <++= (slf4jVersion) { slf4jVersion =>
  Seq(
    "org.apache.activemq" % "activemq-core" % "5.3.0" % "optional",
    "kafka" %% "core-kafka" % "0.7.2" % "optional",
    "com.rojoma" %% "rojoma-json" % "1.4.4",
    "com.socrata" %% "socrata-zookeeper" % "0.0.1"
  )
}
