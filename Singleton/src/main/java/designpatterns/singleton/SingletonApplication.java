package designpatterns.singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.lang.model.type.ExecutableType;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.*;

@SpringBootApplication
public class SingletonApplication {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		List<Future<ConnectionPool_V3>> list = new LinkedList<>();
		for(int i=0; i<100000; i++){
			list.add( executorService.submit( ()-> ConnectionPool_V3.getInstance(5)  ) );
		}

		list.stream().forEach((a)-> {
			try {
				System.out.println(a.get());
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			} catch (ExecutionException e) {
				throw new RuntimeException(e);
			}
		});
		executorService.shutdown();
	}

}
