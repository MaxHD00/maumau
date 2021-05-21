package de.htwg.se.maumau.model

import scala.util.Random

abstract class AbstractTable(player: List[Player] , tableDecks: List[Deck]) {


  def checkCard(table: Table, playerNumber: Int, cardNumber: Int): Boolean
  def checkDeck(table: Table, playerNumber: Int): Boolean
  def addPlayers(table: Table, name: String, playerNumber: Int): Table
  def throwFirstCard(table: Table): Table
  def throwCard(table: Table, playerNumber: Int, cardNumber: Int): Table
  def takeCard(table: Table, playerNumber: Int): Table

}
