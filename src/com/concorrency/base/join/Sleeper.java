package com.concorrency.base.join;

public class Sleeper extends Thread{
	private int duration;

	public Sleeper(String name,int duration) {
		super(name);
		this.duration = duration;
		start();
	}

	@Override
	public void run() {
		try{
			sleep(duration);
		}catch(Exception e){
			System.out.println(getName() + " was interrupted" + "is interrupted:" + isInterrupted());
		}
		System.out.println(getName() + " has awakened");
	}
}
