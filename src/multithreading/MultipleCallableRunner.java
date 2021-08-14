package multithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		
		List<CallableTask> tasks = List.of(
				new CallableTask("Bkacad"),
				new CallableTask("Software"),
				new CallableTask("Network")
				);
		
		System.out.println("Start...");
		
		List<Future<String>> results = executorService.invokeAll(tasks);
		
		for (var result : results) {
			System.out.println(result.get());
		}
		
		executorService.shutdown();

	}

}
