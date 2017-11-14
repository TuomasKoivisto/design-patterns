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
public class Pokemon {
    
    private CharmanderState charmanderState;
    private int xp = 0;
    
    public Pokemon() {
        this.charmanderState = new Charmander();
    }

    public void attack() {
        charmanderState.attack();
        xp = charmanderState.getXp();
        checkXp();
    }
    
    public void boostPower() {
        charmanderState.boostPower();
        xp = charmanderState.getXp();
        checkXp();
    }

    public void move() {
        charmanderState.move();
        xp = charmanderState.getXp();
        checkXp();
    }
    public void checkXp() {
        if (xp > 15 && xp < 41) {
            charmanderState = new Charmeleon(xp);
            System.out.println("Charmander has evolved to Charmeleon!");
        } else if (xp > 40) {
            charmanderState = new Charizard(xp);
            System.out.println("Charmeleon has evolved to Charizard!");
        }
    }
}
