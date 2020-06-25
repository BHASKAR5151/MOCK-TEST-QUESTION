import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TestTwoArray {

	@Test
	public void testGetMedin() {
		int ar1[] = {1, 2, 5 };
		int ar2[] = {6,8,7};
		Double expected =5.5;
		Double actual=TwoArray.getMedian(ar1, ar2, ar1.length,ar2.length);
		assertEquals(expected, actual);
	}

	@Test
	public void testGetMedinWithDiffLength() {
		int ar1[] = { 1, 12, 15, 26 };
		int ar2[] = { 2 };
		Double expected =12.0;
		Double actual=TwoArray.getMedian(ar1, ar2, ar1.length,ar2.length);
		assertEquals(expected,actual);
	}

	@Test
	public void testGetMedinWithDiffLength1() {
		int ar1[] = {};
		int ar2[] = { 2, 13, 17, 30, 45 };
		Double expected =17.0;
		Double actual=TwoArray.getMedian(ar1, ar2, ar1.length,ar2.length);
		assertEquals(expected,actual);
	}

}
