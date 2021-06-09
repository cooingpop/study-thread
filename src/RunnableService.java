/*
 * @(#) RunnableService.java 2021. 06. 10.
 *
 * Copyright 2021. PlayD Corp. All rights Reserved.
 */

import java.time.LocalDateTime;

/**
 * @author 박준영
 */
public class RunnableService implements Runnable {
	@Override
	public void run() {
		System.out.println(LocalDateTime.now());
	}
}
