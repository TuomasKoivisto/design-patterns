/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author koivi
 */
public abstract class Handler {
    
    protected Handler successor;
    protected Palkankorotuspyyntö palkankorotuspyyntö;
    
    
    public Handler(Handler s, Palkankorotuspyyntö palkankorotuspyyntö) {
        successor = s;
        this.palkankorotuspyyntö = palkankorotuspyyntö;
    }
    public void handle() {
        if (successor != null) {
            successor.handle();
        }
    }

}
