package derik;

public class MethodJava8 {
	public static void main(String[] args) {

		// ::可以引用静态方法，对象的方法或构造函数
		// 静态方法引用
		Convert<String, Integer> convert = Integer::valueOf;

		Convert<String, Integer> convert2 = new Convert<String, Integer>() {

			@Override
			public Integer convert(String t1) {
				// TODO Auto-generated method stub
				return Integer.valueOf(t1);
			}

		};

		System.out.println(convert.convert("888"));
		System.out.println(convert2.convert("999"));

		UserFactory<User> userfactory = User::new;
		User user = userfactory.create("Test1", 11, "female");
		System.out.println(user.getName());

	}

	@FunctionalInterface
	interface Convert<T1, T2> {
		T2 convert(T1 t1);
	}

	interface UserFactory<U extends User> {
		U create(String name, int age, String gendle);
	}
}
