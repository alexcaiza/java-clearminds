package com.thread;

public class Wombat implements Runnable {
	
	private int i;

	@Override
	public synchronized void run() {
		
		if (i%5 != 0) { i++;}
		
		for (int x = 0; x<5; x++, i++) {
			if (x > 1) {
				//System.out.println("Thread.yield()");
				Thread.yield();
			}
		}
		System.out.print(i + " ");
	}
	
	public static void main(String[] args) {
		Wombat w = new Wombat();
		for (int x = 5; x>0; x--) {
			new Thread(w).start();
		}
	}
	
	

}
