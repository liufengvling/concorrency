package com.concorrency.base.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class TaskwithResult implements Callable<String>{

	private int id; 
	
	public TaskwithResult(int id) {
		super();
		this.id = id;
	}

	@Override
	public String call() throws Exception {
		TimeUnit.SECONDS.sleep(3);
		return "result : " + id;
	}

}
