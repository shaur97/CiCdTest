package calculator;

public class CalculatorCiCd {

	private static int addNos(int a, int b) {
		return a + b;
	}
	private static int subtractNos(int a, int b) {
		return a - b;
	}
	private static int multiplyNos(int a, int b) {
		return a * b;
	}
	private static int divideNos(int a, int b) {
		return a / b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorCiCd calculatorCiCd = new CalculatorCiCd();
		int sum = addNos(20, 5);
		int sub = subtractNos(20, 5);
		int mul = multiplyNos(20, 5);
		int div = divideNos(20, 5);
		System.out.println("Sum = " + sum + " sub = " + sub + " mul = " + mul + " div = " + div);		
	}
}
