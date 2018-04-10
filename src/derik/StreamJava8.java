package derik;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * 创建Stream流
		 */
		List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f");
		List<String> filtered1 = list.stream()
				.filter(string -> !string.isEmpty())
				.collect(Collectors.toList());
		/**
		 * 聚合操作
		 */
		// foreach
		filtered1.forEach(s -> System.out.println(s));
		System.out.print("\n");

		// map
		List<Integer> mapNumbers = Arrays.asList(11, 2, 2, 6, 4, 3, 9);
		List<Integer> mapResult = mapNumbers.stream().map(a -> a * a)
				.distinct().collect(Collectors.toList());
		mapResult.forEach(System.out::println);
		System.out.print("\n");

		// filter
		List<Integer> filterNumbers = Arrays.asList(11, 2, 2, 6, 4, 3, 9);
		List<Integer> filterResult = filterNumbers.stream().filter(a -> a > 5)
				.collect(Collectors.toList());
		filterResult.forEach(System.out::println);
		System.out.print("\n");

		// limit
		List<String> limitStr = Arrays.asList("a", "b", "c", "d", "e", "f");
		List<String> limitResult = limitStr.stream().limit(2)
				.collect(Collectors.toList());
		limitResult.forEach(System.out::println);
		System.out.print("\n");

		// sorted
		List<Integer> sortedNumbers = Arrays.asList(11, 2, 2, 6, 4, 3, 9);
		List<Integer> sortedResult = sortedNumbers.stream()
				.sorted((a, b) -> a < b ? 1 : a == b ? 0 : -1)
				.collect(Collectors.toList());
		sortedResult.forEach(System.out::println);
		System.out.print("\n");

		// parallel
		List<String> parallelNumbers = Arrays.asList("a", "d", "a", "b", "c",
				"d", "e", "f");
		List<String> parallelResult = parallelNumbers.parallelStream()
				.filter(str -> str.equals("a")).collect(Collectors.toList());
		parallelResult.forEach(System.out::println);
		System.out.print("\n");

		// Collectors
		List<String> collectorsStr = Arrays.asList("a", "d", "a", "b", "c",
				"d", "e", "f");
		// 返回List
		List<String> collectorResultList = collectorsStr.stream()
				.filter(str -> !str.isEmpty()).collect(Collectors.toList());
		System.out.println("列表: " + collectorResultList);
		// 返回String
		String collectorResultString = collectorsStr.parallelStream()
				.filter(str -> !str.isEmpty()).collect(Collectors.joining("+"));
		System.out.println("合并: " + collectorResultString);
	}

}
