/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author koivi
 */
public class Charmander implements CharmanderState{
    private int xp = 0;

    @Override
    public int getXp() {
        return xp;
    }

    @Override
    public void attack() {
        System.out.println("Charmander attacks with Blaze.");
        System.out.println("XP increased by 5 points.");
        xp += 5;
        System.out.println("Current XP: " + xp + ".");
    }

    @Override
    public void boostPower() {
        System.out.println("Charmander's special attack increases in the sunlight.");
        System.out.println("XP increased by 3 points.");
        xp += 3;
        System.out.println("Current XP: " + xp + ".");
    }

    @Override
    public void move() {
        System.out.println("Charmander runs slowly");
        System.out.println("XP increased by 2 points.");
        xp += 2;
        System.out.println("Current XP: " + xp + ".");
    }
    
}
