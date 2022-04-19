package junittestingpakage;

import static org.junit.Assert.*;

import org.junit.Test;

public class addstrings {

	@Test
	public void test() {
		junitfuncion junit= new junitfuncion();
		String result = junit.addstrings("nihari", "priya");
		assertEquals("niharipriya", result);
	}

}
