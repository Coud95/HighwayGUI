import javax.swing.*;
import java.util.concurrent.Semaphore;

class Car implements Runnable {
    private int car;
    int counter;
    Window window;
    Semaphore semaforGate;
    Semaphore semaforNarrowing;

    public static Icon carIcon = new ImageIcon(Car.class.getResource("/res/car.png"));
    public static Icon gateIcon = new ImageIcon(Car.class.getResource("/res/gate.png"));
    public static Icon narrowingIcon = new ImageIcon(Car.class.getResource("/res/narrowing.png"));
    public static Icon stopIcon = new ImageIcon(Car.class.getResource("/res/stop.png"));


    public Car(int car, Window window, int counter, Semaphore semaforGate, Semaphore semaforNarrowing) {
        this.car = car;
        this.window = window;
        this.counter = counter;
        this.semaforGate = semaforGate;
        this.semaforNarrowing = semaforNarrowing;

    }

    @Override
    public void run() {
        try {
            window.actionText[counter]
                    .setText("<html><font color=#00bfff>Samochód " + car + "<br>wjechał na autostradę.</font></html>");
            window.images[counter].setIcon(carIcon);
            Thread.sleep((long) (2000));
            window.actionText[counter].setText("<html>Samochód " + car + "<br>dojechał do bramek.</html>");
            if (semaforGate.availablePermits() == 0) {
                window.images[counter].setIcon(stopIcon);
                window.actionText[counter].setText(
                        "<html><font color=#FF0000>Samochód " + car + "<br>czeka przed bramkami.</font></html>");
            }
            semaforGate.acquire();
        } catch (InterruptedException e) {
        } finally {
            try {
                window.images[counter].setIcon(gateIcon);
                window.actionText[counter]
                        .setText("<html><font color=#40ff00>Samochód " + car + "<br>płaci przy bramkach.</html>");
                Thread.sleep((long) (3000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            semaforGate.release();
            window.images[counter].setIcon(carIcon);
            window.actionText[counter]
                    .setText("<html>Samochód " + car + "<br>jedzie dalej<br>i dojeżdża do zwężenia.</html>");
            try {
                Thread.sleep((long) (2000));
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            try {
                if (semaforNarrowing.availablePermits() == 0) {
                    window.images[counter].setIcon(stopIcon);
                    window.actionText[counter].setText(
                            "<html><font color=#FF0000>Samochód " + car + "<br>czeka przed zwężeniem.</font></html>");
                }
                semaforNarrowing.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                try {
                    window.images[counter].setIcon(narrowingIcon);
                    window.actionText[counter].setText("<html><font color=#ff8000>Samochód " + car
                            + "<br>przejeżdża przez zwężenie.</font></html>");
                    Thread.sleep((long) (1675));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                semaforNarrowing.release();
                window.images[counter].setIcon(null);
                window.actionText[counter].setText("");
            }
        }
    }
}