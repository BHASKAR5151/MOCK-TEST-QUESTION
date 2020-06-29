
public class Transpose {

	static final int N = 4;

	static int[][] transpose(int A[][]) {
		if(A!=null) {
		for (int i = 0; i < N; i++)
			for (int j = i + 1; j < N; j++) {
				
				int temp = A[i][j];
				A[i][j] = A[j][i];
				A[j][i] = temp;
			}
		}
		return A;
	}

	public static void main(String[] args) {
		int A[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		//int A[][] = { { 1, 2, 3 }, { 5, 6, 7 }, { 9, 10, 11} };
		int B[][]=transpose(A);

		System.out.print("Modified matrix is \n");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(B[i][j] + " ");
			System.out.print("\n");
		}
	}
}
