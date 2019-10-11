package programming;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FP03FunctionalInterfaces {
	
	/*
	 
	 boolean isEven(int x) {
	 	return x%2==0;
	 }
	 
	 int squared(int x) {
	 	return x * x;
	 }
	  
	 */

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
				
		Predicate<Integer> isEvenPredicate = x -> x%2==0;
		
		Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer x) {
				return x%2==0;
			}
			
		};

		Function<Integer, Integer> squareFunction = x -> x * x;
		
		Function<Integer, Integer> squareFunction2 = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer x) {
				return x*x;
			}
			
		};
		
		
		Consumer<Integer> sysoutConsumer = System.out::println;
		
		Consumer<Integer> sysoutConsumer2 = new Consumer<Integer>() {
			public void accept(Integer x) {
				System.out.println(x);
			}
		};
		
		numbers.stream()
			.filter(isEvenPredicate2)
			.map(squareFunction2)
			.forEach(sysoutConsumer2);

		BinaryOperator<Integer> sumBinaryOperator = Integer::sum;
		//BinaryOperator<Integer> sumBinaryOperator = (x,y) => x + y;
		
		
		BinaryOperator<Integer> sumBinaryOperator2 = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer a, Integer b) {
				// TODO Auto-generated method stub
				return a + b;
			}
			
		};
		
		
		int sum = numbers.stream()
			.reduce(0, sumBinaryOperator);
	}
}
