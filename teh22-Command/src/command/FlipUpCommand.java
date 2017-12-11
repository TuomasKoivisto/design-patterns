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
public class FlipUpCommand implements Command {

    private Screen screen;

    public FlipUpCommand(Screen screen) {
        this.screen = screen;
    }

    @Override // Command
    public void execute() {
        screen.screenUp();
    }
}
