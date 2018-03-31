package derik;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FunctionJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list =new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		// Predicate 函数接口
		// 接受一个入参，返回一个布尔值
		// 如果n>5，返回true
		Predicate<Integer> predicate = n -> n > 5;
		eval(list, predicate);
		// 接受一个入参，判断是否等于8，是返回true，即将表达是的结果作为布尔值返回
		eval(list, n -> n == 8);
		
	}
	
	public static void eval(List<Integer> list, Predicate<Integer> predicate){
		for (Integer temp : list) {
			if(predicate.test(temp)){
				System.out.println(temp);
			}
		}
	}

}
