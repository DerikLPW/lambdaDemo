package derik;

public class MethodJava8 {
	public static void main(String[] args) {

		/**
		 * 方法引用
		 */
		
		// ::可以引用静态方法，对象的方法或构造函数
		// 1.静态方法引用，引用方法的形参和返回值，需和接口中的一致
		Convert<String, Integer> convert = Integer::valueOf;
		System.out.println(convert.convert("888"));
		// 匿名类的方法实现
		Convert<String, Integer> convert2 = new Convert<String, Integer>() {

			@Override
			public Integer convert(String t1) {
				// TODO Auto-generated method stub
				return Integer.valueOf(t1);
			}

		};
		System.out.println(convert2.convert("999"));

		// 引用自定义类的静态方法
		Convert<String, Integer> convert3 = MyConvert::convert;
		System.out.println(convert3.convert("101010"));

		// 2.引用对象中的方法，静态方法不能通过对象引用
		MyConvert myConvert = new MethodJava8.MyConvert();
		//引用对象的成员方法
		Convert<String, Integer> convert4 = myConvert::convert2;
//		Convert<String, Integer> convert4 = myConvert::convert; //错误，不能引用静态方法
		System.out.println(convert4.convert("111111"));

		// 3.引用User的构造函数
		UserFactory<User> userfactory = User::new;
		User user = userfactory.create("Test2", 22, "male");
		System.out.println(user.getName());

		// 匿名类实现UserFactory
		UserFactory<User> userfactory2 = new UserFactory<User>() {
			@Override
			public User create(String name, int age, String gendle) {
				return new User(name, age, gendle);
			}
		};
		System.out.println(userfactory2.create("Test1", 11, "female").getName());
	}

	@FunctionalInterface
	interface Convert<T1, T2> {
		T2 convert(T1 t1);
	}

	interface UserFactory<U extends User> {
		U create(String name, int age, String gendle);
	}
	
	public static class MyConvert {

		public static Integer convert(String t1) {
			// TODO Auto-generated method stub
			return Integer.valueOf(t1);
		}
		
		public Integer convert2(String t1){

			return Integer.valueOf(t1);
		}
	}
}
