import java.util.concurrent.Semaphore;

class Queue extends Thread {
    private Semaphore semafor;
    Window window;
    char type;

    public Queue(Window window, Semaphore semafor, char type) {
        this.window = window;
        this.semafor = semafor;
        this.type = type;
        setDaemon(true);

    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            if (type == 'g') {
                if (semafor.getQueueLength() == 0) {

                    window.queueGateNumber
                            .setText("<html><font color=#006600>" + semafor.getQueueLength() + "</font></html>");
                } else {
                    window.queueGateNumber
                            .setText("<html><font color=#ff0000>" + semafor.getQueueLength() + "</font></html>");
                }

            } else if (type == 'n') {
                if (semafor.getQueueLength() == 0) {
                    window.queueNarrowingNumber
                            .setText("<html><font color=#006600>" + semafor.getQueueLength() + "</font></html>");
                } else {
                    window.queueNarrowingNumber
                            .setText("<html><font color=#ff0000>" + semafor.getQueueLength() + "</font></html>");
                }

            }

        }
    }

}