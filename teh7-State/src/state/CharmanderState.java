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
public interface CharmanderState {
    
    public abstract void attack();
    public abstract void boostPower();
    public abstract void move();
    public abstract int getXp();
}
