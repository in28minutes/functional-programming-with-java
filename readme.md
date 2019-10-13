# Functional Programming with Java

## Learn Functional Programming with Java using a Hands-on Step by Step Approach

Wanna start playing with Functional Programming? Want to write awesome Java code with Functional Programming using Streams, Lambda Expressions, Functional Interfaces and Method References? Want to make your Java Programs more performant and parallelizable using Functional Programming?

Functional Programming is an essential skill for Java Programmers today.

Are you ready to learn about Functional Programming and take the next step in your programming career?

Do you want to join 300,000+ learners having Amazing Learning Experiences with in28Minutes?

Look No Further!

#### Required Tools
- Java 9+
- Eclipse - Oxygen+ - (Embedded Maven From Eclipse)

#### Installing Guides
- [Playlist - Installing Java, Eclipse & Embedded Maven](https://www.youtube.com/playlist?list=PLBBog2r6uMCSmMVTW_QmDLyASBvovyAO3)

#### Troubleshooting Installations
- Eclipse and Embedded Maven
  - Troubleshooting Guide - https://github.com/in28minutes/in28minutes-initiatives/tree/master/The-in28Minutes-TroubleshootingGuide-And-FAQ#tip--troubleshooting-embedded-maven-in-eclipse
  - PDF - https://github.com/in28minutes/SpringIn28Minutes/blob/master/InstallationGuide-JavaEclipseAndMaven_v2.pdf
  - GIT Repository For Installation - https://github.com/in28minutes/getting-started-in-5-steps

## Course Overview

******* Course Overview *******

Functional Programming was introduced into Java in Java 8. Additional Functional Programming Enhancements were introduced in Java 9.

In this handson course, we will learn to write awesome Java code with Functional Programming. You will learn the basics of Functional Programming - Lambda Expressions, Method References, Streams and Functional Interfaces.

This course would be a perfect first step as an introduction to Functional Programming.

You will be using using Eclipse (Java IDE) and Java 9 in this course. We will help you set up each one of these.

## What you'll learn
- You will learn to write great Java code with Functional Programming
- You will solve a number of Java Puzzles and Exerices using Functional Programming
- You will learn the Fundamentals of Functional Programming - Lambda Expressions, Method References, Streams and Functional Interfaces
- You will learn about intermediate and terminal Stream operations - map, reduce, forEach, filter, distinct, sorted
- You will learn to simplify your Java code to play with List and Map using Functional Programming
- You will learn about a variety of Functional Interfaces - Predicate, Consumer, Supplier, BinaryOperator and Function
- You will learn to play with Java Files and Threads using Functional Programming
- You will learn some fundamentals of Functional Programming - Behavior Parameterization and Higher Order Functions
- You will Join 300,000 Learners having AMAZING LEARNING Experiences with in28Minutes

## Requirements
- You have an attitude to learn while having fun :)
- You have some programming experience with Java
- You DO NOT need to have any experience with Functional Programming
- We will help you install Eclipse and Java

## Who is this course for
- You are a Java Developer wanting to learn about Functional Programming
- You are a Java Developer and would like to discover a new approach to parallelizing your code

## Step By Step Details

### Introduction to the Course
- Step 01: Functional Programming with Java - Course Overview
- Step 02: Functional Programming with Java - Exporing Github Repo and Installations

### Introduction to Functional Programming with Java
- Step 01: Getting Started with Functional Programming with Java
- Step 02: Writing Your First Java Functional Program
- Step 03: Improving Java Functional Program with filter
- Step 04: Using Lambda Expression to enhance your Functional Program
- Step 05: Do Functional Programming Exercises with Streams, Filters and Lambdas
- Step 06: Using map in Functional Programs - with Exercises
- Step 07: Quick Review of Functional Programming Basics

### Playing with Streams
- Step 01: Learning Stream Operations - Calculate Sum using reduce
- Step 02: Playing with reduce
- Step 03: Exploring Streams with Puzzles in JShell
- Step 04: Do Functional Programming Exercises with Streams and reduce
- Step 05: Learn Stream Operations - distinct and sorted
- Step 06: Using Comparators to Sort Streams with sorted
- Step 07: Collecting Stream Elements to List using collect
- Step 08: Reviewing Streams - Intermediate and Stream Operations

### Exploring Java Functional Interfaces and Lambdas
- Step 01: Getting Started with Functional Interfaces - Predicate, Consumer and Function
- Step 02: Do Exercises with Functional Interfaces - BinaryOperator
- Step 03: Doing Behavior Parameterization with Functional Programming
- Step 04: Do Exercise with Behavior Parameterization
- Step 05: Exploring Supplier and UnaryOperator Functional Interfaces
- Step 06: Exploring BiPredicate, BiFunction, BiConsumer and Primitive Functional Interfaces
- Step 07: Playing Puzzles with Functional Interfaces and Lambdas
- Step 08: Exploring Method References with Java

### Java Functional Programming with Custom Classes
- Step 01: Creating Custom Class Course with some Test Data
- Step 02: Playing with allMatch, noneMatch and anyMatch
- Step 03: Sorting courses with sorted and creating Comparators
- Step 04: Playing with skip, limit, takeWhile and dropWhile
- Step 05: Finding top, max and min courses with max, min, findFirst and findAny
- Step 06: Playing with sum, average and count
- Step 07: Grouping courses into Map using groupingBy

### Playing with Java Functional Programming
- Step 01: Creating Streams using Stream of method and for Arrays
- Step 02: Creating Streams for First 100 Numbers, Squares of Numbers and More
- Step 03: Doing Big Number calculations with BigInteger

### Playing further with Java Functional Programming
- Step 01: Joining Strings with joining and Playing with flapMap
- Step 02: Creating Higher Order Functions
- Step 03: FP and Performance - Intermediate Stream Operations are Lazy
- Step 04: Improving Performance with Parallelization of Streams

### Functional Programming makes Java Easy
- Step 01: Modifying lists with replaceAll and removeIf
- Step 02: Playing with Files using Functional Programming
- Step 03: Playing with Threads using Functional Programming
- Step 04: Using Functional Programming in Java Applications


```sh
for file in *; do mv "${file}" "${file//-/ }"; done
for file in *; do mv "${file}" "${file//   / - }"; done
for file in *; do mv "${file}" "${file//01 Step/Step}"; done
```


### Commands Executed during the course

```
System.out.println("Ranga")
List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
numbers.stream().reduce(0, (x,y)->x+y)
numbers.stream().reduce(0, (x,y)->x)
numbers.stream().reduce(0, (x,y)->y)
numbers.stream().reduce(0, (x,y)-> x>y ? x:y)
numbers.stream().reduce(Integer.MIN_VALUE, (x,y)-> x>y ? x:y)
numbers.stream().reduce(Integer.MIN_VALUE, (x,y)-> x>y ? y:x)
numbers.stream().reduce(Integer.MAX_VALUE, (x,y)-> x>y ? y:x)
numbers
numbers
numbers.stream().reduce(0, (x,y) -> x*x + y*y)
numbers.stream().map(x -> x*x).reduce(0, Integer::sum)
numbers.stream().map(x -> x*x*x).reduce(0, Integer::sum)
numbers.stream().filter(x -> x%2==1).reduce(0, Integer::sum)
numbers.stream().filter(x -> x%2==0).reduce(0, Integer::sum)
numbers.stream().distinct().forEach(System.out::println)
numbers
numbers.stream().sorted().forEach(System.out::println)
numbers.stream().distinct().sorted().forEach(System.out::println)
List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
courses
courses.stream().sorted().forEach(System.out::println)
courses
courses.stream().sorted().forEach(System.out::println)
courses.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println)
courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println)
courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println)
numbers
courses
courses.stream().map(x -> x.length()).collect(Collectors.toList())
numbers.stream().map(x -> x*x).collect(Collectors.toList())
Supplier<String> supplier = () -> {return "Ranga";};
Consumer<String> consumer = (str) -> { System.out.println(str);System.out.println(str);};


numbers.stream()
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
List<String> courses2 = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
courses.stream().flatMap(course -> courses2.stream().map(course2 -> List.of(course,course2))).collect(Collectors.toList())
courses.stream().flatMap(course -> courses2.stream().map(course2 -> List.of(course,course2))).filter(list -> list.get(0).equals(list.get(1))).collect(Collectors.toList())
courses.stream().flatMap(course -> courses2.stream().map(course2 -> List.of(course,course2))).filter(list -> !list.get(0).equals(list.get(1))).collect(Collectors.toList())
courses.stream().flatMap(course -> courses2.stream().filter(course2 -> course2.length()==course.length()).map(course2 -> List.of(course,course2))).filter(list -> !list.get(0).equals(list.get(1))).collect(Collectors.toList())
courses.stream().filter(courses -> courses.length()>11).map(String::toUpperCase).findFirst()
courses.stream().peek(System.out::println).filter(courses -> courses.length()>11).map(String::toUpperCase).peek(System.out::println).findFirst()
courses.stream().peek(System.out::println).filter(courses -> courses.length()>11).map(String::toUpperCase).peek(System.out::println)
$4.findFirst()
List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
courses.replaceAll( str -> str.toUpperCase())
List<String> modifyableCourses = new ArrayList(courses);
modifyableCourses.replaceAll(str -> str.toUpperCase())
modifyableCourses
modifyableCourses.removeIf(course -> course.length()<6)
modifyableCourses

```

## Next Steps

## Todo
- Course Promotion Emails/Posts
  - 2 Emails on Udemy
  - 2 Emails to Email List
- Create YouTube Course Preview Video
  - Add YouTube Course Preview Video as End Video for all videos
  - Make it the YouTube Default Video
- Release atleast 20 small videos - one a day on Youtube
- Do atleast 3 Youtube live sessions
- After a Month
  - UFB and Packt



### Later

- Creating a Custom Functional Interface and Creating a Lambda Expression matching it!
- Clarify on Passing Behavior as a Parameter.
- Collectors.toMap(key, value)
- What are the constraints in using parallel() on the Streams?

- collect(ArrayList::new, ArrayList::add, ArrayList::addAll)		
- partitioningBy

Behavior Parameterization 
-> Tracing Performance of methods -> Pass function to track as a parameter
-> Externalize Sort Behavior as a parameter

Function Composition
- Function<String, Integer> lengthBis = unNullify.andThen(length);
- Function<String, Integer> lengthBis = length.compose(unNullify);
Consumer.andThen
- Predicate<String> startsWithJAndLengthIs7 = startsWithJ.and(lengthIs7);
- Predicate<String> lengthIs9orError = lengthIs9.or(equalsError);

Design Patterns
- Decorator Pattern
- Template Method - Execute Around Pattern
- Strategy Pattern - Even/Odd/Prime

Play based on Position:
- IntStream.range(0, input.size()).filter(pos -> input.get(pos).length() > pos).mapToObj(pos -> input.get(pos)).collect(Collectors.toList());

Lambda Expressions in Unit Tests => assertThrows

Currying f(x,y) = (g(x))(y)
- int function(BiFunction<Integer,Integer,Integer> func, Integer value1, Integer value2) { return func.apply(value1,value2); }
- function((x,y) -> x + y, 2, 3)
- BiFunction<Integer, Integer, Integer> curry(BiFunction<Integer,Integer,Integer> func) { return (x,y) -> func.apply(x,y); }
- BiFunction<Integer, Integer, Integer> add = curry( (x,y) -> x+y)
add.apply(1,2)

Map Operations
- keys.forEach(key -> map.compute(key, (k, v) -> v == null ? k : v.toUpperCase()));
- map.computeIfAbsent,Present,merge,putIfAbsent, computeIfPresent

