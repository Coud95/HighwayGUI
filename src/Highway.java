import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Highway {
    public static void main(String args[]) {
        Semaphore semaforGate = new Semaphore(2, true);
        Semaphore semaforNarrowing = new Semaphore(1, true);
        Window window = new Window();
        window.setVisible(true);

        Queue queueGate = new Queue(window, semaforGate, 'g');
        queueGate.start();

        Queue queueNarrowing = new Queue(window, semaforNarrowing, 'n');
        queueNarrowing.start();

        ExecutorService executor = Executors.newFixedThreadPool(8);
        for (int i = 0; i < 24; i++) {

            Runnable car = new Car(i, window, i % 8, semaforGate, semaforNarrowing);
            executor.execute(car);
            try {
                Thread.sleep((long) (Math.random() * 750));
            } catch (InterruptedException e) {
            }
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Koniec symulacji.");
    }
}