package org.grandmasterhex.patterns.examples.facade;

/**
 * Created by kvatashydze on 12/6/13.
 */
class CPU {
    public void freeze() { }
    public void jump(long position) {  }
    public void execute() {  }
}

class Memory {
    public void load(int position, String data) { }
}

class HardDrive {
    public String read(int lba, int size) { return "Hello World!"; }
}

/* Facade */

public class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        cpu.freeze();
        memory.load(2, hardDrive.read(2, 3));
        cpu.jump(1);
        cpu.execute();
    }
}



class Application {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startComputer();
    }
}
