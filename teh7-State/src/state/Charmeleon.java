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
public class Charmeleon implements CharmanderState{
    private int xp;
    
    public Charmeleon (int xp) {
        this.xp = xp;
    }

    @Override
    public int getXp() {
        return xp;
    }
    
    

    @Override
    public void attack() {
        System.out.println("Charmeleon attacks with Blaze.");
        System.out.println("XP increased by 6 points.");
        xp += 6;
        System.out.println("Current XP: " + xp + ".");
    }

    @Override
    public void boostPower() {
        System.out.println("Charmeleon's special attack increases in the sunlight.");
        System.out.println("XP increased by 4 points.");
        xp += 4;
        System.out.println("Current XP: " + xp + ".");
    }

    @Override
    public void move() {
        System.out.println("Charmeleon runs fast");
        System.out.println("XP increased by 3 points.");
        xp += 3;
        System.out.println("Current XP: " + xp + ".");
    }
    
}
