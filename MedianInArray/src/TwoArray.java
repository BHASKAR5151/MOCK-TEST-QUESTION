import java.util.Arrays;

class TwoArray {
	static double getMedian(int ar1[], int ar2[], int n1, int n2) {
		int i = 0;
		int j = 0;
		int k;
		double m1 = -1;
		double m2 = -1;

		for (k = 0; k <= (n1 + n2) / 2; k++) {

			if (i < n1 && j < n2) {
				if (ar1[i] < ar2[j]) {
					m2 = m1;
					m1 = ar1[i];
					i++;
				} else {
					m2 = m1;
					m1 = ar2[j];
					j++;
				}
			}
			// First Array small
			else if (i == n1) {
				m2 = m1;
				m1 = ar2[j];
				j++;
			}
			// Second ARray Small
			else if (j == n2) {
				m2 = m1;
				m1 = ar1[i];
				i++;
			}
		}

		if ((n1 + n2) % 2 == 0) {
			return (m1 + m2) / 2;
		}

		return m1;
	}

	public static void main(String[] args) {
		int ar1[] = { 1, 2, 5 };
		int ar2[] = { 6, 7, 8 };

		int n1 = ar1.length;
		int n2 = ar2.length;

		System.out.println("Median is " + getMedian(ar1, ar2, n1, n2));

	}
}