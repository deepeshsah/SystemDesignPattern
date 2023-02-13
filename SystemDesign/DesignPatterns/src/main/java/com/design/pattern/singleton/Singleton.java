package com.design.pattern.singleton;

public class Singleton {
	private static Singleton instance;
	
	Singleton() {
		if(instance!=null) {
			throw new RuntimeException("get your Object by getInstance()");
		}
	}
	
	public static Singleton getInstance() {
		if (instance == null)
		{
			synchronized(Singleton.class)
			{
				if (instance == null)
				{
					System.out.println("getInstance(): First time getInstance was invoked!");
					instance = new Singleton();
				}
			}            
		}

		return instance;
		
	}

}
