package derik;

public class LambdaTest2 {

	public static void main(String[] args) {
		
		/**
		 * 作用域问题
		 */
		
		// 引用一个块外部的变量，在内部不能修改它的值
		int c = 12; 
		test2(56, 45, (a, b) -> {
			a += 2;
			b += 2;
			int d = a + b + c;
			System.out.println(d);
		});
	}

	private static void test2(int a, int b, LambdaTestInterface2 lam2) {
		lam2.init(a, b);
	}

	public interface LambdaTestInterface2 {
		void init(int a, int b);
	}
}
