package com.concorrency.base.join;

/**
 * join demo
 * join��ʹһ���߳����У�ͬʱ��ǰ�߳������� �ȴ�join�߳̽�������ǰ�̲߳��ܼ���ִ��
 * @author hades
 *
 */
public class Joining {
	public static void main(String[] args) {
		Sleeper sleepy= new Sleeper("Sleepy",1500),
				grumpy = new Sleeper("Grumpy",2000);
		Joiner dopey = new Joiner("Dopey",sleepy),
			   doc = new Joiner("Doc", grumpy);
		
		//�ж�sleep������join�߳̾������̽���
		grumpy.interrupt();		
	}
}
