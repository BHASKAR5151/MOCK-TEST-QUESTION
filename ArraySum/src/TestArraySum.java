import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestArraySum {

	@Test
	public void testArraySum() {
		int[] input = { 1, 5, 7, -1, 5 };
		int sum = 6;
		String expected = "{5,1}{-1,7}{5,1}";
		Assert.assertEquals(expected, ArraySum.arraySum(input, sum));
	}

	@Test
	public void testArraySum1() {
		int[] input = { 2, 5, 17, -1 };
		int sum = 7;
		String expected = "{5,2}";
		Assert.assertEquals(expected, ArraySum.arraySum(input, sum));
	}

	@Test
	public void testArraySumWithNull() {
		int[] input = null;
		int sum = 6;
		String expected = new String();
		Assert.assertEquals(expected, ArraySum.arraySum(input, sum));
	}
}
