/*
 * @(#) CallableService.java 2021. 06. 10.
 *
 * Copyright 2021. PlayD Corp. All rights Reserved.
 */

import java.time.LocalDateTime;
import java.util.concurrent.Callable;

/**
 * @author 박준영
 */
public class CallableService implements Callable<String> {
	@Override
	public String call() throws Exception {
		return LocalDateTime.now().toString();
	}
}
