package ru.iteco.printer;

public abstract class StateBase implements State{
    @Override
    public float cashBack(PrintContext context) {
        float cash = context.money;
        context.money = 0f;
        context.state = new CashBackState();
        System.out.printf("Ваша сдача: %.2f%n", cash);
        return cash;
    }
}
