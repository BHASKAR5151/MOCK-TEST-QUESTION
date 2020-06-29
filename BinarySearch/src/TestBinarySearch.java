import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class TestBinarySearch {

	@Test
	public void testBinary() {
		int arr[] = { 1, 10, 12, 14, 22, 36, 48 };
		int num = 14;
		assertTrue(BinarySearch.binarySearch(arr, 0, arr.length - 1, num));
	}

	@Test
	public void testBinary1() {
		int arr[] = { 1, 10, 12, 14, 22, 36, 48 };
		int num = 3;
		assertFalse(BinarySearch.binarySearch(arr, 0, arr.length - 1, num));
	}

	@Test
	public void testBinary2() {
		int arr[] = { 1, 10, 12, 14, 22, 36, 48 };
		int num = 14;
		assertFalse(BinarySearch.binarySearch(null, 0, arr.length - 1, num));
	}
}
