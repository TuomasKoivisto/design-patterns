/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

import java.util.Scanner;

/**
 *
 * @author koivi
 */
public class Arvauspeli extends Game{
    
    Scanner scanner;
    int vuoro = 0;
    double number;
    int voittaja;
    boolean loppu;

    public Arvauspeli() {
        this.scanner = new Scanner(System.in);
        loppu = false;
    }

    @Override
    void initializeGame() {
        double number = 10 * Math.random();
        System.out.println("Arvaa luku välillä 0 - 10. \n Jos luku on +/- 1 generoidusta luvusta, voitat pelin");
        loppu = false;
        vuoro = 0;
    }

    @Override
    void makePlay(int player) {
        System.out.println("pelaajan " + player + " arvaus: ");
        double arvaus = scanner.nextDouble();
        if (arvaus >= number - 1 && arvaus <= number + 1) {
            voittaja = player;
            loppu = true;
        }
        if (player == playersCount) {
            vuoro++;
        }
    }

    @Override
    boolean endOfGame() {
        boolean tulos = false;
        if (loppu == true) {
            tulos = loppu;
        }
        return tulos;
    }

    @Override
    void printWinner() {
        System.out.println("pelaaja " + voittaja + " voitti pelin.");
    }
    
}
