package ru.iteco.printer;

public class ReadState extends StateBase{

    @Override
    public void depositMoney(PrintContext context) {
        System.out.println("Вы уже внесли деньги, необходимо выбрать файл");
    }

    @Override
    public void selectDevice(PrintContext context) {
        System.out.println("Вы уже выбрали устройство, необходимо выбрать файл");
    }

    @Override
    public void selectFile(PrintContext context) {
        context.state = new PrintState();
    }

    @Override
    public void print(PrintContext context) {
        System.out.println("Для начала печати необходимо выбрать файл");
    }
}
