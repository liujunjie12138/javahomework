package club.banyuan;

public class ReverseHelloMultithreaded extends Thread {
    private int n;

    public ReverseHelloMultithreaded(int n) {
        this.n = n;
    }

    public ReverseHelloMultithreaded(String name, int n) {
        super(name);
        this.n = n;
    }

    public static void doReverseHello() {
        ReverseHelloMultithreaded reverseHelloMultithreaded = new ReverseHelloMultithreaded(1);
        reverseHelloMultithreaded.start();

    }

    @Override
    public void run() {
        if (n < 50) {
            ReverseHelloMultithreaded reverseHelloMultithreaded = new ReverseHelloMultithreaded(n + 1);
            reverseHelloMultithreaded.start();
            try {
                reverseHelloMultithreaded.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Hello from thread " + n);
    }

    public static void main(String[] args) {
        ReverseHelloMultithreaded.doReverseHello();;
    }
}
