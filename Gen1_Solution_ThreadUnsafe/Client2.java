package Gen1_Solution_ThreadUnsafe;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client2 {
    public static void main(String[] args) {
        Date d = new Date();
        LocalDateTime startTime = LocalDateTime.now();
        SimpleDateFormat ft = new SimpleDateFormat("HH:mm:ss:SSSSSSS");
        ExecutorService es = Executors.newFixedThreadPool(7);
        System.out.println("Main Thread - " + Thread.currentThread());
        System.out.println("Current time is "+ft.format(d));
        List<Future> futures = new ArrayList<>();
        for(int i =0; i<50; i++){
            futures.add(
                    es.submit( ()-> {
                        String user = "db";
                        Database db4 = Database.getInstance(user, "pass");
                        //System.out.println("Main Thread - " + Thread.currentThread());
                        //System.out.println("Current time is "+ft.format(d));
                        System.out.println(db4.hashCode());
                            }

                    )
            );
        }

        futures.stream().forEach( (inp)->{
            try {
                inp.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        });
        es.shutdown();
        LocalDateTime endTime = LocalDateTime.now();
        Duration duration = Duration.between(startTime,endTime);
        System.out.println("Current time is "+ft.format(d));
        System.out.println("Time taken is : "+duration.toSeconds());
    }
}
