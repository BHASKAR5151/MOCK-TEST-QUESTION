import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestSpecialNumber {

	@Test
	public void testSpecialNumber() {
		Assert.assertTrue(SpecialNum.SpecialNumber(7));
		Assert.assertTrue(SpecialNum.SpecialNumber(19));
	}

	@Test
	public void testSpecialNumber1() {
		Assert.assertFalse(SpecialNum.SpecialNumber(4));
	}
	
	@Test
	public void testSpecialNumber2() {
		Assert.assertFalse(SpecialNum.SpecialNumber(-6));
	}
	
}

