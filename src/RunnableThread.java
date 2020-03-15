import java.util.Scanner;

public class RunnableThread implements Runnable {

    private Scanner scanner;

    RunnableThread() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void run() {
        System.out.println(" ");
        System.out.println("Input have many numbers of Fibonacci you want to see:");
        int inputNumbers = scanner.nextInt();
        if (inputNumbers <= 0) {
            System.out.println("Error, you will enter '0'!");
        } else {
            int[] fibonacci = new int[inputNumbers];
            int n0 = 1;
            int n1 = 1;
            int n2;
            fibonacci[0] = n0;
            fibonacci[1] = n1;
            for (int i = 2; i < inputNumbers; i++) {
                n2 = n0 + n1;
                fibonacci[i] = n2;
                n0 = n1;
                n1 = n2;
            }

            System.out.print("RunnableThread : ");
            for (int i = fibonacci.length - 1; i >= 0; i--) {
                System.out.print(fibonacci[i] + " ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
        }
    }
}

