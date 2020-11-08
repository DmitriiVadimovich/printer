package ru.iteco.printer;

public class CashBackState extends StateBase {

    @Override
    public void depositMoney(PrintContext context) {
        System.out.println("Работа принтера завершена");
    }

    @Override
    public void selectDevice(PrintContext context) {
        System.out.println("Работа принтера завершена");
    }

    @Override
    public void selectFile(PrintContext context) {
        System.out.println("Работа принтера завершена");
    }

    @Override
    public void print(PrintContext context) {
        System.out.println("Работа принтера завершена");
    }
}
