package com.hcmony.concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <h3>Shenjue.java基本描述</h3>
 * <p></p>
 *
 * @author hcmony
 * @since V1.0.0, 2018/10/16 16:00
 */
public class AtomicIntegerDemo {
	private static AtomicInteger atomicInteger = new AtomicInteger();
	private static Lock lock = new ReentrantLock();

	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				if (lock.tryLock()){
					try {
						System.out.println("222222222");
						TimeUnit.SECONDS.sleep(3);
					}catch (Exception e){
						e.printStackTrace();
					}
				}
			}
		}).start();
		if (lock.tryLock()){
			try {
				System.out.println("------");
				TimeUnit.SECONDS.sleep(3);
			}catch (Exception e){
				e.printStackTrace();
			}finally {
				lock.unlock();
			}
		}

	}



}
