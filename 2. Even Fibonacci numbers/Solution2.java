public class Solution2 {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;

		int sum = b;

		int i = 3;
		while (a <= 4_000_000 && b <= 4_000_000) {
			if (i % 2 == 0) {
				b += a;
				if (b % 2 == 0) {
					sum += b;
				}
			} else {
				a += b;
				if (a % 2 == 0) {
					sum += a;
				}
			}
			i++;
		}
		System.out.println(sum);
	}
}
