package com.mycompany.command3;

/**
 *
 * @author Giordani Versiani
 */
public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(lightOnCommand);

        remoteControl.pressButtonOn();
        remoteControl.pressButtonOff();
    }
}
