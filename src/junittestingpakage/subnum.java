package junittestingpakage;

import static org.junit.Assert.*;

import org.junit.Test;

public class subnum {

	@Test
	public void test() {
		junitfuncion junit= new junitfuncion();
		int result = junit.subnum(400, 200);
		assertEquals(200, result);
	}

}
