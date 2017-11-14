/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

/**
 *
 * @author koivi
 */
 abstract class Game {

 protected int playersCount;

 abstract void initializeGame();

 abstract void makePlay(int player);

 abstract boolean endOfGame();

 abstract void printWinner();

 /* A template method : */
 public final void playOneGame(int playersCount) {
 if (playersCount > 3) {
     this.playersCount = 3;
 } else if (playersCount < 1) {
     this.playersCount = 1;
 } else {
     this.playersCount = playersCount;
 }
 initializeGame();
 int j = 0;
 while (!endOfGame()){
 makePlay(j);
 j = (j + 1) % playersCount;
 }
 printWinner();
 }
 }