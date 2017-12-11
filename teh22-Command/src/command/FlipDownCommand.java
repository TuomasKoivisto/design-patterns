/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author koivi
 */
public class FlipDownCommand implements Command {

    private Screen screen;

    public FlipDownCommand(Screen screen) {
        this.screen = screen;
    }

    @Override // Command
    public void execute() {
        screen.screenDown();
    }
}
