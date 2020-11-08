package ru.iteco.printer;

public class SelectState extends StateBase {
    @Override
    public void depositMoney(PrintContext context) {
        System.out.println("Вы уже внесли деньги, необходимо выбрать устройство");
    }

    @Override
    public void selectDevice(PrintContext context) {
        if (!context.device.equals("USB") && !context.device.equals("WIFI") ) {
            System.out.println("Неизвестный тип устройства");
            return;
        }
        context.state = new ReadState();
    }

    @Override
    public void selectFile(PrintContext context) {
        System.out.println("Для выбора файла выбрать источник");
    }

    @Override
    public void print(PrintContext context) {
        System.out.println("Для начала печати необходимо выбрать источник и выбрать файл");
    }
}
