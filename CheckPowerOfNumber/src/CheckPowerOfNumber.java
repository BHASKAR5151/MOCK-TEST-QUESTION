public class CheckPowerOfNumber {
	public static void main(String[] args) {
		Boolean val = isPower(100, 1000);
		if (val) {
			System.out.println("Yes it is power of given number");
		} else {
			System.out.println("No it is not power of given number");
		}

	}

	public static boolean isPower(int x, int y) {
		int temp = 0;

		if (x == 1)
			return (y == 1);
		int pow = 1;
		if (x < y) {
			while (pow < y) {
				pow = pow * x;

			}
		}
		return (pow == y);
	}
}
