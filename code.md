<!---
Current Directory : /in28Minutes/git/functional-programming-with-java
-->

## JShell Commands Executed

```java

System.out.println("Ranga")

List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

numbers.stream().reduce(0, (x,y)->x+y)
numbers.stream().reduce(0, (x,y)->x)
numbers.stream().reduce(0, (x,y)->y)
numbers.stream().reduce(0, (x,y)-> x>y ? x:y)

numbers.stream().reduce(Integer.MIN_VALUE, (x,y)-> x>y ? x:y)
numbers.stream().reduce(Integer.MIN_VALUE, (x,y)-> x>y ? y:x)
numbers.stream().reduce(Integer.MAX_VALUE, (x,y)-> x>y ? y:x)

numbers.stream().reduce(0, (x,y) -> x*x + y*y)
numbers.stream().map(x -> x*x).reduce(0, Integer::sum)
numbers.stream().map(x -> x*x*x).reduce(0, Integer::sum)

numbers.stream().filter(x -> x%2==1).reduce(0, Integer::sum)
numbers.stream().filter(x -> x%2==0).reduce(0, Integer::sum)

numbers.stream().distinct().forEach(System.out::println)

numbers.stream().sorted().forEach(System.out::println)

numbers.stream().distinct().sorted().forEach(System.out::println)

List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");

courses.stream().sorted().forEach(System.out::println)

courses.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println)
courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println)
courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println)

courses.stream().map(x -> x.length()).collect(Collectors.toList())

numbers.stream().map(x -> x*x).collect(Collectors.toList())

Supplier<String> supplier = () -> {return "Ranga";};

Consumer<String> consumer = (str) -> { System.out.println(str);System.out.println(str);};

List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
numbers.stream()

Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).count()
Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15).reduce(0, Integer::sum)
Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15)

int[] numberArray = {12, 9, 13, 4, 6, 2, 4, 12, 15};
Arrays.stream(numberArray)
Arrays.stream(numberArray).sum()
Arrays.stream(numberArray).average()
Arrays.stream(numberArray).min()
Arrays.stream(numberArray).max()

IntStream.range(1,10)
IntStream.range(1,10).sum()
IntStream.rangeClosed(1,10).sum()

IntStream.iterate(1, e -> e + 2).limit(10).sum()
IntStream.iterate(1, e -> e + 2).limit(10).peek(System.out::println).sum()
IntStream.iterate(2, e -> e + 2).limit(10).peek(System.out::println).sum()
IntStream.iterate(2, e -> e * 2).limit(10).peek(System.out::println).sum()
IntStream.iterate(2, e -> e * 2).limit(10).boxed().collect(Collectors.toList())

Integer.MAX_VALUE
Long.MAX_VALUE

IntStream.rangeClosed(1,50).reduce(1, (x,y)->x*y)
LongStream.rangeClosed(1,50).reduce(1, (x,y)->x*y)
LongStream.rangeClosed(1,50).reduce(1L, (x,y)->x*y)
LongStream.rangeClosed(1,10).reduce(1, (x,y)->x*y)
LongStream.rangeClosed(1,20).reduce(1, (x,y)->x*y)
LongStream.rangeClosed(1,40).reduce(1, (x,y)->x*y)
LongStream.rangeClosed(1,50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply)

courses.stream().collect(Collectors.joining(" "))
courses.stream().collect(Collectors.joining(","))

"Spring".split("")

courses.stream().map(course -> course.split("")).collect(Collectors.toList())

courses.stream().map(course -> course.split(""))

courses.stream().map(course -> course.split("")).flatMap(Arrays::stream).collect(Collectors.toList())

courses.stream().map(course -> course.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList())

List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");

List<String> courses2 = List.of("Spring", "Spring Boot", "API" , "Microservices","
	AWS", "PCF","Azure", "Docker", "Kubernetes");

courses.stream().flatMap(course -> courses2.stream().map(course2 -> List.of(course,course2))).collect(Collectors.toList())

courses.stream().flatMap(course -> courses2.stream().map(course2 -> List.of(course,course2))).filter(list -> list.get(0).equals(list.get(1))).collect(Collectors.toList())

courses.stream().flatMap(course -> courses2.stream().map(course2 -> List.of(course,course2))).filter(list -> !list.get(0).equals(list.get(1))).collect(Collectors.toList())

courses.stream().flatMap(course -> courses2.stream().filter(course2 -> course2.length()==course.length()).map(course2 -> List.of(course,course2))).filter(list -> !list.get(0).equals(list.get(1))).collect(Collectors.toList())

courses.stream().filter(courses -> courses.length()>11).map(String::toUpperCase).findFirst()

courses.stream().peek(System.out::println).filter(courses -> courses.length()>11).map(String::toUpperCase).peek(System.out::println).findFirst()

courses.stream().peek(System.out::println).filter(courses -> courses.length()>11).map(String::toUpperCase).peek(System.out::println)

$4.findFirst()//Change $4 to your variable name

List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");

courses.replaceAll( str -> str.toUpperCase()) //Error

List<String> modifyableCourses = new ArrayList(courses);

modifyableCourses.replaceAll(str -> str.toUpperCase())
modifyableCourses.removeIf(course -> course.length()<6)

Runnable runnable3 = () -> IntStream.range(0, 10000).forEach(i -> System.out.println(Thread.currentThread().getId() + ":" + i))

```

## Complete Code Examples


### /file.txt

```
Some Text
Some Text that will be saved
A lot of Text Present in here
```
---

### /src/programming/FP05Files.java

```java
package programming;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FP05Files {

	public static void main(String[] args) throws IOException {
		
		// Files.lines(Paths.get("file.txt"))
		// .map(str -> str.split(" "))
		// .flatMap(Arrays::stream)
		// .distinct()
		// .sorted()
		// .forEach(System.out::println);
		
		Files.list(Paths.get("."))
			.filter(Files::isDirectory)
			.forEach(System.out::println);

	}

}
```
---

### /src/programming/FP03FunctionalInterfaces.java

```java
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
```
---

### /src/programming/FP02Functional.java

```java
package programming;

import java.util.List;
import java.util.stream.Collectors;

public class FP02Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		List<Integer> squaredNumbers = squareList(numbers);
		
		List<Integer> evenNumbersOnly = numbers.stream()
										.filter(x -> x%2==0)
										.collect(Collectors.toList());
		
		//System.out.println(squaredNumbers);
		System.out.println(evenNumbersOnly);
		
		// 0 12
		// 12 9 
		// 21 13
		// 34 4
		// 38 6
		// 44 2
		// 46 4
		// 50 12
		// 62 15
		// 77
		
		// int sum = addListFunctional(numbers);
		//
		// System.out.println(sum);

	}
	
	private static List<Integer> squareList(List<Integer> numbers) {
		//1 , 5, 6
		//1 -> 1
		//5 -> 25
		//6 -> 36
		
		return numbers.stream()
				.map(number -> number * number)
				.collect(Collectors.toList());
	}

	private static int sum(int aggregate, int nextNumber) {
		System.out.println(aggregate + " " + nextNumber);
		return aggregate + nextNumber;
	}

	private static int addListFunctional(List<Integer> numbers) {
		//Stream of number -> One result value
		  //Combine them into one result => One Value
		  // 0 and FP02Functional::sum
		return numbers.stream()
				.parallel()
		  //.reduce(0, FP02Functional::sum);	
		  // .reduce(0, (x,y) -> x + y);
			.reduce(0, Integer::sum);
	}
}
```
---

### /src/programming/FP02Structured.java

```java
package programming;

import java.util.List;

public class FP02Structured {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		int sum = addListStructured(numbers);
		
		System.out.println(sum);
		

	}

	private static int addListStructured(List<Integer> numbers) {
		//how to loop?
		//how to store the sum?
		int sum = 0;
		for(int number:numbers) {
			sum += number;
		}
		return sum;
	}
}
```
---

### /src/programming/FP05Threads.java

```java
package programming;

public class FP05Threads {

	public static void main(String[] args) {

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					System.out.println(Thread.currentThread().getId() + ":" + i);

				}

			}

		};

		Runnable runnable2 = () -> {
			for (int i = 0; i < 10000; i++) {
				System.out.println(Thread.currentThread().getId() + ":" + i);

			}
		};

		Thread thread = new Thread(runnable2);
		thread.start();

		Thread thread1 = new Thread(runnable2);
		thread1.start();

		Thread thread2 = new Thread(runnable2);
		thread2.start();

		/*
			Runnable runnable3 = 
					() -> IntStream.range(0, 10000)
					.forEach(i -> 
						System.out.println(Thread.currentThread().getId() + ":" + i));
		*/

	}

}
```
---

### /src/programming/FP05Parallelizing.java

```java
package programming;

import java.util.stream.LongStream;

public class FP05Parallelizing {
	
	public static void main(String[] args) {
		long time = System.currentTimeMillis();

		//0, 1000000000 869
		//System.out.println(LongStream.range(0,1000000000).sum());//499999999500000000
		
		//601
		System.out.println(LongStream.range(0,1000000000).parallel().sum());
		
		System.out.println(System.currentTimeMillis() - time);
	}

}
```
---

### /src/programming/FP01Structured.java

```java
package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		//printAllNumbersInListStructured(numbers);
		printEvenNumbersInListStructured(numbers);
		

	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		// How to loop the numbers?
		for (int number : numbers) {
			System.out.println(number);
		}

	}

	private static void printEvenNumbersInListStructured(List<Integer> numbers) {
		// How to loop the numbers?
		for (int number : numbers) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
		}

	}

}
```
---

### /src/programming/FP01Functional.java

```java
package programming;

import java.util.List;

public class FP01Functional { 
	
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		// printAllNumbersInListFunctional(numbers);
		//printEvenNumbersInListFunctional(numbers);
		printSquaresOfEvenNumbersInListFunctional(numbers);
	}

	// private static void print(int number) {
	// System.out.println(number);
	// }

	// private static boolean isEven(int number) {
	// return number%2 == 0;
	// }

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		// What to do?
		numbers.stream().forEach(System.out::println);// Method Reference
	}

	// number -> number%2 == 0
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		// What to do?

		numbers.stream() // Convert to Stream
				.filter(number -> number % 2 == 0) // Lamdba Expression
				.forEach(System.out::println);// Method Reference

		// .filter(FP01Functional::isEven)//Filter - Only Allow Even Numbers
	}
	
	private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream() // Convert to Stream
				.filter(number -> number % 2 == 0) // Lamdba Expression
				//mapping - x -> x * x
				.map(number -> number * number)
				.forEach(System.out::println);// Method Reference

		// .filter(FP01Functional::isEven)//Filter - Only Allow Even Numbers
	}

}
```
---

### /src/programming/FP01Exercises.java

```java
package programming;

import java.util.List;

public class FP01Exercises { 
	
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		printCubesOfOddNumbersInListFunctional(numbers);
//		printOddNumbersInListFunctional(numbers);
		
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		// courses.stream()
		// .forEach(System.out::println);

		// courses.stream()
		// .filter(course -> course.contains("Spring"))
		// .forEach(System.out::println);

		// courses.stream()
		// .filter(course -> course.length() >= 4)
		// .forEach(System.out::println);
		
		courses.stream()
			.map(course -> course + " " + course.length()) 
			.forEach(System.out::println);
	}

	private static void printOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream() // Convert to Stream
				.filter(number -> number % 2 != 0) // Lamdba Expression
				.forEach(System.out::println);// Method Reference
	}

	private static void printCubesOfOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream() // Convert to Stream
				.filter(number -> number % 2 != 0) // Lamdba Expression
				.map (number -> number * number * number)
				.forEach(System.out::println);// Method Reference
	}

}
```
---

### /src/programming/FP02StreamOperations.java

```java
package programming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP02StreamOperations {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		numbers.stream()
			.distinct() //Stream<T> Intermediate
			.sorted() //Stream<T>
			.forEach(System.out::println); //void

		List<Integer> squaredNumbers = numbers.stream()
				.map(number -> number * number) //Stream<R>
				.collect(Collectors.toList()); //R

		List<Integer> evenNumbersOnly = numbers.stream()
				.filter(x -> x % 2 == 0) //Stream<T>
				.collect(Collectors.toList());
		
		int sum = numbers.stream()
				.reduce(0, (x,y) -> x*x + y*y); //T
		
		int greatest = numbers.stream()
				.reduce(Integer.MIN_VALUE, (x,y)-> x>y ? x:y);
		
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");

		List<String> coursesSortedByLengthOfCourseTitle = courses.stream()
				.sorted(Comparator.comparing(str -> str.length()))
				.collect(Collectors.toList());
		
	}
}
```
---

### /src/programming/FP04CustomClass.java

```java
package programming;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	public Course(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public String toString() {
		return name + ":" + noOfStudents + ":" + reviewScore;
	}

}

public class FP04CustomClass {

	public static void main(String[] args) {
		List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 92, 20000),
				new Course("Kubernetes", "Cloud", 91, 20000));

		// allMatch, noneMatch, anyMatch
		Predicate<Course> reviewScoreGreaterThan95Predicate 
			= course -> course.getReviewScore() > 95;

		Predicate<Course> reviewScoreGreaterThan90Predicate 
			= course -> course.getReviewScore() > 90;
			
		Predicate<Course> reviewScoreLessThan90Predicate 
			= course -> course.getReviewScore() < 90;

		System.out.println(courses.stream().allMatch(reviewScoreGreaterThan95Predicate));
		
		System.out.println(courses.stream().noneMatch(reviewScoreLessThan90Predicate));
		
		System.out.println(courses.stream().anyMatch(reviewScoreLessThan90Predicate));
		
		System.out.println(courses.stream().anyMatch(reviewScoreGreaterThan95Predicate));
		
		Comparator<Course> comparingByNoOfStudentsIncreasing 
					= Comparator.comparingInt(Course::getNoOfStudents);
		
		System.out.println(
				courses.stream()
				.sorted(comparingByNoOfStudentsIncreasing)
				.collect(Collectors.toList()));
		//[FullStack:14000:91, Spring Boot:18000:95, Spring:20000:98, Docker:20000:92, Kubernetes:20000:91, AWS:21000:92, Azure:21000:99, API:22000:97, Microservices:25000:96]

		Comparator<Course> comparingByNoOfStudentsDecreasing 
					= Comparator.comparingInt(Course::getNoOfStudents).reversed();
		
		System.out.println(
				courses.stream()
				.sorted(comparingByNoOfStudentsDecreasing)
				.collect(Collectors.toList()));
		//[Microservices:25000:96, API:22000:97, AWS:21000:92, Azure:21000:99, Spring:20000:98, Docker:20000:92, Kubernetes:20000:91, Spring Boot:18000:95, FullStack:14000:91]
		
		
		Comparator<Course> comparingByNoOfStudentsAndNoOfReviews 
				= Comparator.comparingInt(Course::getNoOfStudents)
							.thenComparingInt(Course::getReviewScore)
							.reversed();

		System.out.println(
				courses.stream()
				.sorted(comparingByNoOfStudentsAndNoOfReviews)
				.collect(Collectors.toList()));
		//[Microservices:25000:96, API:22000:97, Azure:21000:99, AWS:21000:92, Spring:20000:98, Docker:20000:92, Kubernetes:20000:91, Spring Boot:18000:95, FullStack:14000:91]

		System.out.println(
				courses.stream()
				.sorted(comparingByNoOfStudentsAndNoOfReviews)
				.limit(5)
				.collect(Collectors.toList()));
		//[Microservices:25000:96, API:22000:97, Azure:21000:99, AWS:21000:92, Spring:20000:98]
		
		System.out.println(
				courses.stream()
				.sorted(comparingByNoOfStudentsAndNoOfReviews)
				.skip(3)
				.collect(Collectors.toList()));
		//[AWS:21000:92, Spring:20000:98, Docker:20000:92, Kubernetes:20000:91, Spring Boot:18000:95, FullStack:14000:91]


		System.out.println(
				courses.stream()
				.sorted(comparingByNoOfStudentsAndNoOfReviews)
				.skip(3)
				.limit(5)
				.collect(Collectors.toList()));
		//[AWS:21000:92, Spring:20000:98, Docker:20000:92, Kubernetes:20000:91, Spring Boot:18000:95]
		
		System.out.println(courses);
		
		//[Spring:20000:98, Spring Boot:18000:95, API:22000:97, Microservices:25000:96, FullStack:14000:91, AWS:21000:92, Azure:21000:99, Docker:20000:92, Kubernetes:20000:91]
		
		System.out.println(
			courses.stream()
			     .takeWhile(course -> course.getReviewScore()>=95)
			     .collect(Collectors.toList()));
		//[Spring:20000:98, Spring Boot:18000:95, API:22000:97, Microservices:25000:96]

		System.out.println(
				courses.stream()
				     .dropWhile(course -> course.getReviewScore()>=95)
				     .collect(Collectors.toList()));
		//[FullStack:14000:91, AWS:21000:92, Azure:21000:99, Docker:20000:92, Kubernetes:20000:91]

		System.out.println(
				courses.stream()
				.max(comparingByNoOfStudentsAndNoOfReviews));
		//Optional[FullStack:14000:91]

		System.out.println(
				courses.stream()
				.min(comparingByNoOfStudentsAndNoOfReviews)
				.orElse(new Course("Kubernetes", "Cloud", 91, 20000))
				);
				
		//Optional[Microservices:25000:96]
		//Microservices:25000:96
	
		System.out.println(
			courses.stream()
			.filter(reviewScoreLessThan90Predicate)
			.min(comparingByNoOfStudentsAndNoOfReviews)
			.orElse(new Course("Kubernetes", "Cloud", 91, 20000))
				);
		//Optional.empty
		//Kubernetes:20000:91
		
		System.out.println(
				courses.stream()
				.filter(reviewScoreLessThan90Predicate)
				.findFirst()
					);//Optional.empty
		

		System.out.println(
				courses.stream()
				.filter(reviewScoreGreaterThan95Predicate)
				.findFirst()
					);//Optional[Spring:20000:98]

		System.out.println(
				courses.stream()
				.filter(reviewScoreGreaterThan95Predicate)
				.findAny()
					);//Optional[Spring:20000:98]

		System.out.println(
				courses.stream()
				.filter(reviewScoreGreaterThan95Predicate)
				.mapToInt(Course::getNoOfStudents)
				.sum());//88000

		System.out.println(
				courses.stream()
				.filter(reviewScoreGreaterThan95Predicate)
				.mapToInt(Course::getNoOfStudents)
				.average());//OptionalDouble[22000.0]

		System.out.println(
				courses.stream()
				.filter(reviewScoreGreaterThan95Predicate)
				.mapToInt(Course::getNoOfStudents)
				.count());//4

		System.out.println(
				courses.stream()
				.filter(reviewScoreGreaterThan95Predicate)
				.mapToInt(Course::getNoOfStudents)
				.max());//OptionalInt[25000]
		
		System.out.println(
				courses.stream()
				.collect(Collectors.groupingBy(Course::getCategory)));
		//{Cloud=[AWS:21000:92, Azure:21000:99, Docker:20000:92, Kubernetes:20000:91], 
		//  FullStack=[FullStack:14000:91], 
		// Microservices=[API:22000:97, Microservices:25000:96],
		// Framework=[Spring:20000:98, Spring Boot:18000:95]}

		System.out.println(
				courses.stream()
				.collect(Collectors.groupingBy(Course::getCategory, Collectors.counting())));
		//{Cloud=4, FullStack=1, Microservices=2, Framework=2}

		System.out.println(
				courses.stream()
				.collect(Collectors.groupingBy(Course::getCategory, 
						Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));
		//{Cloud=Optional[Azure:21000:99], FullStack=Optional[FullStack:14000:91], Microservices=Optional[API:22000:97], Framework=Optional[Spring:20000:98]}

		System.out.println(
				courses.stream()
				.collect(Collectors.groupingBy(Course::getCategory, 
						Collectors.mapping(Course::getName, Collectors.toList()))));
		//{Cloud=[AWS, Azure, Docker, Kubernetes], FullStack=[FullStack], Microservices=[API, Microservices], Framework=[Spring, Spring Boot]}
		
		
		Predicate<Course> reviewScoreGreaterThan95Predicate2 
						= createPredicateWithCutoffReviewScore(95);

		Predicate<Course> reviewScoreGreaterThan90Predicate2 
						= createPredicateWithCutoffReviewScore(90);

	}

	private static Predicate<Course> createPredicateWithCutoffReviewScore(int cutoffReviewScore) {
		return course -> course.getReviewScore() > cutoffReviewScore;
	}
	

}
```
---

### /src/programming/FP03FunctionalInterfaces2.java

```java
package programming;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FP03FunctionalInterfaces2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

		Predicate<Integer> isEvenPredicate = (Integer x) -> x % 2 == 0;

		Function<Integer, Integer> squareFunction = x -> x * x;
		
		Function<Integer, String> stringOutpuFunction = x -> x + " ";

		Consumer<Integer> sysoutConsumer = x -> System.out.println(x);

		BinaryOperator<Integer> sumBinaryOperator = (x, y) -> x + y;
		
		//No input > Return Something
		Supplier<Integer> randomIntegerSupplier = () -> {
			Random random = new Random();
			return random.nextInt(1000);
		};
		
		//System.out.println(randomIntegerSupplier.get());
		
		UnaryOperator<Integer> unaryOperator = x -> 3 * x;
		System.out.println(unaryOperator.apply(10));
		
		BiPredicate<Integer, String> biPredicate = (number,str) -> {
			return number<10 && str.length()>5;
		};
		
		System.out.println(biPredicate.test(10, "in28minutes"));
		
		BiFunction<Integer, String, String> biFunction = (number,str) -> {
			return number + " " + str;
		};
		
		System.out.println(biFunction.apply(15, "in28minutes"));
		
		BiConsumer<Integer, String> biConsumer = (s1,s2) -> {
			System.out.println(s1);
			System.out.println(s2);
		};
		
		biConsumer.accept(25, "in28Minutes");
		
		BinaryOperator<Integer> sumBinaryOperator2 = (x, y) -> x + y;
		
		IntBinaryOperator intBinaryOperator = (x,y) -> x + y;
		
		//IntBinaryOperator
		//IntConsumer
		//IntFunction
		//IntPredicate
		//IntSupplier
		//IntToDoubleFunction
		//IntToLongFunction
		//IntUnaryOperator
		
		//Long, Double, Int
		

		//numbers.stream().filter(isEvenPredicate).map(squareFunction).forEach(sysoutConsumer);

		//int sum = numbers.stream().reduce(0, sumBinaryOperator);
	}
}
```
---

### /src/programming/FP03MethodReferences.java

```java
package programming;

import java.util.List;
import java.util.function.Supplier;

public class FP03MethodReferences {
	
	private static void print(String str) {
		System.out.println(str);
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", 
					"AWS", "PCF", "Azure", "Docker",
					"Kubernetes");
		
		courses.stream()
		 //.map(str -> str.toUpperCase())
		 .map(String::toUpperCase)
		 .forEach(FP03MethodReferences::print);
		
		Supplier<String> supplier = String::new;

	}
}
```
---

### /src/programming/FP03BehaviorParameterization.java

```java
package programming;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP03BehaviorParameterization {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		//filterAndPrint(numbers, x -> x%2==0);

		//filterAndPrint(numbers, x -> x%2!=0);
		
		filterAndPrint(numbers, x -> x%3==0);
		
		Function<Integer, Integer> mappingFunction = x -> x*x;
		
		List<Integer> squaredNumbers =  mapAndCreateNewList(numbers, mappingFunction);
		
		List<Integer> cubedNumbers =  mapAndCreateNewList(numbers, x -> x*x*x);
		
		List<Integer> doubledNumbers =  mapAndCreateNewList(numbers, x -> x + x);
		
		System.out.println(doubledNumbers);
		
	}

	private static List<Integer> mapAndCreateNewList(List<Integer> numbers,
			Function<Integer, Integer> mappingFunction) {
		return numbers.stream()
				.map(mappingFunction)
				.collect(Collectors.toList());
	}

	private static void filterAndPrint(List<Integer> numbers, Predicate<? super Integer> predicate) {
		numbers.stream()
		.filter(predicate)
		.forEach(System.out::println);
	}
}
```
---

### /src/programming/FP03LambdaExpressions.java

```java
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
```
