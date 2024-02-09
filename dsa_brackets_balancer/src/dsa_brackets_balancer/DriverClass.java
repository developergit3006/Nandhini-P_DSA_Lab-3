package dsa_brackets_balancer;

public class DriverClass {
	public static void main(String[] args) {
		test1();
		//test2();
	}
	static void test1() {
		String bracketsExpression = "{[()]}";
		
		Boolean result = testBalancedBracketsChecker(bracketsExpression);
		System.out.println(result);
	}
	static void test2() {
		String bracketsExpression = "[<<]";
		
		Boolean result = testBalancedBracketsChecker(bracketsExpression);
		System.out.println(result);
	}
	static Boolean testBalancedBracketsChecker(String bracketsExpression) {
		BalancedBracketsChecker checker=new BalancedBracketsChecker(bracketsExpression);
		return checker.check();
	}
}
 