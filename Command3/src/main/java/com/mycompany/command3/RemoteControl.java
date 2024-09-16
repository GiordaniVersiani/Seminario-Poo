package com.mycompany.command3;

/**
 *
 * @author Giordani Versiani
 */
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButtonOn() {
        command.execute();
    }
    
    public void pressButtonOff() {
        command.undo();
    }
}
