import java.util.Scanner;
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Factorial fact = new Factorial();
		System.out.println(fact.factorial(n));
	}
}