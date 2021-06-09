/*
 * @(#) RuannbleExam.java 2021. 06. 10.
 *
 * Copyright 2021. PlayD Corp. All rights Reserved.
 */

/**
 * @author 박준영
 */
public class RuannbleExample {
	public static void main(String[] args) {
		RunnableService runnableService = new RunnableService();
		Thread thread = new Thread(runnableService);
		thread.start();
	}
}
