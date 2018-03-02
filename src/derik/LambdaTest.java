package derik;

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperate add = (a, b) -> a + b;
		MathOperate sub = (a, b) -> a - b;
		
		System.out.println(add.operate(5, 6));
		System.out.println(sub.operate(5, 6));
	}

	interface MathOperate {
		int operate(int a, int b);
		
		default int operateDefault(int a, int b) {
			return a + b;
		}
	}

}
