# Functional Programming with Java

## Learn Functional Programming with Java using a Hands-on Step by Step Approach

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

Architectures are moving towards Microservices and Cloud. Docker makes it easy to containerize your applications and make them cloud ready.

Docker is the No 1 Tool to Containerize your Java Spring Boot Applications. Learning Docker would help you streamline your deployment processes and experiment easily with new frameworks and tools. 

In this handson course, we will containerize - create docker images and create containers - for a variety of Spring Boot Applications:
- REST APIs - Hello World and Todo - Jar
- Todo Web Application War
- Full Stack Application with React and Spring Boot
- CCS and CES Microservices
- Eureka Naming Server and Zuul API Gateway

This course would be a perfect first step as an introduction to Docker.

You will be using containerizing a variety of projects created with  React (Frontend Framework), Spring Boot (REST API Framework), Spring (Dependency Management), Spring Security (Authentication and Authorization - Basic and JWT), BootStrap (Styling Pages), Maven (dependencies management), Node (npm), Visual Studio Code (TypeScript IDE), Eclipse (Java IDE) and Tomcat Embedded Web Server. We will help you set up each one of these.

## What you'll learn
- You will Learn the Fundamentals of Docker from Zero, no previous experience required
- You will learn the important Docker Concepts - Registry, Repository, Tag, Image,  Container and Volumes
- You will learn the important Docker commands  
- You will understand the Docker Architecture
- You will create Docker images for 8 Java Spring Boot Projects
- You will learn to use Dockerfile to Automate Building of your Docker Image
- You will learn to use various maven plugins - Dockerfile Spotify Plugin, JIB Plugin and Fabric8 Docker Maven Plugin - to create Docker images
- You will learn to create best practices with creating Docker Images - Improve Caching of Docker Images and create Multi Stage Docker Builds.
- You will Containerize Java Spring Boot Todo Web Application talking with MySQL
- You will Containerize Java Spring Boot React Full Stack Application with Docker
- You will Containerize CCS, CES Microservices, Eureka Naming Server and Zuul API Gateway with Docker and Run them using Docker Compose
- You will learn to run MySQL, RabbitMQ and Zipkin as Docker Containers
- You will learn the basics of Docker Networking - HOST, BRIDGE and NONE
- You will learn to use Docker Compose to Manage Your Containers
- You will learn the basics of Microservices
- You will Join 250,000 Learners having AMAZING LEARNING Experiences with in28Minutes

## Requirements
- You have an attitude to learn while having fun :)
- You have some programming experience with Java, Spring and Spring Boot
- You DO NOT need to have any experience with Docker
- We will help you install Eclipse, Visual Studio Code, Git client, Docker Desktop and Node JS (for npm)

## Who is this course for
- You are a Java Spring Boot developer getting started with the Cloud
- You want to containerize your Java applications with Docker
- You are a Java Developer and You are curious about Docker
- You want to learn to containerize a Java Spring Boot full stack application with Docker
- You want to learn to play with Docker and Spring Boot Microservices - Service Registry, Distributed Tracing and Zuul API Gateway

## Step By Step Details

### Introduction to the Course
- 00 Step 01 - Deploy Spring Boot Applications to Docker - Course Overview
- 00 Step 02 - Deploy Spring Boot Applications to Docker - Getting Started



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

