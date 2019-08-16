// @GENERATOR:play-routes-compiler
// @SOURCE:D:/cmder/Code/play-samples/play-scala-starter-example/conf/routes
// @DATE:Thu Aug 15 23:46:18 EDT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
