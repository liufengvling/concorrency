package com.concorrency.base.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * callable����ʹ��submit���ã�������future����get������call���󷵻�֮ǰ������
 * @author hades
 *
 */
public class CallableDemo {
	public static void main(String[] args) {
		ExecutorService es = Executors.newCachedThreadPool();
		List<Future<String>> list = new ArrayList<Future<String>>();
		for (int i = 0; i < 10; i++) {
			list.add(es.submit(new TaskwithResult(i)));
		}
		try{
			for (Future<String> future : list) {
				System.out.println(future.get());
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			es.shutdown();
		}
		
		
	}
}
