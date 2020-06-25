import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TestReverseStringWord {

	
	@Test
	public void testReverseString() {
		String c1="a@@@b.c.d,e'f,***ghi";
		String expected="i@@@h.g.f,e'd,***cba";
		assertEquals(expected,ReverseStringWord.reverse(c1.toCharArray()));
	}
	
	@Test
	public void testReverseString1() {
		String c1="a@@@b.c.d,e'f,ghi";
		String expected="i@@@h.g.f,e'd,cba";
		assertEquals(expected,ReverseStringWord.reverse(c1.toCharArray()));
	}
	
	}
