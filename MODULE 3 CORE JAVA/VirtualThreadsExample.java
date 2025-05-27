public class VirtualThreadsExample {
    public static void main(String[] args) {
        try {
            for (int i = 1; i <= 100_000; i++) {
                Thread.startVirtualThread(() -> {
                    System.out.println("Hello from virtual thread: " + Thread.currentThread());
                });
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

