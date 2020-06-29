
import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TestTransposeMatrix {
	@Test
	public void testMatrix() {
		int A[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int exp[][] = { { 1, 5, 9, 13 }, { 2, 6, 10, 14 }, { 3, 7, 11, 15 }, { 4, 8, 12, 16 } };
		assertArrayEquals(exp, Transpose.transpose(A));
	}

	
	@Test
	public void testMatrix2() {
		int A[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int exp[][] = null;
		assertArrayEquals(exp, Transpose.transpose(null));
	}
}
