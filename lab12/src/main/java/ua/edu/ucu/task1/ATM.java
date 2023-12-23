package ua.edu.ucu.task1;

public class ATM {
    private Tray firstTray;

    public ATM() {
        firstTray = new Tray500();
        Tray tray200 = new Tray200();
        Tray tray100 = new Tray100();
        Tray tray50 = new Tray50();
        Tray tray20 = new Tray20();
        Tray tray10 = new Tray10();
        Tray tray5 = new Tray5();
        Tray tray2 = new Tray2();
        Tray tray1 = new Tray1();

        firstTray.setNext(tray200);
        tray200.setNext(tray100);
        tray100.setNext(tray50);
        tray50.setNext(tray20);
        tray20.setNext(tray10);
        tray10.setNext(tray5);
        tray5.setNext(tray2);
        tray2.setNext(tray1);
    }

    public void process (int amount) {
        firstTray.process(amount);
    }
}
