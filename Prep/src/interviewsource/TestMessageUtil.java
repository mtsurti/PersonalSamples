package interviewsource;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMessageUtil {
	
	String message = "Sample Text";
	MessageUtil mu = new MessageUtil(message);
	
	@Test
	public void test() {
		Assert.assertEquals(message, mu.printMessage());
	}
}
