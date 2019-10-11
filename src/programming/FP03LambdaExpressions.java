package programming;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class FP03LambdaExpressions {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");

		courses.stream().sorted().forEach( (String x) -> System.out.println(x));
		
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		Integer sum = numbers.stream().reduce(0, (Integer x,Integer y) -> x + y);
		
		Supplier<Integer> randomSupplier = () -> {
			 // create instance of Random class 
	        Random rand = new Random(); 
	        return rand.nextInt(1000); 
		};
		
		System.out.println(randomSupplier.get());
		
		//Playing with Return Statements
		
		//Playing with Braces
		
		
	}
}
