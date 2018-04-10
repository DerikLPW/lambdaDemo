package derik;

public class DefaultMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * 默认方法
		 */
		
		MyDefaultMethodTest.operate();
		
		MyDefaultMethodTest myDefaultMethodTest = new MyDefaultMethodTest() {
		};
		
		myDefaultMethodTest.init();
	}

	public interface MyDefaultMethodTest {
		// 默认方法
		default void init() {
			System.out.println("It is init() in MyDefaultMethodTest");

		}
		
		//默认静态方法，不能通过对象访问
		static void operate() {
			System.out.println("It is operate() in MyDefaultMethodTest");
		}
	}

}
