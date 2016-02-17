package app

import scala.scalajs.js, js.JSApp

@js.native
class Bundle extends js.Object {

  def $ : js.Function1[js.Any, Jquery] = js.native
  def `_`: Lodash = js.native
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
    val lib = new Bundle
    println(lib.$)
    println(lib.`_`)
    lib.$("h1").text(lib.`_`.camelCase("Hello World"))
    //println(js.Dynamic.global.Bundle)
  }
}
