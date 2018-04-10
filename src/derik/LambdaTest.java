package derik;

public class LambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * lambda和匿名类的对比
		 */

		// 匿名类的写法，当参数使用
		int result1 = operation(8, 8, new MathOperate() {
			@Override
			public int operate(int a, int b) {
				return a + b;
			}
		});

		// lambda，同样当参数使用
		int result2 = operation(8, 8, (a, b) -> a + b);

		System.out.println("匿名类：" + result1);
		System.out.println("Lambda：" + result2);
	}

	private static int operation(int a, int b, MathOperate mathOperate) {
		return mathOperate.operate(a, b);
	}

	@FunctionalInterface
	interface MathOperate {
		int operate(int a, int b);
	}
}
