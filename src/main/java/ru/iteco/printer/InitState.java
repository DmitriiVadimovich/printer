package ru.iteco.printer;

public class InitState extends StateBase{

    @Override
    public void depositMoney(PrintContext context) {
        context.state = new SelectState();
    }

    @Override
    public void selectDevice(PrintContext context) {
        System.out.println("Для выбора устройства необходимо внести деньги");
    }

    @Override
    public void selectFile(PrintContext context) {
        System.out.println("Для выбора файла необходимо внести деньги и выбрать источник");
    }

    @Override
    public void print(PrintContext context) {
        System.out.println("Для начала печати необходимо внести деньги, выбрать источник и выбрать файл");
    }
}
