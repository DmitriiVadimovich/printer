package ru.iteco.printer;


import java.io.FileNotFoundException;

public interface State {

    void depositMoney(PrintContext context);

    void selectDevice(PrintContext context);

    void selectFile(PrintContext context);

    void print(PrintContext context);

    float cashBack(PrintContext context);
}
