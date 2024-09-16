package com.mycompany.command3;

/**
 *
 * @author Giordani Versiani
 */
final class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        setLight(light);
    }

    public void setLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
    
    @Override
    public void undo() {
        light.turnOff();
    }
}