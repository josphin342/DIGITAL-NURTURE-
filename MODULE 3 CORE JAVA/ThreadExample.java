class CustomThread extends Thread {
    private String message;
    CustomThread(String message) {
        this.message = message;
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message + " - Count: " + (i + 1));
            try {
                Thread.sleep(500); // Pause for half a second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        CustomThread thread1 = new CustomThread("Thread 1");
        CustomThread thread2 = new CustomThread("Thread 2");

        thread1.start();
        thread2.start();
    }
}

