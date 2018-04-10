package derik;

public class LambdaTest3 {
	public static void main(String[] args) {
		
		/**
		 * 类型声明，圆括号，大括号的省略情况
		 */
		
		// 先看参数部分，主要看类型声明和括号的省略情况
		// 1.参数类型声明可选
		// 2.一个参数时，括号可选
		
		// 两个参数，没有省略时
		MathOperate1 mathOperate1_1 = (int a, int b) -> {
			System.out.println("two parameter");
			return a + b;
		};
		mathOperate1_1.operate(12, 45);

		// 两个参数，省略参数类型声明
		MathOperate1 mathOperate1_2 = (a, b) -> {
			System.out.println("two parameter");
			return a + b;
		};
		mathOperate1_2.operate(12, 45);

		// 一个参数，带类型声明，必须有括号
		MathOperate2 mathOperate2_1 = (int a) -> {
			System.out.println("one parameter");
			return a;
		};
		mathOperate2_1.operate(8);

		// 一个参数，省略类型声明
		MathOperate2 mathOperate2_2 = (a) -> {
			System.out.println("one parameter");
			return a;
		};
		mathOperate2_2.operate(8);

		// 一个参数，省略括号，必须同时省略类型声明
		MathOperate2 mathOperate2_3 = a -> {
			System.out.println("one parameter");
			return a;
		};
		mathOperate2_3.operate(8);

		// 无参数，不可省略括号
		MathOperate3 mathOperate3_1 = () -> {
			System.out.println("no parameter");
			return -1;
		};
		mathOperate3_1.operate();

		// 语句块部分
		// 1.一条语句，可省略大括号
		// 2.一条语句，未省略大括号，有返回值，则必须要return关键字
		
		// 一条语句，有返回值，语句块不止一条语句，不能省略大括号
		MathOperate1 operate1 = (a, b) -> {
			int c;
			return c = a + b;
		};
		operate1.operate(8, 8);

		// 一条语句，有返回值，有大括号，则必须有return
		MathOperate1 operate2 = (a, b) -> {
			return a + b;
		};
		operate2.operate(8, 8);
		
		// 一条语句，没有返回值，有大括号时，不需要return
		MathOperate4 operate3 = (a, b) -> {
			int c = a + b;
		};
		operate3.operate(8, 8);
		
		// 一条语句，省略大括号和return关键字，如果有返回值，表达式结果默认为返回值
		MathOperate1 operate4 = (a, b) -> a + b;
		operate4.operate(8, 8);

	}

	// 两个参数
	@FunctionalInterface
	interface MathOperate1 {
		int operate(int a, int b);
	}

	// 一个参数
	@FunctionalInterface
	interface MathOperate2 {
		int operate(int a);
	}

	// 无参数
	@FunctionalInterface
	interface MathOperate3 {
		int operate();
	}

	// 无返回值
	@FunctionalInterface
	interface MathOperate4 {
		void operate(int a, int b);
	}

}
