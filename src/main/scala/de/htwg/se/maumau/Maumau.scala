package de.htwg.se.maumau

import de.htwg.se.maumau.aview.{TUI, Welcome}
import de.htwg.se.maumau.controller.Controller
import de.htwg.se.maumau.model._

import scala.io.StdIn.readLine
object Maumau {
  val table = Table()
  val controller = new Controller(table)
  val welcome = new Welcome(controller)
  val tui =  TUI(controller)
//  controller.notifyObservers()

  def main(args: Array[String]): String = {
    welcome.welcome()
    controller.notifyObservers()
    var input: String = ""

    while (input != "q") {
      input = readLine()
      tui.processInputLine(input)
    }
    "GameOver"
  }
}
