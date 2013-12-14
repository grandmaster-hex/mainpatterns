package org.grandmasterhex.patterns.examples.command;

class Switch {
    private Command flipUpCommand;
    private Command flipDownCommand;

    public Switch(Command flipUpCmd, Command flipDownCmd) {
        this.flipUpCommand = flipUpCmd;
        this.flipDownCommand = flipDownCmd;
    }

    public void flipUp() {
        flipUpCommand.execute();
    }

    public void flipDown() {
        flipDownCommand.execute();
    }
}
 


class Light {
    public Light() {
    }

    public void turnOn() {
        System.out.println("The light is on");
    }

    public void turnOff() {
        System.out.println("The light is off");
    }
}
 
 


public interface Command {
    void execute();
}
 
 


class TurnOnLightCommand implements Command {
    private Light theLight;

    public TurnOnLightCommand(Light light) {
        this.theLight = light;
    }

    public void execute() {
        theLight.turnOn();
    }
}
class TurnOnTV implements Command{
    private TV theTV;
    public TurnOnTV(TV tv){
        this.theTV = tv;
    }
    @Override
    public void execute() {
        theTV.turnOn();
    }
}


class TurnOffLightCommand implements Command {
    private Light theLight;

    public TurnOffLightCommand(Light light) {
        this.theLight = light;
    }

    public void execute() {
        theLight.turnOff();
    }
}


class TestCommand {
    public static void main(String[] args) {
        Light light = new Light();
        Command switchUp = new TurnOnTV(new TV());
        Command switchDown = new TurnOffLightCommand(light);

        Switch s = new Switch(switchUp, switchDown);

        s.flipUp();
        s.flipDown();
    }
}