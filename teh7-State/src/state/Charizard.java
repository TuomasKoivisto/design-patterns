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
public class Charizard implements CharmanderState{
    private int xp;
    
    public Charizard (int xp) {
        this.xp = xp;
}

    @Override
    public int getXp() {
        return xp;
    }
    

    @Override
    public void attack() {
        System.out.println("Charizard attacks with Blaze.");
        System.out.println("XP increased by 6 points.");
        xp += 6;
        System.out.println("Current XP: " + xp + ".");
    }

    @Override
    public void boostPower() {
        System.out.println("Charizard's special attack increases in the sunlight.");
        System.out.println("XP increased by 4 points.");
        xp += 4;
        System.out.println("Current XP: " + xp + ".");
    }

    @Override
    public void move() {
        System.out.println("Charizard rises high up in the sky with a couple of wing strokes.");
        System.out.println("XP increased by 4 points.");
        xp += 4;
        System.out.println("Current XP: " + xp + ".");
    }
    
}

