package ru.iteco.printer;

import java.io.File;

public class PrintContext {
    float money;
    String device;
    File file;
    State state;

    public PrintContext () {
        System.out.println("Принтер включен");
        this.state = new InitState();
    }

    public void depositMoney(float money) {
        if (this.money == 0.0f) {
            this.money = money;
        }
        this.state.depositMoney(this);
    }
    public void selectDevice(String device) {
        if (this.device == null || this.device.isEmpty()) {
            this.device = device;
        }
        this.state.selectDevice(this);
    }

    public void selectFile(File file) {
        if (this.file == null || this.state instanceof PrintState) {
            this.file = file;
        }
        this.state.selectFile(this);
    }

    public void print(){
        this.state.print(this);
    }

    public float cashBack() {
        return this.state.cashBack(this);
    }
}
