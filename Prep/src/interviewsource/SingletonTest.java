package interviewsource;

import static org.junit.Assert.*;
import org.junit.Test;

public class SingletonTest {

	private Singleton singleton;	

	public void init(){
		singleton = new Singleton();
	}
	
	@Test
	public void testGetInstance() {
		Thread.yield();
		Singleton p = singleton.getInstance();
	}
}
