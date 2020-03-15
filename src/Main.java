import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new MyThread());
        executorService.execute(new RunnableThread());
        executorService.shutdown();


    }
}
