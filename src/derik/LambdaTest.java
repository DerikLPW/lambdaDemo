package derik;

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// lambda
		int result1 = operation(8, 8, (a, b) -> a + b);

		// 传统写法
		int result2 = operation(8, 8, new MathOperate() {
			@Override
			public int operate(int a, int b) {
				return a + b;
			}
		});

		System.out.println(result1);
		System.out.println(result2);

	}

	private static int operation(int a, int b, MathOperate mathOperate) {
		return mathOperate.operate(a, b);
	}

	@FunctionalInterface
	interface MathOperate {
		int operate(int a, int b);

		default int operateDefault(int a, int b) {
			return a + b;
		}
	}

}
