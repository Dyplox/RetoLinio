package co.com.linio.reto.utils;

import java.util.concurrent.Callable;

public class CondicionExitosa {

static Boolean allMessagesProcessed = true;
	
	private CondicionExitosa() {
	}

	public static Callable<Boolean> paraElTiempo() {
		return new Callable<Boolean>() {
			public Boolean call() throws Exception {
				return allMessagesProcessed;

			}
		};
	}
	
} 
