/*
 * @(#) CallableExample.java 2021. 06. 10.
 *
 * Copyright 2021. PlayD Corp. All rights Reserved.
 */

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author 박준영
 */
public class CallableExample {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		CallableService callableService = new CallableService();
		FutureTask futureTask = new FutureTask(callableService);
		Thread thread = new Thread(futureTask);
		thread.start();

		System.out.println("result " + futureTask.get());
	}
}
