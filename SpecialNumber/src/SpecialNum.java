
public class SpecialNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean flag = SpecialNumber(-9);
		if (flag) {
			System.out.println("Given Number is Special Number");
		} else {
			System.out.println("Given Number is not Special Number");
		}
	}

	public static Boolean SpecialNumber(int num) {

		int sum = 0;
		int rem = 0;
		boolean flag = false;
			while (num > 0) {
				rem = num % 10;
				sum = sum + rem * rem;
				num = num / 10;
			}
			if (sum > 9) {
				flag = SpecialNumber(sum);
			} else if (sum < 9 && sum != 1) {
				flag = false;
			} else {
				flag = true;
			}
			return flag;
		
	}
}
