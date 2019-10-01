import sbt._

object Dependencies {

  def dependencies: Seq[ModuleID] = {
    scalaTest
  }
  lazy val scalaTest = Seq(
    "org.scalatest" %% "scalatest" % "3.0.5" % Test
  )

}
