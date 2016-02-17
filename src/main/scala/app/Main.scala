package app

import scala.scalajs.js, js.JSApp

@js.native
object Bundle extends js.Object {
  def jquery : js.Function1[js.Any, Jquery] = js.native
  def lodash: Lodash = js.native
}

@js.native
trait Jquery extends js.Object {
   def text(arg: js.Any): Jquery = js.native
}

@js.native
trait Lodash extends js.Object {
   def camelCase(arg: js.Any): String = js.native
}


object Main extends JSApp {
  def main(): Unit = {
    println("hello from scalajs")
    import Bundle._
    jquery("#title").text(lodash.camelCase("This is a test"))
    //println(js.Dynamic.global.Bundle)
  }
}
