package derik;

public class DefaultMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		
		//默认静态方法
		static void operate() {
			System.out.println("It is operate() in MyDefaultMethodTest");
		}
	}

}
