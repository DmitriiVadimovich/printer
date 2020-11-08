package ru.iteco.printer;


import java.util.Scanner;


public class PrintState extends StateBase {

    @Override
    public void depositMoney(PrintContext context) {
        System.out.println("Вы уже внесли деньги. Распечатайте файл или выберите новый");
    }

    @Override
    public void selectDevice(PrintContext context) {
        System.out.println("Вы уже выбрали устройство. Распечатайте файл или выберите новый");
    }

    @Override
    public void selectFile(PrintContext context) {
    }

    @Override
    public void print(PrintContext context){
        if (context.device == "USB" && context.money > 70.50f) {
            context.money = context.money - 70.50f;
        } else if (context.device == "WIFI" && context.money > 82.90f) {
            context.money = context.money - 82.90f;
        } else {
            System.out.println("У Вас недостаточное кол-во денег");
            return;
        }
        try {
            Scanner input = new Scanner(context.file);
            while (input.hasNextLine())
            {
                System.out.println(input.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
