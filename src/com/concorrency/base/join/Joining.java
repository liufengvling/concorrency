package com.concorrency.base.join;

/**
 * join demo
 * join是使一个线程运行，同时当前线程阻塞， 等待join线程结束，当前线程才能继续执行
 * @author hades
 *
 */
public class Joining {
	public static void main(String[] args) {
		Sleeper sleepy= new Sleeper("Sleepy",1500),
				grumpy = new Sleeper("Grumpy",2000);
		Joiner dopey = new Joiner("Dopey",sleepy),
			   doc = new Joiner("Doc", grumpy);
		
		//中断sleep，这样join线程就能立刻结束
		grumpy.interrupt();		
	}
}
