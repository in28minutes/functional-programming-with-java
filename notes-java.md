## Table of Contents

### Introduction to the Course
- Step 01: Functional Programming with Java - Course Overview
- Step 02: Functional Programming with Java - Exporing Github Repo and Installations

### [Chapter 1 - Introduction to Functional Programming with Java](#introduction-to-functional-programming-with-java)
- Step 01: Getting Started with Functional Programming with Java
- Step 02: Writing Your First Java Functional Program
- Step 03: Improving Java Functional Program with filter
- Step 04: Using Lambda Expression to enhance your Functional Program
- Step 05: Do Functional Programming Exercises with Streams, Filters and Lambdas
- Step 06: Using map in Functional Programs - with Exercises
- Step 07: Quick Review of Functional Programming Basics

### [Chapter 2 - Playing with Streams](#playing-with-streams)
- Step 01: Learning Stream Operations - Calculate Sum using reduce
- Step 02: Playing with reduce
- Step 03: Exploring Streams with Puzzles in JShell
- Step 04: Do Functional Programming Exercises with Streams and reduce
- Step 05: Learn Stream Operations - distinct and sorted
- Step 06: Using Comparators to Sort Streams with sorted
- Step 07: Collecting Stream Elements to List using collect
- Step 08: Reviewing Streams - Intermediate and Stream Operations

### [Chapter 3 - Exploring Java Functional Interfaces and Lambdas](#exploring-java-functional-interfaces-and-lambdas)
- Step 01: Getting Started with Functional Interfaces - Predicate, Consumer and Function
- Step 02: Do Exercises with Functional Interfaces - BinaryOperator
- Step 03: Doing Behavior Parameterization with Functional Programming
- Step 04: Do Exercise with Behavior Parameterization
- Step 05: Exploring Supplier and UnaryOperator Functional Interfaces
- Step 06: Exploring BiPredicate, BiFunction, BiConsumer and Primitive Functional Interfaces
- Step 07: Playing Puzzles with Functional Interfaces and Lambdas
- Step 08: Exploring Method References with Java

### [Chapter 4 - Java Functional Programming with Custom Classes](#java-functional-programming-with-custom-classes)
- Step 01: Creating Custom Class Course with some Test Data
- Step 02: Playing with allMatch, noneMatch and anyMatch
- Step 03: Sorting courses with sorted and creating Comparators
- Step 04: Playing with skip, limit, takeWhile and dropWhile
- Step 05: Finding top, max and min courses with max, min, findFirst and findAny
- Step 06: Playing with sum, average and count
- Step 07: Grouping courses into Map using groupingBy

### [Chapter 5 - Playing with Java Functional Programming](#playing-with-java-functional-programming)
- Step 01: Creating Streams using Stream of method and for Arrays
- Step 02: Creating Streams for First 100 Numbers, Squares of Numbers and More
- Step 03: Doing Big Number calculations with BigInteger

### [Chapter 6 - Playing further with Java Functional Programming](#playing-further-with-java-functional-programming)
- Step 01: Joining Strings with joining and Playing with flapMap
- Step 02: Creating Higher Order Functions
- Step 03: FP and Performance - Intermediate Stream Operations are Lazy
- Step 04: Improving Performance with Parallelization of Streams

### [Chapter 7 - Functional Programming makes Java Easy](#functional-programming-makes-java-easy)
- Step 01: Modifying lists with replaceAll and removeIf
- Step 02: Playing with Files using Functional Programming
- Step 03: Playing with Threads using Functional Programming
- Step 04: Using Functional Programming in Java Applications

## Introduction to Functional Programming with Java

### Step 01: Getting Started with Functional Programming with Java

- Functional programming is introduced as a different approach from traditional programming.

### Key Objectives

- To understand how functional programming differs from traditional programming.

- Introduction to basic functional programming concepts:

  - Streams

  - Lambda Expressions

  - Method References

### Hands-On Approach

- The course adopts a hands-on approach, starting with the creation of a new Java project in Eclipse suitable for functional programming.

### Setting Up the Java Project

1. **Open Eclipse** and select or create a new workspace.

2. **Create a New Java Project:**
   - Navigate to `File > New > Java Project`.
   - Name the project `functional-programming-with-java`.
   - Ensure the Java version is set to Java 9 or above (Java 9, 10, 11, 12 are compatible).

### Writing the First Code:

### Problem Statement

- **Objective:** Print a set of numbers, each on a separate line.

### Steps to Solve the Problem

1. **Create a New Java Class:**

   - Go to `File > New > Class`.
   - Name the class `FP01Structured`.
   - Package name: `programming`.
   - Include a `main` method by checking the appropriate box.

   ```java 
   public class FP01Structured {
       public static void main(String[] args) {
           printAllNumbersInListStructured(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
       }
   }

2. **Method to Print Numbers:**

    - Define a method printAllNumbersInListStructured(List<Integer> numbers).

    ```java
    private static void printAllNumbersInListStructured(List<Integer> numbers) {
      for (int number : numbers) {
          System.out.println(number);
      }
    }

3. **Run the Program:**

    - Right-click on the file in Eclipse.
    - Select Run As > Java Application.
    - Check the console for output.

  - The traditional approach focuses on "how" to achieve tasks, like looping through numbers.

---

### Step 02: Writing Your First Java Functional Program

### Key Objectives:

- Transition from a traditional programming approach to a functional approach in Java.

- Learn how to print a list of numbers using **streams** and **method references** in functional programming.

- Understand the functional programming focus on **"what to do"** rather than **"how to do it"**.

### Problem Statement:

**Objective**: Print a set of numbers from a list using a **functional programming approach**.

We previously solved this problem using a structured loop. Now, we will refactor the solution using functional programming.

### 1. Refactoring the Code to Use Streams

- In functional programming, we focus on **"what to do"** rather than **"how to do it"**. 

- Instead of explicitly looping through each element in the list, we can leverage **streams**.

### Refactoring the Method:

```java
private static void printAllNumbersInList(List<Integer> numbers) {
    numbers.stream()
           .forEach(FP01Functional::print); // Method reference
}
```

- `numbers.stream()`: Converts the list of numbers into a stream, which is a sequence of elements.

- `.forEach()`: Applies the specified action (in this case, printing) to each element in the stream.

- `FP01Functional::print`: This is a method reference to the print method, which will be used to print each number.

### 2. Creating the print Method

- The print method is a simple helper method that prints each number passed to it.

```java
private static void print(int number) {
    System.out.println(number);
}
```

- This method takes an integer and prints it to the console using `System.out.println()`.

- The method is referenced inside the stream's `forEach()` method to print each number from the list.

### Understanding Key Functional Programming Concepts
**Streams:** A stream is a sequence of elements that supports various operations to process data in a declarative way. In this case, we convert the list of numbers into a stream to process each element without manually looping.

**Method References (::):** Instead of passing a full lambda expression or explicitly calling a method inside `forEach()`, we use a method reference (`FP01Functional::print`). This is a shorthand for telling Java to execute the print method for each element in the stream.

#### When the program is run, it will print each number in the list as output.

#### Full Code Example:

```java
public class FP01Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        printAllNumbersInList(numbers);
    }

    private static void printAllNumbersInList(List<Integer> numbers) {
        numbers.stream() // Convert the list to a stream
               .forEach(FP01Functional::print); // Print each number using method reference
    }

    private static void print(int number) {
        System.out.println(number); // Print the number
    }
}
```

#### Output:

```
12
9
13
4
6
2
4
12
15
```

---

### Step 03: Improving Java Functional Program with filter

### Key Objectives
- Understand how to simplify the existing functional code.

- Learn how to filter data in a functional programming approach using **streams**.

- Compare the structured approach and functional approach for filtering even numbers from a list.

### Problem Statement:

**Objective**: Print only the even numbers from a list of numbers using both **structured** and **functional programming approaches**.

We will improve upon the functional program by adding a **filter** to select only even numbers.

### 1. Simplifying the Existing Functional Code

- In the previous lecture, we used a custom method (`print`) to print each number in the list.
- We can simplify this approach further by directly using `System.out::println`.

### Updated Functional Code:

```java
numbers.stream()
       .forEach(System.out::println); // Simplified method reference
```
- Instead of defining a separate `print` method, we can use Java’s built-in method reference `System.out::println`.

- This reduces complexity and makes the code more concise.

### 2. Problem - Printing Even Numbers in Structured Approach
- Let's go back to the structured approach in the   `FP01Structured` class and modify it to print only even numbers.

#### Structured Code:

```java
private static void printEvenNumbersInListStructured(List<Integer> numbers) {
    for (int number : numbers) {
        if (number % 2 == 0) {
            System.out.println(number);
        }
    }
}
```

- The condition `number % 2 == 0` checks whether a number is even by dividing the number by 2 and checking if the remainder is 0.

- If the number is even, it gets printed.

- When this structured approach runs, the output will only display even numbers from the list.

### 3. Printing Even Numbers in the Functional Approach

- Now, let's implement the same functionality using a functional approach with streams.

#### Refactoring to Use a Filter:

```java
private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
    numbers.stream()                // Convert the list to a stream
           .filter(FP01Functional::isEven)  // Filter to select even numbers
           .forEach(System.out::println);  // Print each even number
}
```

- `numbers.stream()`: This converts the list of numbers into a stream.

- `filter(FP01Functional::isEven)`: This applies a filter to the stream, only allowing numbers that pass the isEven condition.

- `forEach(System.out::println)`: After filtering, the remaining even numbers are printed.

### 4. Creating the `isEven` Method

- We need a method to check if a number is even, which will be used in the `filter()` function.

#### Method to Check Even Numbers:

```java
private static boolean isEven(int number) {
    return number % 2 == 0;
}
```

- The method checks if a number is divisible by 2 without a remainder.

- If the condition is true, it returns `true`, meaning the number is even.

### Method Reference:

In the functional approach, we pass the method reference `FP01Functional::isEven` into the `filter()` method, allowing the stream to filter numbers based on this condition.

### 5. Full Functional Code

```java
public class FP01Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        printEvenNumbersInListFunctional(numbers);
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()                       // Convert the list to a stream
               .filter(FP01Functional::isEven) // Filter only even numbers
               .forEach(System.out::println);  // Print each number
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;                // Check if the number is even
    }
}
```

#### Output:

```
12
4
6
2
4
12
```

- The list is filtered to contain only even numbers, which are then printed.

### Structured vs Functional Approach:

#### Structured Approach:
- We used a traditional `for` loop and an `if` statement to manually check each number and print the even numbers.

#### Functional Approach:
- We used a stream, applied a filter to select only even numbers, and then printed them using `forEach()` with a method reference to `System.out::println`.

---

### Step 04: Using Lambda Expression to enhance your Functional Program

### Key Objectives
- Learn about **Lambda Expressions** and how they simplify functional programming in Java.

- Replace the method reference (`isEven`) with a **Lambda Expression**.

- Understand how Lambda Expressions allow you to define logic directly within functional constructs.

### Introduction to Lambda Expressions
- In the previous step, we used a separate method (`isEven`) to filter even numbers from the list.

- While this works, it introduces unnecessary complexity since the logic is very simple.

- In this step, we’ll learn how to simplify this process using a **Lambda Expression**, a feature in Java that allows you to write the logic of a method in a more concise way, without needing to define a separate method.

### 1. Refactoring the `filter` to Use a Lambda Expression

- Instead of using a method reference like `FP01Functional::isEven`, we will define the logic for filtering even numbers **directly inside** the `filter()` method using a Lambda Expression.

### Lambda Expression Syntax:

```java
numbers.stream()
       .filter(number -> number % 2 == 0)  // Lambda Expression
       .forEach(System.out::println);      // Print the even numbers
```

- `number ->`: This is the Lambda Expression syntax. It means we are passing number as an argument to the function.

- `number % 2 == 0`: The logic checks whether the number is even (i.e., divisible by 2).

- `filter()`: Filters out only the even numbers.

- `forEach(System.out::println)`: Prints the filtered numbers.

- Instead of defining a separate method (isEven), we now define the entire logic inside the `filter()` method.

- The expression `number -> number % 2 == 0` takes each number, checks if it is even, and returns true or false.

- If the number is even (true), it passes through the filter and gets printed. If not, it is ignored.

### 2. Replacing the `isEven` Method

- Previously, we had a method called `isEven` that checked whether a number was divisible by 2.

- Now, this method is no longer needed, as the logic is directly handled by the Lambda Expression.

### Old Code with isEven Method:

```java
private static boolean isEven(int number) {
    return number % 2 == 0;
}
```

- This method can now be commented out or removed, as the Lambda Expression handles the same logic with fewer lines of code.

### 3. Full Functional Code with Lambda Expression

- Here is the full code that uses a Lambda Expression instead of a method reference:

```java
public class FP01Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        printEvenNumbersInListFunctional(numbers);
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()                       // Convert the list to a stream
               .filter(number -> number % 2 == 0)  // Lambda Expression to filter even numbers
               .forEach(System.out::println);  // Print each even number
    }
}
```

#### Output:

```
12
4
6
2
4
12
```

- The Lambda Expression `number -> number % 2 == 0` is used to filter even numbers.

- This makes the code more concise and eliminates the need for an external method like `isEven`.


### Method Reference vs Lambda Expression

#### Method Reference (`FP01Functional::isEven`):
- Refers to an existing method defined elsewhere. This is useful when you want to reuse logic defined in a separate method.

#### Lambda Expression (`number -> number % 2 == 0`):

- Defines the logic inline, making the code shorter and eliminating the need for separate methods.

---

### Step 05: Do Functional Programming Exercises with Streams, Filters and Lambdas

### Key Objectives

- Consolidate functional programming concepts learned so far through a series of exercises.

- Practice using **streams**, **filters**, and **lambda expressions** to solve problems in a functional style.
  
### Exercises Overview

In this lesson, we will perform the following exercises using functional programming techniques:

1. Print only the **odd numbers** from a list of integers.

2. Print all **courses** individually from a list of course names.

3. Print only the courses that **contain the word Spring**.

4. Print courses whose names have **at least four letters**.

### Exercise 1 - Printing Odd Numbers from the List

- The first exercise is to modify the method that prints even numbers to print **odd numbers** instead.

### Refactor the Code:

- We can use a similar logic as for even numbers, but this time we will check if a number is **odd** by modifying the condition.

#### Code:

```java
private static void printOddNumbersInListFunctional(List<Integer> numbers) {
    numbers.stream()
           .filter(number -> number % 2 != 0)  // Filter odd numbers
           .forEach(System.out::println);      // Print each odd number
}
```

- The `filter(number -> number % 2 != 0)` lambda expression checks if the number is odd.

- If the number is odd, it gets printed using `forEach(System.out::println)`.

#### Output:

```
9
13
15
```

- The output contains only the odd numbers from the list.

### Exercise 2 - Printing All Courses Individually

- In this exercise, we will work with a list of course names instead of numbers. The task is to print each course name on its own line.

#### Code:

```java
List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", 
                               "AWS", "PCF", "Azure", "Docker", "Kubernetes");

courses.stream()
       .forEach(System.out::println);  // Print each course name
```

- We convert the list of courses to a stream using `courses.stream()`.

- We print each course using `forEach(System.out::println)`.

#### Output:

```
Spring
Spring Boot
API
Microservices
AWS
PCF
Azure
Docker
Kubernetes
```

### Exercise 3 - Printing Courses That Contain the Word "Spring"

- For this exercise, the goal is to filter the list of courses and print only those that contain the word Spring.

#### Code:

```java
courses.stream()
       .filter(course -> course.contains("Spring"))  // Filter courses containing "Spring"
       .forEach(System.out::println);  // Print each filtered course
```

- The `filter(course -> course.contains("Spring"))` lambda expression checks if a course name contains the word "Spring".

- Only the courses that pass this condition are printed.

#### Output:

```
Spring
Spring Boot
```

### Exercise 4 - Printing Courses with at Least Four Letters

- In this final exercise, we need to filter the courses so that only those with four or more letters are printed.

#### Code:

```java
courses.stream()
       .filter(course -> course.length() >= 4)  // Filter courses with at least 4 characters
       .forEach(System.out::println);  // Print each filtered course
```

- The `filter(course -> course.length() >= 4)` lambda expression checks if the length of the course name is at least four.

- Only the courses that have names of four or more characters are printed.

#### Output:

```
Spring
Spring Boot
API
Microservices
Azure
Docker
Kubernetes
```

#### Full Code:
- Here’s the full code for all four exercises:

```java
public class FP01Exercises {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        printOddNumbersInListFunctional(numbers);

        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", 
                                       "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        // Exercise 2: Print all courses
        courses.stream()
               .forEach(System.out::println);
        
        // Exercise 3: Print courses that contain the word "Spring"
        courses.stream()
               .filter(course -> course.contains("Spring"))
               .forEach(System.out::println);

        // Exercise 4: Print courses with at least four letters
        courses.stream()
               .filter(course -> course.length() >= 4)
               .forEach(System.out::println);
    }

    private static void printOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
               .filter(number -> number % 2 != 0)  // Filter odd numbers
               .forEach(System.out::println);      // Print each odd number
    }
}
```

---

### Step 06: Using map in Functional Programs - with Exercises

### Key Objectives

- Learn how to use the **map()** function in Java streams.

- Understand how to transform data using **lambda expressions** and `map()`.

- Perform exercises to print squares, cubes, and the lengths of strings.

### Introduction to Mapping in Functional Programming

- In this lesson, we will learn how to transform elements in a stream using the **map()** function.
- The `map()` function allows us to apply a function to each element in a stream, transforming the data in some way.

- We’ll start by printing the **squares** of even numbers and then move on to other exercises.


### Printing Squares of Even Numbers

- The task is to print the squares of all **even numbers** in the list.

- Instead of simply printing the numbers, we will use the **map()** function to transform each even number into its square.

#### Code:

```java
private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
    numbers.stream()
           .filter(number -> number % 2 == 0)  // Filter only even numbers
           .map(number -> number * number)     // Map each number to its square
           .forEach(System.out::println);      // Print each squared number
}
```

- `filter(number -> number % 2 == 0)`: Filters only the even numbers.

- `map(number -> number * number)`: Maps each even number to its square.

- `forEach(System.out::println)`: Prints each squared number.

#### Output:

```
144
16
36
4
144
```

### Exercise 5 - Printing Cubes of Odd Numbers

- Now, let’s extend the logic to print the cubes of the odd numbers.

- A cube is calculated by multiplying a number by itself three times `(number * number * number)`.

#### Code:

```java
private static void printCubesOfOddNumbersInListFunctional(List<Integer> numbers) {
    numbers.stream()
           .filter(number -> number % 2 != 0)  // Filter only odd numbers
           .map(number -> number * number * number)  // Map each odd number to its cube
           .forEach(System.out::println);      // Print each cubed number
}
```

- `filter(number -> number % 2 != 0)`: Filters only the odd numbers.

- `map(number -> number * number * number)`: Maps each odd number to its cube.

- `forEach(System.out::println)`: Prints each cubed number.

#### Output:

```
729
2197
3375
```

### Exercise 6 - Printing the Number of Characters in Course Names

- In this exercise, we will print the length of each course name in a list of courses.
- We will use the `map()` function to transform each course name into its length (number of characters).

#### Code:

```java
List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", 
                               "AWS", "PCF", "Azure", "Docker", "Kubernetes");

courses.stream()
       .map(course -> course.length())        // Map each course to its length
       .forEach(System.out::println);         // Print the length of each course
```

- `map(course -> course.length())`: Maps each course name to the number of characters in the name.

- `forEach(System.out::println)`: Prints the length of each course name.

#### Output:

```
6
11
3
13
3
3
5
6
10
```

### Printing Course Names with Their Lengths

- To make it more informative, let’s modify the code to print both the course name and its length, side by side.

#### Code:

```java
courses.stream()
       .map(course -> course + " " + course.length())  // Map to "course name + length"
       .forEach(System.out::println);                 // Print the course and its length
```

- The `map(course -> course + " " + course.length())` expression maps each course to a string that combines the course name and its length, separated by a space.

- This will print both the name of the course and the number of characters in the name.

#### Output:

```
Spring 6
Spring Boot 11
API 3
Microservices 13
AWS 3
PCF 3
Azure 5
Docker 6
Kubernetes 10
```

### Full Code

- Here’s the full code with all the exercises included:

```java
public class FP01Exercises {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        
        // Printing squares of even numbers
        printSquaresOfEvenNumbersInListFunctional(numbers);

        // Printing cubes of odd numbers
        printCubesOfOddNumbersInListFunctional(numbers);
        
        // Printing number of characters in each course name
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", 
                                       "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        // Printing the length of each course
        courses.stream()
               .map(course -> course.length())
               .forEach(System.out::println);

        // Printing both course name and length
        courses.stream()
               .map(course -> course + " " + course.length())
               .forEach(System.out::println);
    }

    private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
               .filter(number -> number % 2 == 0)   // Filter only even numbers
               .map(number -> number * number)      // Map to square of each number
               .forEach(System.out::println);       // Print each squared number
    }

    private static void printCubesOfOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
               .filter(number -> number % 2 != 0)   // Filter only odd numbers
               .map(number -> number * number * number)  // Map to cube of each number
               .forEach(System.out::println);       // Print each cubed number
    }
}
```

---

### Step 07: Quick Review of Functional Programming Basics

### Key Objectives

- Review the foundational concepts of functional programming learned in the previous lessons.

- Understand the key functional programming constructs like **streams**, **filter**, **forEach**, **map**, **lambda expressions**, and **method references**.

### 1. Streams in Functional Programming

- In functional programming, we focus on specifying **what to do** rather than **how to do it**. The first step is to convert a **List** into a **stream**, which is a sequence of elements that can be processed functionally.

#### Example:

```java
List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2);
numbers.stream()  // Convert List to Stream
       .filter(number -> number % 2 != 0)  // Allow only odd numbers
       .forEach(System.out::println);  // Print each odd number
```
- The stream represents the sequence of elements from the list.

- The functional operations such as filter and forEach specify what should be done with each element in the stream.

### 2. The `filter()` Method

- The `filter()` method is used to allow only elements that meet a certain condition to pass through. All other elements are filtered out.

#### Example:

```java
numbers.stream()
       .filter(number -> number % 2 == 0)  // Allow only even numbers
       .forEach(System.out::println);
```

- In this example, we use `filter()` to allow only even numbers through the stream by checking if `number % 2 == 0`.

- If the condition is true, the number is passed to the next stage of the stream pipeline.

### 3. The `forEach()` Method

- The `forEach()` method is used to consume each element in the stream. This is typically where side effects occur, such as printing elements to the console.

#### Example:

```java
numbers.stream()
       .forEach(System.out::println);  // Print each number
```

- `forEach()` applies an operation (like printing) to each element in the stream.

- It is a terminal operation, meaning that it processes all elements in the stream and doesn’t return a new stream.

### 4. The `map()` Method

- The `map()` method is used to transform each element in the stream. It allows you to convert one value into another.

#### Example:

```java
numbers.stream()
       .map(number -> number * number)  // Square each number
       .forEach(System.out::println);
```

- `map()` takes each element in the stream and applies a transformation (in this case, squaring the number).

- The transformed values are then passed to the next stage of the stream pipeline.

### 5. Lambda Expressions

- A Lambda Expression is a simplified way of defining a method in a functional programming style. It provides a concise way to express a method using a shorter syntax.

#### Example:

```java
numbers.stream()
       .filter(number -> number % 2 == 0)  // Lambda expression to check even numbers
       .map(number -> number * number)     // Lambda expression to square the numbers
       .forEach(System.out::println);
```

- `number -> number % 2 == 0` is a lambda expression that checks if a number is even.

- `number -> number * number` is a lambda expression that squares each number.

- Lambda expressions allow us to define functional logic inline without writing separate methods.

#### Simplifying Methods with Lambdas:

- Instead of writing a full method, like:

```java
private static boolean isEven(int number) {
    return number % 2 == 0;
}
```

- We can replace it with a simpler lambda expression:

```java
number -> number % 2 == 0
```

### 6. Method References

- A Method Reference is a shorthand notation for referring to methods in Java, particularly when using functional programming.

- Method references allow you to call a method directly without explicitly using a lambda expression.

#### Example:

```java
numbers.stream()
       .forEach(System.out::println);  // Method reference to print each number
```

- `System.out::println` is a method reference that points to the println method, allowing us to print each element of the stream.

- We also used custom method references like `ClassName::methodName` to call static methods, such as `FP01Functional::isEven`.

#### Custom Method Reference:

```java
numbers.stream()
       .filter(FP01Functional::isEven)  // Method reference to custom static method
       .forEach(System.out::println);
```

---

## Playing with Streams

### Step 01: Learning Stream Operations - Calculate Sum using reduce

- In this section, we explore different ways to perform operations on streams in Java, specifically focusing on calculating the sum of a list of numbers.

- We will look at both a traditional structured approach and a functional programming approach using the Stream API and the `reduce` method.

### 1. Summing Numbers with the Traditional (Structured) Approach

- The structured approach involves manually looping through the list of numbers and accumulating the result in a temporary variable.

### Key Objectives:
- Understand how to sum numbers in a list using a loop.

- Learn how to initialize a sum variable and use an enhanced `for` loop to iterate through the list.

- Return the final sum after processing all numbers.

#### Code: Traditional Structured Approach

```java
import java.util.List;

public class FP02Structured {
    public static void main(String[] args) {
        // Step 1: Create a list of numbers
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        
        // Step 2: Calculate the sum using the structured approach
        System.out.println(addListStructured(numbers));  // Output: 77
    }

    // Step 3: Define a method to calculate the sum
    private static int addListStructured(List<Integer> numbers) {
        int sum = 0;  // Initialize sum to 0
        
        // Loop over each number in the list and add it to sum
        for (int number : numbers) {
            sum += number;
        }

        // Return the final sum
        return sum;
    }
}
```

- A list of numbers is created using `List.of(...)`.

- The `addListStructured` method loops through the list, adding each number to the sum variable initialized at 0.

- After the loop finishes, the final sum is returned and printed. In this example, the sum is `77`.

### 2. Functional Programming Approach: Using Streams and reduce

- Java’s Stream API offers a more functional and declarative way to process data.

- In this approach, we use the reduce method to calculate the sum of the numbers in the list.

### Key Objectives:

- Learn how to create a stream from a list of numbers.

- Use the reduce method to combine elements into a single result.

- Understand how the reduce method works with an identity value and an accumulator function.

#### Code: Functional Approach Using reduce

```java
import java.util.List;

public class FP02Functional {
    public static void main(String[] args) {
        // Step 1: Create a list of numbers
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        
        // Step 2: Calculate the sum using the functional approach
        System.out.println(addListFunctional(numbers));  // Output: 77
    }

    // Step 3: Define a method to calculate the sum using streams
    private static int addListFunctional(List<Integer> numbers) {
        return numbers.stream()  // Convert the list to a stream
                      .reduce(0, Integer::sum);  // Use reduce to sum the elements
    }
}
```

- A list of numbers is converted into a stream using `stream()`.

- The reduce method is used to combine the numbers into a sum. The first argument (0) is the identity value, and `Integer::sum` is the method reference used to add the numbers.

- The final result, which is the sum of the numbers, is returned and printed. The output is `77`.

### 3. Understanding the reduce Method

- The reduce method is a terminal operation in Java Streams that allows you to combine elements into a single result.

### Key Objectives:

- Understand the role of the identity value in the reduce method.

- Learn how the accumulator function works to combine elements in the stream.

- Apply reduce to sum numbers, but also recognize that it can be used for other operations such as finding the maximum, minimum, etc.

### Key Concepts:

- **Identity:** The initial value of the reduction operation. In this case, 0 is the identity for summing numbers.

- **Accumulator:** A function that defines how to combine two values. In this case, Integer::sum adds two numbers.

- **Result:** The final result after processing all elements in the stream.

Example:

```java
return numbers.stream()
              .reduce(0, Integer::sum);  // Reduce the numbers to their sum
```

#### In this code:

- The stream is reduced to a single value (sum) starting from 0 as the identity value.

- `Integer::sum` acts as the accumulator function to combine each pair of numbers.

### 4. Parallel Streams (Theoretical Concept)

- Java Streams can also be processed in parallel, enabling multi-threaded execution for performance improvement on large datasets.

### Key Objectives:

- Understand how parallel streams distribute data across multiple threads.

- Learn how changing `stream()` to `parallelStream()` can improve performance for large datasets.

#### Example of Using Parallel Stream:

```java
private static int addListParallel(List<Integer> numbers) {
    return numbers.parallelStream()
                  .reduce(0, Integer::sum);  // Sum numbers using parallel streams
}
```

- The `parallelStream()` method divides the list into smaller parts, processing them in parallel across multiple threads.

- The reduce operation remains the same but is now executed concurrently, which can improve performance for larger datasets.

---

### Step 02: Playing with `reduce` Stream Operation

- In this section, we dive deeper into the `reduce` method in Java Streams and explore what happens in the background when performing a reduction operation.

- We look at how values are aggregated step-by-step and how we can replace custom functions with lambda expressions or method references.

### Key Objectives:
- Understand how the `reduce` method works internally.

- Explore how values are combined during the reduction process.

- Learn to replace custom functions with lambda expressions.

- Use method references as a more concise way to perform operations like summing.

### 1. Understanding How `reduce` Works Internally

- The `reduce` method aggregates a stream of elements into a single result by combining elements one by one.

- In this case, we are summing numbers from a list. To better understand how `reduce` works, we can print out the values being combined during the reduction process.

### Key Objectives:

- Print out the intermediate values during the reduction.

- Understand how the aggregate value and the next number are combined at each step.

#### Code: Printing Intermediate Values in `reduce`

```java
import java.util.List;

public class FP02DebuggingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        
        // Step 1: Use a custom sum function with a sysout to print the values being passed to a and b
        int sum = numbers.stream()
                         .reduce(0, (a, b) -> {
                             System.out.println("a: " + a + ", b: " + b);  // Print current values of a and b
                             return a + b;  // Return the sum of a and b
                         });
        
        System.out.println("Sum: " + sum);  // Output the final sum
    }
}
```

- The reduce method takes an initial value (0 in this case) and combines each element in the stream with an accumulator function.

- We print out the values of a (the aggregate) and b (the next number in the list) during each step of the reduction process.

- The output shows how values are accumulated step-by-step.

#### Output:

```
a: 0, b: 12
a: 12, b: 9
a: 21, b: 13
a: 34, b: 4
a: 38, b: 6
a: 44, b: 2
a: 46, b: 4
a: 50, b: 12
a: 62, b: 15
Sum: 77
```

- The reduction starts with an initial value of 0 (the identity).

- Each number from the list is added to the current aggregate value.

#### For example:

```
0 + 12 = 12
12 + 9 = 21
21 + 13 = 34, and so on.
```

- The final result is the sum of all numbers: 77.

### 2. Using Lambda Expressions in `reduce`

- Instead of using a custom function, we can simplify the code with lambda expressions.

- A lambda expression allows you to define the logic of the reduction in a more concise way.

### Key Objectives:

- Replace custom logic with lambda expressions.

- Simplify the reduce operation by specifying how two values (x and y) should be combined.

#### Code: Using Lambda Expressions

```java
import java.util.List;

public class FP02LambdaReduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        
        // Step 1: Use a lambda expression to sum the numbers
        int sum = numbers.stream()
                         .reduce(0, (x, y) -> x + y);  // Lambda to add two numbers
        
        System.out.println("Sum: " + sum);  // Output the final sum
    }
}
```

- The lambda expression `(x, y) -> x + y` replaces the custom sum logic.

- Here, x represents the aggregate (current sum) and y represents the next number in the list.

- The reduce method combines x and y by adding them together, just like in the previous step, but with less code.

#### Output:

```
Sum: 77
```

### 3. Using Method References in reduce

- Java provides predefined methods for common operations like addition, which can be used with method references to make the code even simpler.

- In this case, we can use `Integer::sum` instead of writing our own sum logic.

### Key Objectives:

- Replace the lambda expression with a method reference for predefined operations.

- Use `Integer::sum` to add numbers instead of manually specifying the addition.

#### Code: Using Method References

```java
import java.util.List;

public class FP02MethodReferenceReduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        
        // Step 1: Use method reference Integer::sum to perform the reduction
        int sum = numbers.stream()
                         .reduce(0, Integer::sum);  // Method reference to sum numbers
        
        System.out.println("Sum: " + sum);  // Output the final sum
    }
}
```

- `Integer::sum` is a method reference that points to the predefined sum method in the Integer class, which takes two integers and returns their sum.

- The method reference simplifies the reduce operation even further, making the code cleaner and easier to understand.

#### Output:

```
Sum: 77
```

### Benefits of Using Method References:

- **Concise:** Reduces the amount of code written.
- **Readability:** Improves code readability by directly using predefined methods for common operations.

---

### Step 03: Exploring Streams with Puzzles in JShell

- In this lecture, we will explore the powerful **Stream API** in Java, focusing on how to use the `reduce` method to aggregate values from a stream.

- We will also learn how to use **JShell** for interactive coding, allowing us to quickly test and understand how streams work.

### Key Objectives
- Understand how to use JShell for experimenting with Java code.

- Learn how the `reduce` method works for aggregating values.

- Discover how to find the maximum and minimum values in a list using streams.

- Practice using lambda expressions to manipulate stream operations.

- Develop hands-on experience with interactive coding using JShell.

### 1. Introduction to **JShell**

- **JShell** is a tool introduced in Java 9 that allows you to experiment with Java code interactively.

- This is especially useful for learners who want to see the results of their code without setting up an entire project.

- With **JShell**, you can type in and execute Java code line by line. This makes learning Java easier because you don't need to write a complete program just to test a small piece of code.

- You can immediately see the results of what you’ve written, helping you understand concepts more quickly.

- **For example**: If you want to print a simple message, you can do it directly in JShell:

#### Code:

```java
System.out.println("Hello, JShell!");
```

#### Output:

```
Hello, JShell!
```

- This is a quick way to test your Java code without the need for an IDE or a complete Java project.

### Key Objectives:

- Learn how to launch and use JShell for quick Java experiments.

- Understand the benefits of interactive coding for immediate feedback.

### 2. Creating a List

- Next, we create a list of integers. This list will be used to perform various stream operations throughout the lecture.

- In Java, you can use the `List.of(...)` method to create a list of values.

- This method is simple and efficient for creating immutable lists. In our case, we create a list of integers which we will then manipulate using stream operations.

#### Code:

```java
List<Integer> numbers = List.of(12, 9, 13, 4, 6);
```

- This line creates a list with the numbers 12, 9, 13, 4, and 6.
- This list will be used in our reduce operations later on.

### Key Objectives:

- Understand how to create a list of integers in Java.
Use `List.of(...)` to create an immutable list for stream operations.

### 3. Understanding the Reduce Method

- The reduce method in streams is a powerful operation that allows us to aggregate values in a list or stream.

- It takes two parameters: an initial value and a function that defines how to combine elements.

### Example 1: Summing Values

- In this example, we use reduce to sum the numbers in our list.

#### Code:

```java
int sum = numbers.stream().reduce(0, (x, y) -> x + y);
```

- **Identity value:** The first argument 0 is the initial value, which serves as the starting point for the summation.

- **Lambda expression:** The second argument `(x, y) -> x + y` is a lambda expression that specifies how to combine each element with the current result.

- In this case, it adds the two numbers together.

#### Output:

```
Sum: 77
```

- This result shows that the sum of the numbers in the list is 77.

### Key Objectives:

- Understand the purpose of the initial value (identity) in the reduce method.

- Learn how to use a lambda expression to combine values in a stream.

- Explore how the reduce method aggregates all elements in the list into a single result.

### 4. Exploring Different Reduce Operations

- Now that we understand the basic use of reduce, let's explore different ways we can manipulate the reduce operation to see how the results change.

### Example 2: Returning Zero

- In this example, we change the reduce operation to always return the initial value, which is 0.

#### Code:

```java
int result = numbers.stream().reduce(0, (x, y) -> x);
```

- In this case, the lambda expression `(x, y) -> x` always returns the value of x (the current aggregate).

- Since the initial value is 0 and the function keeps returning x, the result will be:

#### Output:

```
Result: 0
```

- This is because the lambda expression never updates the value of x, so the result remains the initial value of 0.

### Example 3: Returning the Second Number

- Next, we modify the lambda expression to return the second argument (y) instead of the first.

### Key Objectives:

- Understand how the return values in the lambda expression affect the output of the reduce method.

- Experiment with different lambda expressions to see how they change the result of the reduction.

#### Code:

```java
int result = numbers.stream().reduce(0, (x, y) -> y);
```

- Here, the lambda expression `(x, y) -> y` returns the second argument (y), which is the current element from the list.

- This means that the last element processed by the stream will be the final result. The output will be:

#### Output:

```
Result: 15
```

- This is because 15 is the last number in the list.

### 5. Finding Maximum Values

- Now, let's find the maximum value in the list using the reduce method.

### Key Objectives:

- Learn how to find the maximum value in a list using the reduce method.

- Understand why using `Integer.MIN_VALUE` is important when dealing with negative numbers.

#### Code:

```java
int max = numbers.stream().reduce(0, (x, y) -> x > y ? x : y);
```

- In this case, we compare two numbers at a time and return the larger one using the condition `x > y ? x : y`. This ensures that as we iterate through the list, we keep track of the largest number we've seen so far.

- However, this approach has a limitation: it won't work properly if the list contains negative numbers.

- Since we are using 0 as the initial value, it will always be considered larger than any negative numbers in the list.

### Suggested Improvement

- To handle negative numbers, we can use `Integer.MIN_VALUE` as the starting value.

- This ensures that any number in the list will be larger than the initial value.

#### Code:

```java
int max = numbers.stream().reduce(Integer.MIN_VALUE, (x, y) -> x > y ? x : y);
```

### 6. Finding Minimum Values

- Just like finding the maximum value, we can use the reduce method to find the minimum value in the list.

### Key Objectives:

- Learn how to find the minimum value in a list using the reduce method.

- Understand how using Integer.MAX_VALUE helps in finding the smallest number in a list.

#### Code:

```java
int min = numbers.stream().reduce(Integer.MAX_VALUE, (x, y) -> x < y ? x : y);
```

- Here, we start with `Integer.MAX_VALUE`, which is the largest possible integer value. As we compare each element in the list, the lambda expression `x < y ? x : y` ensures that the smaller of the two values is returned.

#### Output:

```
Minimum Value: 2
```

- This confirms that the smallest value in the list is 2.

---

### Step 04: Do Functional Programming Exercises with Streams and reduce

- In this lecture, we will work through several exercises related to Java Streams and the `reduce` function.

- We will focus on practical applications of functional programming by squaring numbers, cubing numbers, and filtering for odd numbers. This hands-on approach will solidify our understanding of streams and their operations.

### Key Objectives

- Understand how to use the `map` function to transform data in streams.

- Learn to use the `reduce` method for aggregating results.

- Apply filtering techniques to isolate specific elements in a stream.

- Practice using functional programming concepts in Java.

### Exercises

- **Exercise 7**: Square each number in a given list and find the total sum of these squares.

- **Exercise 8**: Cube each number in the list and determine the total sum of these cubes.

- **Exercise 9**: Identify and sum only the odd numbers from the list.

### Exercise 7: Sum of Squares

### Key Objectives

- Learn how to use the `map` function to transform elements in a stream.

- Understand the `reduce` method and how it can aggregate results from a stream.

- Let's start with **Exercise 7**, which requires us to square every number in the list and find the sum of these squares.

### Steps
1. **Create a stream from the list of numbers**.

2. **Use `map` to square each number**.

3. **Use `reduce` to sum up the squared values**.

#### Code:

```java
int sumOfSquares = numbers.stream().map(x -> x * x).reduce(0, Integer::sum);
```

- The `map(x -> x * x)` transformation applies the squaring operation to each number in the list.

- The `reduce(0, Integer::sum)` operation takes the squared values and sums them up, starting from an initial value of 0.

#### Output:

```
Sum of Squares: 835
```

### Exercise 8: Sum of Cubes

### Key Objectives

- Understand how to modify the mapping operation to perform cubing.

- Practice using reduce for aggregation with different mathematical operations.

#### Steps

- Use map to cube each number.

- Use reduce to sum the cubed values.

#### Code:

```java
int sumOfCubes = numbers.stream().map(x -> x * x * x).reduce(0, Integer::sum);
```

- Similar to Exercise 7, we apply the cubing operation with `map(x -> x * x * x)`.

- Again, we use reduce to aggregate the results into a single sum.

### Key Objectives:

- Practice using the map function for transformations in streams.

- Understand the flexibility of the reduce method for different operations.

### Exercise 9: Sum of Odd Numbers

### Key Objectives

- Learn how to filter elements in a stream based on specific criteria.
'
- Understand how to combine filtering with reduction to achieve the desired result.

#### Steps

- Use filter to isolate odd numbers.

- Use reduce to sum these filtered values.

#### Code:

```java
int sumOfOddNumbers = numbers.stream().filter(x -> x % 2 == 1).reduce(0, Integer::sum);
```

- The `filter(x -> x % 2 == 1)` condition checks each number to see if it is odd (i.e., it has a remainder of 1 when divided by 2).

- After filtering, we use reduce to sum the remaining numbers.

#### Output:

```
Sum of Odd Numbers: 37
```

---

### Step 05: Learn Stream Operations - distinct and sorted

- In this lecture, we will explore two important stream operations in Java, **distinct** and **sorted**.

- These operations allow us to manipulate collections of data effectively by filtering out duplicates and arranging elements in a specific order.

### Key Objectives
- Understand the purpose of the `distinct` method in streams.

- Learn how to use the `sorted` method to order elements.

- Explore the combination of `distinct` and `sorted` for more refined data manipulation.

### 1. Introduction to Stream Operations

### Key Objectives

- Familiarize yourself with basic stream operations such as `distinct` and `sorted`.

- In the previous step, we learned about the `reduce` method. Now, we will look at two additional methods that are essential for stream manipulation: `distinct` and `sorted`.

### 2. Using the Distinct Method

### Key Objectives

- Learn how to eliminate duplicate values from a stream using the `distinct` method.

- Understand how to print distinct elements from a stream.

Let's say we have a stream of numbers. To get only the distinct numbers from this stream, we can use the following approach:

#### Code:

```java
numbers.stream().distinct().forEach(System.out::println);
```

- The `distinct()` method filters the stream to only include unique elements.

- The `forEach(System.out::println)` prints each distinct number to the console.

- When executed, this code will print only the unique numbers from the list, omitting any duplicates.

- For instance, if the list contains duplicates of 4 and 12, those numbers will appear only once in the output.

### 3. Using the Sorted Method

### Key Objectives

- Understand how the sorted method can be used to arrange elements in ascending order.

- Explore how sorted values retain duplicates.

- To sort the numbers in a stream, we can use the `sorted()` method:

#### Code:

```java
numbers.stream().sorted().forEach(System.out::println);
```

- The `sorted()` method sorts the elements of the stream in their natural order (ascending).

- The duplicates are retained, meaning if a number appears multiple times, it will be printed each time.

- For example, if the list includes 2, 4, 4, 6, 9, 12, 12, 13, 15, the sorted 
output will be:

```
2
4
4
6
9
12
12
13
15
```

### 4. Combining Distinct and Sorted

### Key Objectives

- Learn how to use both distinct and sorted together for more refined output.
If we want to get distinct values and have them sorted, we can combine both methods:

#### Code:

```java
numbers.stream().distinct().sorted().forEach(System.out::println);
```

- This combination first filters out duplicates with `distinct()` and then sorts the unique numbers with `sorted()`.

- The final output will be a list of distinct numbers in ascending order.

- For the same input list, the output will be:

```
2
4
6
9
12
13
15
```

### 5. Sorting Strings in Streams

### Key Objectives

- Understand how the sorted method can also be applied to collections of strings.

- In addition to numbers, we can also use the sorted method on a list of strings.

#### Code:

```java
List<String> courses = List.of("Java", "Python", "C++", "JavaScript");
courses.stream().sorted().forEach(System.out::println);
```

- This code sorts the list of course names in alphabetical order.

- The `sorted()` method arranges the strings, and `forEach(System.out::println)` prints each one.

#### Output:

```java
C++
Java
JavaScript
Python
```

---

### Step 06: Using Comparators to Sort Streams with sorted

- In this lecture, we will explore how to use **Comparators** in Java Streams to sort data according to custom criteria. We'll learn how to sort items in natural order, reverse order, and even by specific attributes such as string length.

### Key Objectives

- Understand how to use the `sorted` method with natural order.

- Learn to apply `Comparator` to sort items in reverse order.

- Create custom comparators for sorting based on specific criteria, such as string length.

- Practice using lambda expressions with comparators.

### 1. Introduction to Sorting with Comparators

### Key Objectives

- Familiarize yourself with the concept of natural order sorting using streams.

- In the previous lecture, we discussed how to sort a list of courses alphabetically. Now, we will explore how to define a custom sorting algorithm.

To sort the courses, we can use the following code:

#### Code:

```java
courses.stream().sorted().forEach(System.out::println);
```

- The `sorted()` method sorts the elements of the stream in their natural order. For strings, this means sorting alphabetically.

### 2. Sorting in Reverse Order

### Key Objectives

- Learn how to sort items in reverse order using Comparator.

- If we want to sort the courses in reverse alphabetical order, we can use a comparator:

#### Code:

```java
courses.stream()
       .sorted(Comparator.naturalOrder().reversed())
       .forEach(System.out::println);
```

- Here, `Comparator.naturalOrder()` specifies the natural order for sorting, while `reversed()` modifies this order to be descending.

- When executed, this will print the course names in reverse order, allowing you to see the courses sorted from Z to A.

- For example, if the original list is `["Java", "Python", "C++", "JavaScript", "Spring Boot"]`, the output will be:

```java
Spring Boot
Python
JavaScript
Java
C++
```

### 3. Creating Custom Comparators

### Key Objectives
- Understand how to define a custom comparator using lambda expressions.

- Sometimes, you may want to sort items based on specific criteria. For instance, let’s sort the courses by the length of their names.

#### Code:

```java
courses.stream()
       .sorted(Comparator.comparing(str -> str.length()))
       .forEach(System.out::println);
```

- In this example, `Comparator.comparing(str -> str.length())` creates a comparator that sorts the strings based on their lengths.

- This approach allows for flexible sorting based on different attributes.

- If the courses are `["Java", "Python", "C++", "JavaScript", "Spring Boot"]`, the output will be:

```java
C++
Java
Python
JavaScript
Spring Boot
```

---

### Step 07: Collecting Stream Elements to List using collect

- In this lecture, we will explore how to collect elements from a stream into a list using the `collect` method. We will see how to transform data, create new lists based on existing lists, and filter elements during the collection process.

### Key Objectives

- Understand how to use the `collect` method to gather stream elements into a list.

- Learn how to apply mapping to transform elements in a stream.

- Explore filtering techniques to create new lists based on specific criteria.

- Practice using lambda expressions in stream operations.

### 1. Introduction to Collecting Elements

### Key Objectives

- Familiarize yourself with stream manipulations and how to create new lists.

- Until now, we have manipulated elements of a list by performing operations like doubling, squaring, and cubing. We also learned how to use the `reduce()` function to produce a single result. 

- Now, we will focus on creating new lists based on existing data.

### Example Scenario

Let’s say we have a list of numbers and we want to create a new list that contains the squares of those numbers. 

### 2. Creating a Method to Double Values

### Key Objectives

- Learn how to define a method that utilizes streams for element transformation.

- We will start by creating a method called `doubleList` that takes a list of numbers and returns a new list containing their squares.

#### Code:

```java
List<Integer> squaredNumbers = doubleList(numbers);
```

- Here, `doubleList` is a method we will define to process the input list of numbers.

- Focusing on the `doubleList` Method

- Inside the `doubleList` method, we will implement the following steps:

### Convert the list to a stream.

- Use map to transform each number by squaring it.
- Collect the results into a new list.

#### Code:

```java
public List<Integer> doubleList(List<Integer> numbers) {
    return numbers.stream()
                  .map(number -> number * number)  // Square each number
                  .collect(Collectors.toList());     // Collect to a list
}
```

- The map method applies the squaring operation, transforming each number to its square.
- The `collect(Collectors.toList())` method gathers the transformed elements into a new list.

- When this method is executed with a list of numbers, it returns a new list containing the squares.

### 3. Filtering Even Numbers

### Key Objectives

- Understand how to filter elements in a stream based on specific criteria.
Now, let’s create a list containing only the even numbers from the original list.

#### Code:

```java
List<Integer> evenNumbersOnly = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
```

- The `filter(x -> x % 2 == 0)` condition checks each number to see if it is even.

- The filtered results are then collected into a new list.

- Running this code will yield a list containing only the even numbers from the original list.

### 4. Creating a List of Lengths of Course Titles

### Key Objectives

- Learn how to transform strings and collect their lengths into a list.
In the next exercise, we will create a list that contains the lengths of all course titles.

#### Code:

```java
List<Integer> courseLengths = courses.stream().map(course -> course.length()).collect(Collectors.toList());
```

- The `map(course -> course.length())` operation transforms each course title into its length.

- The lengths are then collected into a new list.

- When executed, this code provides a list of integers representing the lengths of each course title.

---

### Step 08: Reviewing Streams - Intermediate and Stream Operations

- In this lecture, we will review various operations related to streams in Java, specifically focusing on **intermediate** and **terminal** operations. 

- Understanding these concepts is crucial for effectively working with streams and manipulating data collections.

### Key Objectives
- Distinguish between intermediate and terminal operations in Java streams.
- Understand how intermediate operations transform streams and return new streams.
- Learn about terminal operations that produce a final result from a stream.
- Review practical examples of stream operations.

### 1. Introduction to Stream Operations

### Key Objectives

- Familiarize yourself with the different types of stream operations.

- So far in this course, we have performed numerous manipulations on lists, including sorting, filtering, and transforming elements.

- Now, let's categorize these operations into two main types: **intermediate operations** and **terminal operations**.

### 2. Intermediate Operations

### Key Objectives
- Learn about intermediate operations and their characteristics.

- Intermediate operations are those that transform a stream into another stream. They do not modify the original stream but instead return a new stream.

#### Some common intermediate operations include:

- **distinct()**: Filters out duplicate values from the stream.
- **sorted()**: Sorts the elements in natural order.
- **map()**: Transforms each element in the stream into a new value.
- **filter()**: Retains only those elements that match a specified condition.

### Code:

```java
List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());

List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());

List<Integer> squaredNumbers = numbers.stream().map(n -> n * n).collect(Collectors.toList());

List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
```

- Each of these operations takes the input stream and performs a transformation, resulting in a new stream.

- For example, `distinct()` returns a stream containing only unique elements, while map() applies a function to each element and returns a stream of modified values.

### 3. Terminal Operations

### Key Objectives

- Understand terminal operations and their role in stream processing.

- Terminal operations are the final operations in a stream processing pipeline. Unlike intermediate operations, they do not return a stream; instead, they produce a result or a side effect.

#### Common terminal operations include:

- `forEach()`: Iterates over each element in the stream and performs an action.

- `collect()`: Gathers the elements of a stream into a collection, such as a list, set, or map.

- `reduce()`: Combines the elements of a stream into a single result, based on a specified function.

#### Code:

```java
numbers.stream().forEach(System.out::println);
List<Integer> collectedNumbers = numbers.stream().collect(Collectors.toList());
int sum = numbers.stream().reduce(0, Integer::sum);
```

- `forEach()` consumes each element of the stream without returning anything (void).

- `collect()` transforms the stream into a collection type, such as a list or set.

- `reduce()` aggregates the stream's elements into a single value, like summing all the numbers.

- Terminal operations mark the end of the stream processing.
- Once a terminal operation is invoked, the stream is consumed, and no further operations can be performed on it.

---

## Exploring Java Functional Interfaces and Lambdas

### Step 01: Getting Started with Functional Interfaces - Predicate, Consumer and Function

### Key Objectives

- Understand what functional interfaces are and how they enable passing logic to methods.

- Learn about three key functional interfaces in Java: **Predicate**, **Consumer**, and **Function**.

- Explore how lambda expressions work under the hood and how functional interfaces simplify method logic.

- Refactor lambda expressions into explicit functional interface instances for better code clarity.

### Introduction to Functional Interfaces

**Objective**: Understand the role of functional interfaces in Java's functional programming.

- Functional interfaces are a core component of Java's approach to functional programming, introduced in Java 8. They allow us to pass logic to methods using lambda expressions.

- A functional interface is defined as an interface that contains exactly one abstract method. Java provides several built-in functional interfaces, such as `Predicate`, `Function`, and `Consumer`, which we will explore in this lecture.

### Refactoring with Lambda Expressions

**Objective**: Transition from using raw logic inside stream operations to assigning them to functional interfaces.

- Begin by looking at a common example using lambda expressions within stream operations to filter, map, and print numbers.

```java
List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
numbers.stream()
    .filter(x -> x % 2 == 0)   // Filter even numbers
    .map(x -> x * x)           // Square the numbers
    .forEach(System.out::println);  // Print each number
```

Here, three operations are performed:

- **Filter:** Filters even numbers using a lambda expression `x -> x % 2 == 0`.

- **Map**: Maps each number to its square with `x -> x * x`.

- **ForEach**: Prints the squared numbers using method reference `System.out::println`.

- In the background, each of these operations is associated with a functional interface (explored below).

### Introduction to Predicate Interface

- A Predicate is a functional interface that tests a condition on input and returns a boolean value. 

- In the example above, the filtering logic is `x -> x % 2 == 0`, which checks if a number is even.

- This lambda expression can be rewritten using the Predicate interface:

```java
Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;
```

- You can refactor the filter operation using the Predicate:

```java
numbers.stream()
    .filter(isEvenPredicate) // Use Predicate to filter even numbers
    .map(x -> x * x)
    .forEach(System.out::println);
```

- In essence, the Predicate interface provides a structure for filtering collections based on conditions.

#### Behind the Scenes:
A lambda expression like x -> x % 2 == 0 is internally equivalent to the following:

```java
Predicate<Integer> isEvenPredicate2 = new Predicate<>() {
    @Override
    public boolean test(Integer x) {
        return x % 2 == 0;
    }
};
```

- This shows how the lambda is actually turned into an object that implements the Predicate interface.

### Introduction to Function Interface

**Objective**: Understand how the Function interface handles input-output transformation logic.

- The Function interface represents a function that accepts one argument and returns a result. It is used to map one input to a corresponding output.

- In the stream example, the map operation squares each number, represented by the lambda `x -> x * x`.

- We can refactor this lambda into a Function:

```java
Function<Integer, Integer> squareFunction = x -> x * x;
```

- Now, you can refactor the map operation using this Function:

```java
numbers.stream()
    .filter(isEvenPredicate)
    .map(squareFunction)  // Use Function to map numbers to their squares
    .forEach(System.out::println);
```

#### Behind the Scenes:

The lambda `x -> x * x` is transformed into an object of the Function interface:

```java
Function<Integer, Integer> squareFunction2 = new Function<>() {
    @Override
    public Integer apply(Integer x) {
        return x * x;
    }
};
```

- The Function interface is essential for operations where we take an input and return an output, such as mapping elements in a stream.

### Introduction to Consumer Interface

**Objective**: Learn how the Consumer interface is used for operations that take input but return no result.

- A Consumer is a functional interface that accepts a single input and performs an action without returning any result.

- In our example, the method reference `System.out::println` is a Consumer that prints each number to the console.

- You can explicitly declare the Consumer for printing numbers:

```java
Consumer<Integer> sysoutConsumer = System.out::println;
```

- Refactor the forEach operation using the Consumer:

```java
numbers.stream()
    .filter(isEvenPredicate)
    .map(squareFunction)
    .forEach(sysoutConsumer);  // Use Consumer to print each number
```

#### Behind the Scenes:

The method reference System.out::println is internally represented as an implementation of the Consumer interface:

```java
Consumer<Integer> sysoutConsumer2 = new Consumer<>() {
    @Override
    public void accept(Integer x) {
        System.out.println(x);
    }
};
```

- The Consumer interface is widely used when you want to perform operations on data without returning a result (e.g., logging or saving data).

#### Full Code

```java
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;

public class FP03FunctionalInterfaces {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;
        Function<Integer, Integer> squareFunction = x -> x * x;
        Consumer<Integer> sysoutConsumer = System.out::println;

        numbers.stream()
            .filter(isEvenPredicate)   // Apply Predicate to filter even numbers
            .map(squareFunction)       // Apply Function to map numbers to squares
            .forEach(sysoutConsumer);  // Apply Consumer to print each number
    }
}
```

---

### Step 02: Do Exercises with Functional Interfaces - BinaryOperator

### Key Objectives

- Understand how to use the `BinaryOperator` functional interface in Java.

- Learn how method references like `Integer::sum` work behind the scenes.

- Implement and refactor a `BinaryOperator` to perform binary operations on two numbers.

- Explore the relationship between `BinaryOperator` and `BiFunction` interfaces.

### Exercise

**Objective**: Explore how method references work and implement the corresponding functional interface.

- In this exercise, we will take a closer look at the following code snippet, which uses a method reference:

```java
int sum = numbers.stream()
    .reduce(0, Integer::sum);
```

- This code reduces a list of numbers to their sum using `Integer::sum`. 

- Our goal is to determine the functional interface behind this method reference (`Integer::sum`) and create a manual implementation of this interface.

### Identifying the Functional Interface Behind `Integer::sum`

**Objective**: Understand how `Integer::sum` is linked to the BinaryOperator functional interface.

- The method reference `Integer::sum` refers to a method that adds two integers. This is an example of a binary operation, where two values are combined to produce one result.

- The functional interface behind this is BinaryOperator `<T>`, a specialized version of the BiFunction `<T, T, T>` interface where both the arguments and the result are of the same type (Integer in this case).

```java
BinaryOperator<Integer> sumBinaryOperator = Integer::sum;
```

#### In this code:

- `BinaryOperator<Integer>` is a functional interface that operates on two Integer values and returns an Integer.

- `Integer::sum` is a method reference that implements this binary operation.

#### Behind the Scenes:

- The method reference `Integer::sum` is shorthand for a lambda expression like this:

```java
BinaryOperator<Integer> sumBinaryOperator = (a, b) -> a + b;
```

- This lambda expression performs the same addition operation, taking two integers as input and returning their sum.

### Implementing the BinaryOperator Interface

**Objective**: Create a manual implementation of the BinaryOperator interface and understand its structure.

- We can manually implement the BinaryOperator interface using the following approach:

```java
BinaryOperator<Integer> sumBinaryOperator2 = new BinaryOperator<>() {
    @Override
    public Integer apply(Integer a, Integer b) {
        return a + b;
    }
};
```

#### In this code:

- The apply method defines the logic for combining two Integer values, in this case, adding them.

- The result type is also Integer, which matches the input types.

- This manual implementation achieves the same result as `Integer::sum` but without using a method reference or lambda expression. It illustrates the structure of the functional interface behind the method reference.

### Exploring BinaryOperator and BiFunction Interfaces

**Objective**: Understand the relationship between BinaryOperator and BiFunction.

- The `BinaryOperator<T>` interface is a specialized version of the `BiFunction<T, T, R>` interface where both input arguments and the return type are of the same type (T).

- The apply method of BinaryOperator takes two parameters and returns a result of the same type:

```java
@FunctionalInterface
public interface BinaryOperator<T> extends BiFunction<T, T, T> {
    T apply(T t1, T t2);
}
```

#### In the example we are working with:

- T is Integer.

- The method apply takes two integers as input (a and b) and returns their sum.

- This explains why `Integer::sum` can be used as a `BinaryOperator<Integer>` because it adds two integers and returns the result, all of type Integer.

### Refactoring BinaryOperator to a Lambda Expression

**Objective**: Refactor the BinaryOperator implementation into a lambda expression for conciseness.

- We can simplify the implementation of the BinaryOperator using a lambda expression, which is more concise and readable:

```java
BinaryOperator<Integer> sumBinaryOperatorLambda = (a, b) -> a + b;
```

- This lambda expression is equivalent to both the method reference (`Integer::sum`) and the manual implementation using the apply method.

#### Explanation of Lambda Expression:

- (a, b) represents two input integers.

- a + b is the operation that adds these integers.

- The result is returned directly from the lambda expression.

- By using lambda expressions, we achieve a more succinct way to express binary operations while adhering to the BinaryOperator interface.

#### Finding the Maximum:

```java
BinaryOperator<Integer> maxBinaryOperator = (a, b) -> a > b ? a : b;
```

#### Finding the Minimum:

```java
BinaryOperator<Integer> minBinaryOperator = (a, b) -> a < b ? a : b;
```

#### Multiplying Two Numbers:

```java
BinaryOperator<Integer> multiplyBinaryOperator = (a, b) -> a * b;
```

- These operations demonstrate the versatility of the BinaryOperator interface for performing various types of operations on pairs of values.

#### Full Code:

```java
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        // Using BinaryOperator with Integer::sum
        BinaryOperator<Integer> sumBinaryOperator = Integer::sum;
        int sum = numbers.stream()
                         .reduce(0, sumBinaryOperator);
        System.out.println("Sum: " + sum);

        // Using BinaryOperator as a lambda expression
        BinaryOperator<Integer> sumLambda = (a, b) -> a + b;
        int sum2 = numbers.stream()
                          .reduce(0, sumLambda);
        System.out.println("Sum using Lambda: " + sum2);
    }
}
```

---

### Step 03: Doing Behavior Parameterization with Functional Programming

### Key Objectives

- Understand the concept of behavior parameterization in functional programming.

- Learn how to pass behavior (logic) as an argument to methods.

- Implement a flexible method to filter and print numbers based on varying criteria.

- Explore how this technique enhances code reusability and maintainability.

### Introduction to Behavior Parameterization

**Objective**: Understand what behavior parameterization means and how it applies to functional programming.

- In this section, we are introduced to **behavior parameterization**, a technique that allows us to pass the logic (or behavior) of a method as an argument to another method.

- This enables us to write more flexible and reusable code.

- For instance, the expression `x % 2 == 0` defines the behavior for determining if a number is even. By extracting this logic, we can avoid repetition in our code and allow for easy modifications in the future.

- This approach is significant because it promotes the idea of treating behaviors as first-class citizens in programming. Instead of just passing data, we are passing logic, which opens up new possibilities for dynamic code execution.

### Initial Implementation of Filtering Numbers

**Objective**: Start with a basic implementation to filter even and odd numbers.

- Lets begin with a simple implementation that prints out even and odd numbers from a list:

```java
numbers.stream()
       .filter(x -> x % 2 == 0) // Filter for even numbers
       .forEach(System.out::println); // Print each even number

numbers.stream()
       .filter(x -> x % 2 != 0) // Filter for odd numbers
       .forEach(System.out::println); // Print each odd number
```

#### In this code:

- We use the filter method to separate even and odd numbers based on the provided logic.

- The first block filters for even numbers, while the second block filters for odd numbers.

- However, there is a clear problem, both blocks of code are nearly identical, differing only in the filtering condition.

- This duplication not only makes the code harder to maintain but also suggests that we can refactor it for greater clarity and efficiency.

### Identifying Code Duplication

**Objective**: Recognize the duplication in the existing code and prepare for refactoring.

- We recognize significant duplication, as both blocks perform similar operations with different filtering logic.

- The only difference lies in the condition used to filter numbers. This realization prompts us to consider a more efficient way to manage this behavior.

#### Extracting Predicate Logic

To address this issue, we can create predicates that encapsulate the filtering logic for even and odd numbers:

```java
Predicate<Integer> evenPredicate = x -> x % 2 == 0; // Predicate for even numbers
Predicate<Integer> oddPredicate = x -> x % 2 != 0;  // Predicate for odd numbers
```

- By defining these predicates, we can refer to the logic in a more meaningful way and reduce code repetition.

- This refactoring is a fundamental practice in programming that enhances readability and maintainability.

### Creating a Generic Filter and Print Method

**Objective**: Develop a method that accepts a predicate for filtering numbers.

- Next, we create a generic method called `filterAndPrint` that accepts a list of numbers and a predicate as parameters.

- This allows us to filter the numbers based on any condition we choose:

```java
public void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
    numbers.stream()
           .filter(predicate) // Use the passed predicate for filtering
           .forEach(System.out::println); // Print each filtered number
}
```

- Now, we can use this method to filter even or odd numbers, significantly simplifying our code:

```java
filterAndPrint(numbers, evenPredicate); // Filter and print even numbers
filterAndPrint(numbers, oddPredicate); // Filter and print odd numbers
```

- This approach eliminates duplication and makes the code cleaner and more modular. By externalizing the logic, we are not only enhancing readability but also making our code more adaptable to changes in requirements.

### Enhancing Flexibility with Behavior Parameterization

**Objective**: Explore the benefits of passing behavior as parameters.

- One of the most exciting aspects of this method is that we can pass different filtering logic to filterAndPrint.

- **For example**: To filter multiples of 3, we can define a new predicate:

```java
Predicate<Integer> multipleOfThreePredicate = x -> x % 3 == 0; // Predicate for multiples of 3
filterAndPrint(numbers, multipleOfThreePredicate); // Filter and print multiples of 3
```

- This ability to change the filtering logic dynamically is powerful.

- It means that instead of hardcoding behaviors into our methods, we can now customize them at runtime based on the needs of our application.

- By passing behavior as parameters, we externalize the logic and give our methods the flexibility to adapt. This leads to cleaner code that is easier to maintain and extend. 

#### Full Code:

```java
import java.util.List;
import java.util.function.Predicate;

public class FP03BehaviorParameterization {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        // Using behavior parameterization to filter and print numbers
        filterAndPrint(numbers, x -> x % 2 == 0); // Print even numbers
        filterAndPrint(numbers, x -> x % 2 != 0); // Print odd numbers
        filterAndPrint(numbers, x -> x % 3 == 0); // Print multiples of 3
    }

    public static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers.stream()
               .filter(predicate) // Use the passed predicate for filtering
               .forEach(System.out::println); // Print each filtered number
    }
}
```

---

### Step 04: Do Exercise with Behavior Parameterization

### Key Objectives:

- Understand how to implement behavior parameterization in Java.

- Learn to create flexible methods that can apply different mathematical operations on a list of numbers.

- Explore the concept of first-class functions and their significance in Java programming.

### Exercise

**Objective**: Get familiar with behavior parameterization through a practical exercise.

- In this exercise, we will focus on behavior parameterization by creating a method that can handle different mathematical operations like squaring, cubing, doubling, or tripling numbers in a list.

- This enables us to pass the desired behavior as an argument, allowing for greater flexibility in our code.

- Previously, we created a list of squared numbers using the following code:

```java
numbers.stream()
       .map(x -> x * x) // Mapping x to its square
       .collect(Collectors.toList()); // Collecting the results into a list
```

- Now, the goal is to refactor this code so that we can easily switch between different operations by passing different functions as parameters.

### Refactoring for Behavior Parameterization

**Objective**: Refactor the existing code to introduce behavior parameterization.

- To start, we can define a mappingFunction that encapsulates the behavior we want to apply to each number in the list. For example, to square the numbers:

```java
Function<Integer, Integer> mappingFunction = x -> x * x; // Function to square numbers
```

- Next, we will extract this logic into a method that takes both the list of numbers and the mapping function as parameters:

```java
public List<Integer> mapAndCreateNewList(List<Integer> numbers, Function<Integer, Integer> mappingFunction) {
    return numbers.stream()
                  .map(mappingFunction) // Using the passed mapping function
                  .collect(Collectors.toList()); // Collecting the results
}
```

- By extracting this method, we allow for any transformation logic to be passed in, making the method reusable for various operations.

### Implementing Different Operations

**Objective**: Use the new method to create lists of squared, cubed, and doubled numbers.

- With our `mapAndCreateNewList` method in place, we can now easily apply different mathematical transformations to our list of numbers.

- Here’s how we can use the method for squaring, cubing, and doubling:

```java
// Squaring numbers
List<Integer> squaredNumbers = mapAndCreateNewList(numbers, x -> x * x);

// Cubing numbers
List<Integer> cubedNumbers = mapAndCreateNewList(numbers, x -> x * x * x);

// Doubling numbers
List<Integer> doubledNumbers = mapAndCreateNewList(numbers, x -> x + x);
```

- This flexibility allows us to use the same method with different logic just by changing the function we pass in.

- **For example**: To print the doubled numbers, we can do:

```java
System.out.println("Doubled Numbers: " + doubledNumbers);
```

- When we run this code, we see that we can seamlessly switch between different operations without duplicating code.

### The Concept of First-Class Functions

**Objective**: Understand the significance of first-class functions in Java.

- During this exercise, we observe that functions now have a first-class status in Java.

- This means that we can treat functions like any other variable, allowing us to:

- Pass functions as parameters to other methods.

- Store functions in variables.

- Return functions from other methods.

#### For instance, we can create a variable that holds a function:

```java
Function<Integer, Integer> square = x -> x * x; // Function to square a number
```

- This flexibility is essential for writing more modular and reusable code. It allows us to externalize behavior and apply it dynamically, leading to clearer and more maintainable applications.

#### Full Code:

```java
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BehaviorParameterizationExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // Using behavior parameterization to create lists of squared, cubed, and doubled numbers
        List<Integer> squaredNumbers = mapAndCreateNewList(numbers, x -> x * x);
        List<Integer> cubedNumbers = mapAndCreateNewList(numbers, x -> x * x * x);
        List<Integer> doubledNumbers = mapAndCreateNewList(numbers, x -> x + x);

        // Printing results
        System.out.println("Squared Numbers: " + squaredNumbers);
        System.out.println("Cubed Numbers: " + cubedNumbers);
        System.out.println("Doubled Numbers: " + doubledNumbers);
    }

    public static List<Integer> mapAndCreateNewList(List<Integer> numbers, Function<Integer, Integer> mappingFunction) {
        return numbers.stream()
                      .map(mappingFunction) // Using the passed mapping function
                      .collect(Collectors.toList()); // Collecting the results
    }
}
```

---

### Step 05: Exploring Supplier and UnaryOperator Functional Interfaces

### Key Objectives:

- Understand the Supplier functional interface and its applications.

- Learn about the UnaryOperator functional interface and how it operates.

- Explore the significance of functional interfaces in Java and their role in functional programming.

### Introduction to Functional Interfaces

- In prior lessons, we explored several key functional interfaces:

- **Predicate**: Represents a boolean condition based on an input.

- **Function**: Takes an input and produces an output, potentially of a different type.

- **Consumer**: Accepts an input but does not return any output.

- Now, we will expand our knowledge by introducing two more functional interfaces: **Supplier** and **UnaryOperator**.

### Understanding the Supplier Interface

**Objective**: Learn about the Supplier interface, its purpose, and its usage.

- The **Supplier** interface provides a mechanism to generate or supply values without requiring any input. This makes it distinct from other interfaces we've discussed.

- A Supplier is useful in scenarios such as factory patterns, where you want to create objects or generate values without needing any external input.

Here's how we can define a Supplier of integers:

```java
Supplier<Integer> randomIntegerSupplier = () -> 2; // A simple supplier returning the number 2
```

However, a more practical use case would be to return a random number:

```java
Supplier<Integer> randomIntegerSupplier = () -> {
    Random random = new Random();
    return random.nextInt(10000); // Returns a random integer less than 10000
};
```

- In this example, we create a Supplier that returns a random integer between 0 and 9999. This is executed using:

```java
System.out.println(randomIntegerSupplier.get());
This allows us to retrieve random numbers each time we call get(), 
```

- illustrating how Suppliers work in practice.

### Characteristics of Suppliers

- The Supplier interface is straightforward; it has one abstract method, `get()`, which does not take any parameters.

- This makes it ideal for scenarios where you want to create values or objects on demand without requiring any input.

- For instance, in a game, you might use a Supplier to generate random events, enemies, or power-ups without the need for specific parameters each time.

### Understanding the UnaryOperator Interface

- The UnaryOperator interface is a specialization of the Function interface. It represents a function that takes a single input and returns a result of the same type.

- Essentially, it operates on one element and produces a result of the same type.

#### Here’s an example of a UnaryOperator that triples an integer:

```java
UnaryOperator<Integer> tripleOperator = x -> 3 * x; // Takes an integer and returns its triple
```

We can then use this operator to transform an integer:

```java
System.out.println(tripleOperator.apply(10)); // Outputs 30
```

- This showcases how UnaryOperators can be utilized to transform values while maintaining the same data type.

### Key Features of UnaryOperator

- The UnaryOperator interface is valuable because it simplifies operations on single values while ensuring that the input and output types remain consistent.

- It is particularly useful in scenarios where you need to apply transformations to data within streams or collections.

**For example**: When working with Java streams, you can easily apply UnaryOperators to modify data as it flows through the stream pipeline:

```java
List<Integer> numbers = List.of(1, 2, 3, 4, 5);
List<Integer> tripledNumbers = numbers.stream()
                                      .map(tripleOperator)
                                      .collect(Collectors.toList());
```

- This makes it easy to transform collections with clean and readable code.

### Exploring Java's Functional Interfaces Package

- Both Supplier and UnaryOperator, along with other functional interfaces, are found in the `java.util.function package`. 

- This package includes various interfaces designed to work with Java's functional programming features, such as:

- **BiPredicate**: A predicate that takes two inputs.

- **BiFunction**: A function that takes two inputs and produces an output.

- **BiConsumer**: A consumer that takes two inputs and does not return anything.

- These interfaces allow for more complex operations and are helpful when dealing with multiple inputs in a functional style.

#### Full Code:

```java
import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterfacesExample {
    public static void main(String[] args) {
        // Supplier example: generates random integers
        Supplier<Integer> randomIntegerSupplier = () -> {
            Random random = new Random();
            return random.nextInt(10000); // Returns a random integer less than 10000
        };
        
        // Testing the supplier
        System.out.println("Random Number: " + randomIntegerSupplier.get());

        // UnaryOperator example: triples a number
        UnaryOperator<Integer> tripleOperator = x -> 3 * x;

        // Testing the unary operator
        System.out.println("Triple of 10: " + tripleOperator.apply(10)); // Outputs 30
    }
}
```

---

### Step 06: Exploring BiPredicate, BiFunction, BiConsumer and Primitive Functional Interfaces

### Key Objectives:

- Understand the concepts and usage of BiPredicate, BiFunction, and BiConsumer functional interfaces.

- Learn about primitive functional interfaces and their advantages in Java.

- Explore the significance of using primitive types for improved performance.

### Introduction to BiPredicate

**Objective**: Explore the BiPredicate interface and its functionality.

- The **BiPredicate** interface is a specialized version of the Predicate interface that accepts two inputs instead of one.

- The result is still a boolean value, which allows it to evaluate conditions based on two different parameters.

#### For example:

```java
BiPredicate<Integer, String> biPredicate = (number, str) -> number < 10 && str.length() > 5;
```

- In this example, we define a BiPredicate that checks if a number is less than 10 and if the length of a given string is greater than 5.

- We can easily test this BiPredicate with various inputs:

```java
System.out.println(biPredicate.test(5, "in28minutes")); // Prints true
System.out.println(biPredicate.test(15, "test")); // Prints false
```

- This output illustrates how BiPredicate allows us to evaluate more complex conditions involving two variables, showcasing its flexibility in functional programming.

### Understanding BiFunction

- The BiFunction interface takes two inputs and produces a single output.

- Unlike BiPredicate, which always returns a boolean, BiFunction can return any type of output.

- This makes it useful for various scenarios where two inputs are combined into a single result.

#### For example:

```java
BiFunction<Integer, String, String> biFunction = (number, str) -> number + " " + str;
```

- In this case, the BiFunction concatenates an integer and a string into a single string.

- We can apply this BiFunction like so:

```java
System.out.println(biFunction.apply(15, "in28minutes")); // Prints "15 in28minutes"
```

- This demonstrates how BiFunction can be used to manipulate or combine multiple inputs into a meaningful output, providing flexibility in handling data transformations.

### Exploring BiConsumer

- The BiConsumer interface is similar to Consumer but accepts two inputs and does not return a result.

- It is typically used for operations where you want to process two inputs, such as logging or printing.

#### For example:

```java
BiConsumer<Integer, String> biConsumer = (s1, s2) -> {
    System.out.println(s1);
    System.out.println(s2);
};
```

- This BiConsumer simply prints both inputs.

- To use the BiConsumer:

```java
biConsumer.accept(15, "in28minutes"); // Prints 15 and then in28minutes
```

- This shows that BiConsumer is helpful in scenarios where you want to perform an action on multiple inputs without returning any value.

### Primitive Functional Interfaces

Java also provides primitive versions of functional interfaces, such as:

- IntPredicate

- IntFunction

- IntConsumer

- IntBinaryOperator

These interfaces are designed specifically to operate with primitive types, allowing for more efficient processing without the overhead of boxing and unboxing associated with wrapper classes.

#### For example, instead of using:

```java
BinaryOperator<Integer> intBinaryOperator = (x, y) -> x + y;
```

We can use:

```java
IntBinaryOperator intBinaryOperator = (x, y) -> x + y;
```

- This approach eliminates the need for boxing and improves performance, especially in scenarios involving large datasets or performance-critical applications.

### Advantages of Primitive Functional Interfaces

Using primitive functional interfaces allows for:

- **Improved Performance**: Eliminates boxing and unboxing, reducing memory overhead and improving speed.

- **Simpler Code**: Facilitates the handling of primitive data types directly, making the code cleaner and easier to read.

- For instance, using an IntBinaryOperator directly with primitive int types avoids unnecessary conversion, which can lead to more efficient code execution.

#### Full Code:

```java
import java.util.function.BiPredicate;
import java.util.function.BiFunction;
import java.util.function.BiConsumer;

public class FunctionalInterfacesExample {
    public static void main(String[] args) {
        // BiPredicate example
        BiPredicate<Integer, String> biPredicate = (number, str) -> number < 10 && str.length() > 5;
        System.out.println(biPredicate.test(5, "in28minutes")); // Prints true

        // BiFunction example
        BiFunction<Integer, String, String> biFunction = (number, str) -> number + " " + str;
        System.out.println(biFunction.apply(15, "in28minutes")); // Prints "15 in28minutes"

        // BiConsumer example
        BiConsumer<Integer, String> biConsumer = (s1, s2) -> {
            System.out.println(s1);
            System.out.println(s2);
        };
        biConsumer.accept(15, "in28minutes"); // Prints 15 and in28minutes
    }
}
```

---

### Step 07: Playing Puzzles with Functional Interfaces and Lambdas

### Key Objectives:

- Understand the syntax and compilation rules for functional interfaces in Java.

- Learn how to work with lambda expressions, including type inference and multi-statement expressions.

- Explore practical examples to clarify common misconceptions related to functional interfaces.

### Introduction to Functional Interfaces

**Objective**: Review the concepts of functional interfaces and introduce puzzles for exploration.

- In this session, we will engage with functional interfaces and lambda expressions through a series of coding puzzles. We'll focus on how these concepts behave during compilation and execution.

- This hands-on approach will help solidify our understanding of these fundamental aspects of functional programming in Java.

### Exploring Consumer Functional Interface

**Objective**: Analyze the Consumer interface and its syntax.

Begin with the **Consumer** interface, which represents an operation that takes a single input and returns no result. For instance, let's define a Consumer for a string:

```java
Consumer<String> consumer = str -> {};
```

- **Empty Parameters**: If you try to define a Consumer without parameters, it will not compile because the Consumer requires one input.

- **Lambda Expression**: You can omit parentheses for a single parameter. However, if there are no statements in the body, it will compile successfully even if the body is empty.

Now, if we replace the empty body with a print statement:

```java
Consumer<String> consumer = str -> System.out.println(str);
```

- This compiles correctly and will print the string passed to it.

### Working with BiConsumer

- Next, we will examine the BiConsumer interface, which accepts two inputs. Here’s how we define it:

```java
BiConsumer<String, String> biConsumer = (s1, s2) -> {
    System.out.println(s1);
    System.out.println(s2);
};
```

- You must specify both parameters. If you only define one, it will not compile.

- BiConsumer allows us to ignore one of the parameters while still meeting the method signature requirements.

#### Testing the BiConsumer:

```java
biConsumer.accept("Hello", "World"); // Prints "Hello" and "World"
```

- This demonstrates how BiConsumer can process two inputs, similar to Consumer but with added flexibility.

### Exploring Supplier Interface

The Supplier interface is defined as:

```java
Supplier<String> supplier = () -> "Ranga"; // Returns the string "Ranga"
```

If you add braces to create a block:

```java
Supplier<String> supplier = () -> {
    return "Ranga"; // Explicit return needed in a block
};
```

- When using braces, an explicit return statement is required.

- If you attempt to define a Supplier without parameters, it should compile as long as you adhere to its method signature (i.e., no input parameters).

### Understanding Multi-Statement Lambda Expressions

If you want to execute multiple statements within a lambda expression, you must encapsulate them in braces:

```java
Consumer<String> consumer = str -> {
    System.out.println(str);
    System.out.println("Another line");
};
```

- Multi-statement lambdas require braces and a return statement if there’s a return type involved. This makes it essential to understand the structure of lambda expressions when creating more complex operations.

### Type Inference in Lambda Expressions

In Java, type inference automatically determines the types of parameters based on the context:

```java
BinaryOperator<Integer> sum = (x, y) -> x + y; // Type is inferred from the context
```

You can also specify types explicitly:

```java
BinaryOperator<Integer> sum = (Integer x, Integer y) -> x + y; // Explicit types
```

- If you specify the type for one parameter, you must do so for all parameters. If you provide an incorrect type, the compiler will throw an error.

#### For instance:

```java
// This will cause a compilation error
BinaryOperator<Integer> incorrectSum = (String x, Integer y) -> x + y;
```

- This highlights the importance of matching types correctly when using lambda expressions.

#### Full Code:

```java
import java.util.function.Consumer;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.function.BinaryOperator;

public class FunctionalInterfacesPuzzles {
    public static void main(String[] args) {
        // Consumer example
        Consumer<String> consumer = str -> System.out.println(str);
        consumer.accept("Hello, Consumer!");

        // BiConsumer example
        BiConsumer<String, String> biConsumer = (s1, s2) -> {
            System.out.println(s1);
            System.out.println(s2);
        };
        biConsumer.accept("Hello", "World");

        // Supplier example
        Supplier<String> supplier = () -> "Ranga";
        System.out.println(supplier.get());

        // BinaryOperator example
        BinaryOperator<Integer> sum = (x, y) -> x + y;
        System.out.println("Sum: " + sum.apply(10, 20)); // Outputs "Sum: 30"
    }
}
```

---

### Step 08: Exploring Method References with Java

### Key Objectives:

- Understand the concept of method references in Java.

- Learn how to use method references for static methods, instance methods, and constructors.

- Explore practical examples to solidify knowledge of method references.

### Introduction to Method References


- In this session, we will explore method references, a powerful feature in Java that allows us to refer to methods without executing them.

- This provides a more concise and readable way to write code, especially when working with functional interfaces.

### Using Method References with Streams

- Let’s start by examining a basic example using a list of courses. We will create a stream and apply transformations using method references. 

#### Here’s how it looks:

```java
courses.stream()
       .map(str -> str.toUpperCase()) // Using a lambda expression
       .forEach(System.out::println);  // Printing each course name
```

#### In this code:

- `map` transforms each course name to uppercase.

- `forEach` prints the uppercase course names.

- Replacing Lambda with Method Reference

We can simplify the map operation using a method reference:

```java
map(String::toUpperCase);
```

This change makes our code cleaner. Method references point directly to existing methods without needing a lambda expression for simple cases.

### Using Static Method References

Next, we can create a static method in our class for printing.

#### Here’s how to define and use it:

```java
private static void print(String str) {
    System.out.println(str);
}
```

- `forEach(FP03MethodReferences::print);` // Method reference to static print method

- This code showcases how we can use method references for static methods. 

This method will be called for each element in the stream, similar to how we used a lambda expression earlier.

### Using Instance Method References

We can also call instance methods using method references. For example:

```java
map(str -> str.toUpperCase());
```

can be replaced with:

```java
map(String::toUpperCase);
```

Here, we refer directly to the instance method `toUpperCase()` of the String class.

This indicates that the method should be called on each string instance in the stream.

### Constructor References

Constructor references allow us to create new objects without the need for a lambda expression.

**For example**: If we want to create a Supplier for strings:

```java
Supplier<String> stringSupplier = () -> new String(); // Using a lambda
```

We can simplify this using a constructor reference:

```java
Supplier<String> stringSupplier = String::new; // Constructor reference
```

This creates a new instance of the String class whenever `get()` is called on the supplier.

Constructor references provide a clear and concise way to instantiate objects.

In this lecture, we covered the following types of method references:

- **Static Method References**: Referring to static methods of a class.

- **Instance Method References**: Referring to instance methods of an object.

- **Constructor References**: Referring to constructors for creating new objects.

These references enhance code readability and maintainability by reducing boilerplate code. 

They also integrate seamlessly with Java’s functional programming capabilities, allowing for cleaner functional style code.

#### Full Code:

```java
import java.util.List;
import java.util.function.Supplier;

public class FP03MethodReferences {
    public static void main(String[] args) {
        List<String> courses = List.of("Java", "Python", "JavaScript");

        // Using method references with streams
        courses.stream()
               .map(String::toUpperCase) // Method reference for instance method
               .forEach(System.out::println); // Method reference for static method

        // Using a Supplier with constructor reference
        Supplier<String> stringSupplier = String::new; // Constructor reference
        System.out.println(stringSupplier.get()); // Prints an empty string
    }

    private static void print(String str) {
        System.out.println(str); // Static method for printing
    }
}
```

---

## Java Functional Programming with Custom Classes

### Step 01: Creating Custom Class Course with some Test Data

### Key Objectives:

1. Understand the importance of creating custom classes in Java.

2. Learn how to define class attributes and methods.

3. Explore how to instantiate objects and manage them in a list.

4. Familiarize with using the `toString()` method for object representation.

5. Prepare for advanced operations using streams in future sessions.

### Introduction

Lets begins by transitioning from basic data structures to creating a custom class called `Course`. This class will help organize and manage course-related data effectively.

The focus will be on defining the class, its attributes, and how to create multiple objects from this class.

### Creating the Custom Class

- A new class named `Course` is created, which will encapsulate all relevant details about a specific course. This practice is fundamental in object-oriented programming, as it helps structure code and data into manageable entities.

### Defining Class Attributes

Inside the `Course` class, several attributes are defined:

- A `String` variable named `name` is added to hold the name of the course.

- A `String` variable for the course's `category` indicates the area it belongs to.

- An `int` variable called `reviewScore` is introduced to represent the course's review score, which can range from 0 to 100.

- An `int` variable for `numberOfStudents` is included to track how many students are enrolled in the course.

#### Code:

```java
private String name; // Course name
private String category; // Course category
private int reviewScore; // Review score (0 to 100)
private int numberOfStudents; // Number of students enrolled
```

### Generating Getters and Setters

- Next, getters and setters are generated for the attributes of the Course class.

- This allows easy access and modification of the class properties. Getters provide read access, while setters allow changes to the property values.

#### Code:

```java
public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

// Repeat for other attributes
```

### Adding a Constructor

- A constructor is added to the Course class, which initializes the attributes of the course when a new object is created. The constructor takes parameters for each attribute, ensuring that every Course object is properly initialized with relevant data.

#### Code:

```java
public Course(String name, String category, int reviewScore, int numberOfStudents) {
    this.name = name;
    this.category = category;
    this.reviewScore = reviewScore;
    this.numberOfStudents = numberOfStudents;
}
```

### Overriding the toString Method

- The `toString()` method is overridden to provide a meaningful string representation of the Course objects.

- This method is crucial for displaying information about a course in a human-readable format when an object is printed.

#### Code:

```java
@Override
public String toString() {
    return name + " - Students: " + numberOfStudents + ", Review Score: " + reviewScore;
}
```

### Instantiating Course Objects

- With the Course class defined, several instances of the Course class are created using the `List.of()` method. 

- This allows for the management of multiple course objects in a list format, making it easier to manipulate and access course data.

#### Code:

```java
List<Course> courses = List.of(
    new Course("Spring", "Framework", 98, 20000),
    new Course("Spring Boot", "Framework", 95, 18000),
    new Course("Microservices", "Microservices", 97, 22000),
    new Course("FullStack", "FullStack", 96, 25000),
    new Course("AWS", "Cloud", 92, 21000),
    new Course("Azure", "Cloud", 91, 14000),
    new Course("Docker", "Cloud", 90, 20000),
    new Course("Kubernetes", "Cloud", 89, 20000)
);
```

- After creating the list of course objects, the details of each course can be accessed and manipulated easily.

---

### Step 02: Playing with allMatch, noneMatch and anyMatch

### Key Objectives:

1. Understand the functionality of `allMatch()`, `noneMatch()`, and `anyMatch()` in Java Streams.

2. Learn how to create predicates to check specific conditions on course data.

3. Explore practical examples to illustrate the use of these stream methods.

### Introduction

In this lecture, the focus is on using Java Stream methods: `allMatch()`, `noneMatch()`, and `anyMatch()`.

These methods allow for checking conditions across a collection of objects, specifically, the list of courses created in the previous lecture.

### Understanding `allMatch()`

- The first method explored is `allMatch()`. This method checks whether all elements in a stream match a given predicate.

- The goal is to find out if all courses have a review score greater than 90. 

#### To implement this:

- The stream of courses is initiated using `courses.stream()`.

- A predicate is defined to check if the review score of each course is greater than 90 using `course.getReviewScore() > 90`.

- The result is printed to the console.

#### Code:

```java
boolean allGreaterThan90 = courses.stream().allMatch(course -> course.getReviewScore() > 90);
System.out.println(allGreaterThan90); // Expected output: true
```

- When executed, the output confirms that all courses meet this criterion. 

- Next, the check is modified to see if all courses have a review score greater than 95.

#### Code:

```java
boolean allGreaterThan95 = courses.stream().allMatch(course -> course.getReviewScore() > 95);
System.out.println(allGreaterThan95); // Expected output: false
```

The output is `false`, indicating that not all courses have a review score exceeding 95.

### Creating Predicates

To make the code cleaner and more maintainable, predicates for the review score conditions are created:

- `reviewScoreGreaterThan90Predicate`: Checks if the review score is greater than 90.

- `reviewScoreGreaterThan95Predicate`: Checks if the review score is greater than 95.

#### Code:

```java
Predicate<Course> reviewScoreGreaterThan90Predicate = course -> course.getReviewScore() > 90;
Predicate<Course> reviewScoreGreaterThan95Predicate = course -> course.getReviewScore() > 95;
```

These predicates can then be reused in the stream methods for better readability.

### Understanding `noneMatch()`

- The next method covered is `noneMatch()`, which checks if no elements in the stream match a given condition.

- The implementation tests whether none of the courses have a review score greater than 95.

#### Code:

```java
boolean noneGreaterThan95 = courses.stream().noneMatch(reviewScoreGreaterThan95Predicate);
System.out.println(noneGreaterThan95); // Expected output: false
```

The output is `false`, indicating that at least one course has a review score greater than 95.

- To demonstrate a case where `noneMatch()` returns true, a new predicate is created to check if the review score is less than 90.

#### Code:

```java
Predicate<Course> reviewScoreLessThan90Predicate = course -> course.getReviewScore() < 90;
boolean noneLessThan90 = courses.stream().noneMatch(reviewScoreLessThan90Predicate);
System.out.println(noneLessThan90); // Expected output: true
```

This output is `true`, confirming that no courses have a review score below 90.

### Understanding `anyMatch()`

Finally, the method `anyMatch()` is explored. This method checks if at least one element in the stream matches the specified predicate.

A test is performed to see if any courses have a review score greater than 90.

#### Code:

```java
boolean anyGreaterThan90 = courses.stream().anyMatch(reviewScoreGreaterThan90Predicate);
System.out.println(anyGreaterThan90); // Expected output: true
```

This returns true because all courses meet this criterion. Similarly, checking against the `reviewScoreGreaterThan95Predicate` also yields true since some courses meet the condition.

#### Code:

```java
boolean anyGreaterThan95 = courses.stream().anyMatch(reviewScoreGreaterThan95Predicate);
System.out.println(anyGreaterThan95); // Expected output: true
```

- `allMatch()` returns true if every element in the stream matches the condition.

- `noneMatch()` returns true if no elements match the specified condition.

- `anyMatch()` returns true if at least one element matches the condition.

An exercise is suggested for learners to create additional predicates based on the number of students and practice using `allMatch()`, `noneMatch()`, and `anyMatch()` with these new conditions.

---

### Step 03: Sorting courses with sorted and creating Comparators

### Key Objectives:

1. Understand how to sort a list of objects using Java Streams.

2. Learn to create custom comparators to define sorting criteria.

3. Explore sorting with multiple criteria, including handling primitive data types efficiently.

### Introduction

In this lecture, the focus is on sorting a list of courses using predefined criteria.

The primary method utilized for sorting is the `sorted()` method from Java Streams, which requires a comparator to define how the sorting should be done.

### Sorting Courses

- To start sorting the courses, the `courses.stream().sorted()` method is called. This method will sort the list based on a provided comparator, which needs to be defined.

#### Code:

```java
courses.stream().sorted(/* comparator here */);
```

### Creating a Comparator by Number of Students

- The next step involves defining a comparator that sorts the courses based on the number of students enrolled. The Comparator interface from `java.util` is used to facilitate this.

- A new comparator is created and named comparingByNumberOfStudents.

- The comparator is set up to compare courses by their number of students using the `Comparator.comparing()` method.

#### Code:

```java
Comparator<Course> comparingByNumberOfStudents = Comparator.comparing(Course::getNumberOfStudents);
```

- Once defined, this comparator is passed to the `sorted()` method to sort the courses.

#### Code:

```java
List<Course> sortedCourses = courses.stream()
                                    .sorted(comparingByNumberOfStudents)
                                    .collect(Collectors.toList());
```

- After running the code, the courses are displayed in increasing order based on the number of students enrolled, providing a clear output for verification.

### Sorting in Decreasing Order

- To sort the courses in decreasing order, the previous comparator is modified by using the `reversed()` method.

- A new comparator named `comparingByNumberOfStudentsDecreasing` is created for this purpose.

#### Code:

```java
Comparator<Course> comparingByNumberOfStudentsDecreasing = comparingByNumberOfStudents.reversed();
```

- The same sorting logic is applied, and running the code now displays the courses in decreasing order of the number of students.

### Sorting with Multiple Criteria

- When courses have the same number of students, a secondary sorting criterion is introduced: the review score.

- A new comparator is created that first compares by the number of students and then by the review score.

#### Code:

```java
Comparator<Course> comparingByNumberOfStudentsAndReviews = 
    Comparator.comparing(Course::getNumberOfStudents)
              .thenComparing(Course::getReviewScore);
```

- By using `thenComparing()`, the courses are now sorted by the number of students, and in cases where there are ties, they are further sorted by the review score in ascending order.

- After running this code, courses with the same number of students are displayed with the one having the higher review score appearing first.

### Efficiently Handling Primitive Types

While sorting, it’s noted that when dealing with primitive types (like int), it’s more efficient to use specialized comparator methods such as `comparingInt()`. 

This avoids the overhead of boxing and unboxing.

#### Code:

```java
Comparator<Course> comparingByNumberOfStudentsInt = Comparator.comparingInt(Course::getNumberOfStudents);
```

- The same efficiency can be applied to `thenComparing()` for secondary criteria as well.

---

### Step 04: Playing with skip, limit, takeWhile and dropWhile

### Key Objectives:
1. Understand the utility methods `skip()`, `limit()`, `takeWhile()`, and `dropWhile()` in Java Streams.

2. Learn how to filter and manipulate streams based on specific criteria.

3. Explore practical examples of using these methods to manage lists of data.

### Introduction

In this lecture, we will explore additional utility methods available in Java Streams: `skip`, `limit`, `takeWhile`, and `dropWhile`.

These methods allow us to control which elements we process from a stream based on defined criteria, making it easier to handle large datasets efficiently.

### Using the limit() Method

- Lets begins by introducing the `limit()` method. This method restricts the number of elements returned from a stream. For example, if we only want to focus on the top five courses after sorting them, we can utilize `limit()` to narrow down our results.

- By applying `limit(5)`, we can effectively filter out any unnecessary data and concentrate on the most relevant entries.

- This is particularly useful in scenarios where we want to display only a subset of results, such as in a user interface where displaying all courses might overwhelm the user.

### Code:

```java
List<Course> topFiveCourses = courses.stream()
                                      .sorted(comparingByNumberOfStudentsAndReviews)
                                      .limit(5)
                                      .collect(Collectors.toList());
System.out.println(topFiveCourses);
```

When executed, this will output the top five courses based on the sorting criteria. For instance:

#### Output:

```java
[Microservices:25000:96, API:22000:97, Azure:21000:92, AWS:21000:92, Spring:20000:98]
```

### Using the `skip()` Method

- Next, we explore the `skip()` method. This method allows us to skip a specified number of elements from the beginning of the stream.

- For instance, if we want to ignore the top three results, we can easily achieve this with `skip(3)`.

- This is useful in cases where we might want to bypass certain entries, such as when displaying results that follow a pagination structure, where the first few items have already been viewed.

#### Code:

```java
List<Course> skippedCourses = courses.stream()
                                      .skip(3)
                                      .collect(Collectors.toList());
System.out.println(skippedCourses);
```

When this is run, the output will show that the first three courses are skipped:

#### Output:

```java
[AWS:21000:92, Spring:20000:98, Docker:20000:92, Kubernetes:20000:91, Spring boot:18000:95, FullStack:14000:91]
```

### Combining `skip()` and `limit()`

- It is also possible to combine `skip()` and `limit()` to create more complex queries.

- For instance, if you want to skip the first three courses and then limit the results to the next five, you can chain these methods together seamlessly.

- This combination provides a powerful way to control exactly which elements are included in your final output, giving you greater flexibility in how you present data.

#### Code:

```java
List<Course> nextFiveAfterSkipping = courses.stream()
                                            .skip(3)
                                            .limit(5)
                                            .collect(Collectors.toList());
System.out.println(nextFiveAfterSkipping);
```

The output shows the next five courses starting from the fourth course:

#### Output:

```java
[AWS:21000:92, Spring:20000:98, Docker:20000:92, Kubernetes:20000:91, Spring boot:18000:95]
```

### Using `takeWhile()` Method

- Moving on, the `takeWhile()` method is introduced. This method allows you to take elements from the stream as long as a specified condition is true.

- **For example**: We might want to take courses until we find one with a review score less than 95.

- The utility of `takeWhile()` lies in its ability to stop processing as soon as a condition is no longer met.

- This can significantly improve performance by avoiding unnecessary checks after the first non-matching element is found.

#### Code:

```java
List<Course> coursesWithHighReviews = courses.stream()
                                            .takeWhile(course -> course.getReviewScore() >= 95)
                                            .collect(Collectors.toList());
System.out.println(coursesWithHighReviews);
```

When executed, this outputs the courses with review scores above 95, stopping at the first course that does not meet this condition:

#### output:

```java
[Spring:20000:98, Spring boot:18000:95, API:22000:97, Microservices:25000:96]
```

### Using dropWhile() Method

- The lecture then covers the `dropWhile()` method, which is the opposite of takeWhile(). It skips elements as long as the specified condition is true and takes all subsequent elements.

- This method is particularly useful when you want to ignore initial entries that do not meet certain criteria.

- **For example**: If you want to ignore all courses with a review score above 95 and start processing from the first course that meets this criterion, `dropWhile()` will help you achieve that.

#### Code:

```java
List<Course> droppedCourses = courses.stream()
                                      .dropWhile(course -> course.getReviewScore() >= 95)
                                      .collect(Collectors.toList());
System.out.println(droppedCourses);
```

When this is run, it will skip courses until it finds one that does not meet the condition and then return all following courses:

#### Output:
```java
[FullStack:14000:91, AWS:21000:92, Azure:21000:99, Docker:20000:92, Kubernetes:20000:91]
```

- `limit(n)`: Restricts the stream to the first n elements, allowing for a focused subset of data.

- `skip(n)`: Skips the first n elements of the stream, useful for pagination or excluding certain entries.

- `takeWhile(predicate)`: Takes elements as long as the predicate is true, stopping as soon as a condition is not met.

- `dropWhile(predicate)`: Drops elements as long as the predicate is true, returning all subsequent elements thereafter.

These methods can be very useful for managing collections of data effectively, especially when working with large datasets or when performance is a concern.

---

### Step 05: Finding top, max and min courses with max, min, findFirst and findAny

### Key Objectives:

1. Understand how to use `max()`, `min()`, `findFirst()`, and `findAny()` methods in Java Streams.

2. Learn about the significance of the `Optional` type and how to handle the absence of values.

3. Explore practical examples of finding specific courses based on defined criteria.

### Introduction

In this lecture, the focus shifts to retrieving individual elements from a list of courses. We will explore methods such as `max()`, `min()`, `findFirst()`, and `findAny()` to identify top courses based on specific criteria, such as the number of students or review scores.

Understanding how to leverage these methods can greatly enhance data retrieval and analysis in Java applications.

### Finding the Maximum Course

- Lets begins by discussing how to find the course with the maximum value based on defined criteria. The approach starts with invoking the `stream()` method on the list of courses. 

- To find the maximum course, the `max()` method is utilized, which requires a comparator that defines how to evaluate the courses.

- The comparator will compare courses based on both the number of students and review scores.

#### Code:

```java
Optional<Course> maxCourse = courses.stream()
    .max(comparingByNumberOfStudentsAndReviews);
System.out.println(maxCourse);
```

When executed, this code identifies the course with the maximum values according to the defined criteria.

#### Output:

```
Optional[FullStack:14000:91]
```

This indicates that FullStack is the course with the highest values according to the comparator used.

- It's important to note that the result of the `max()` operation is wrapped in an Optional.

- This is a container object which may or may not contain a value, providing a way to avoid NullPointerExceptions.

- If no course meets the criteria, `Optional.empty` is returned.

### Finding the Minimum Course

Next, lets explore how to find the course with the minimum value using the `min()` method. Similar to `max()`, the `min()` method also requires a comparator.

#### Code:

```java
Optional<Course> minCourse = courses.stream()
    .min(comparingByNumberOfStudentsAndReviews);
System.out.println(minCourse);
```

When executed, this will return the course with the lowest values:

```java
Optional[Microservices:25000:96]
```

In this case, Microservices is the course with the minimum value based on the defined criteria.

### Handling Empty Results with Optional

To demonstrate the handling of an empty result, a predicate that filters out courses with review scores less than 90 is applied.

If no courses meet this condition, the `min()` operation returns Optional.empty.

#### Code:

```java
Optional<Course> noMinCourse = courses.stream()
    .filter(course -> course.getReviewScore() < 90)
    .min(comparingByNumberOfStudentsAndReviews);
System.out.println(noMinCourse); // Output: Optional.empty
```

In this case, the output confirms that there are no courses with a review score below 90:

#### Output:

```
Optional.empty
```

### Providing Default Values

- To address cases where a value may not be present, you can specify a default value using the `orElse()` method.

- This allows you to define what should be returned if no valid result is found.

#### Code:

```java
Course defaultCourse = new Course("Default Course", "N/A", 0, 0);
Course resultCourse = noMinCourse.orElse(defaultCourse);
System.out.println(resultCourse); // Output: Default Course
```

If no minimum course is found, the default course is returned instead.

### Finding the First Element

The `findFirst()` method is introduced as a way to retrieve the first element from a stream that matches a specific criterion.

For instance, if you want to find the first course with a review score below 90, you would use this method.

#### Code:

```java
Optional<Course> firstLowScoreCourse = courses.stream()
    .filter(course -> course.getReviewScore() < 90)
    .findFirst();
System.out.println(firstLowScoreCourse); // Output: Optional.empty
```

This operation returns an Optional containing the first course that meets the criterion or `Optional.empty` if none exists.

### Using `findAny()`

Finally, the `findAny()` method is discussed. This method returns any element from the stream that matches a specified condition.

Unlike `findFirst()`, which always returns the first match, `findAny()` may return any qualifying element in a non-deterministic manner, especially when working with parallel streams.

#### Code:

```java
Optional<Course> anyHighScoreCourse = courses.stream()
    .filter(course -> course.getReviewScore() > 95)
    .findAny();
System.out.println(anyHighScoreCourse); // Output: Optional[Spring:21000:96]
```

This demonstrates that `findAny()` can return any course that matches the criteria, providing flexibility in how you retrieve data.

- `max()`: Finds the maximum element according to a comparator.

- `min()`: Finds the minimum element according to a comparator.

- `findFirst()`: Retrieves the first element that matches a given predicate.

- `findAny()`: Returns any element that matches the criteria in a potentially non-deterministic manner.

Understanding the use of Optional is crucial for robust programming, helping to avoid null-related errors.

---

### Step 06: Playing with sum, average and count

### Key Objectives:

1. Learn how to use `sum()`, `average()`, and `count()` methods in Java Streams.

2. Understand how to aggregate data from a collection of objects.

3. Explore the use of primitive mapping methods (`mapToInt`) for efficient performance.

4. Learn how to handle optional results when calculating averages.

### Introduction

In this lecture, we explore methods that return single aggregate results from a stream of data.

Specifically, we will look at how to calculate the sum, average, and count of students in courses that meet a specific condition—courses with a review score greater than 95.

### Calculating the Total Number of Students with `sum()`

- The first operation demonstrated is how to calculate the total number of students in courses that have a review score greater than 95.

- To achieve this, the process begins by filtering the courses using a predicate, and then mapping the filtered courses to the number of students using the `mapToInt()` method.

- This method is chosen because it efficiently handles primitive data types without boxing or unboxing.

Once the courses are mapped to the number of students, the `sum()` method is applied to get the total number of students.

#### Code:

```java
int totalStudents = courses.stream()
    .filter(course -> course.getReviewScore() > 95)
    .mapToInt(Course::getNumberOfStudents)
    .sum();
System.out.println(totalStudents);
```

This code returns the total number of students in the courses that meet the condition:

#### Output:

```java
88000
```

### Finding the Average Number of Students with `average()`

- Next, the `average()` method is used to find the average number of students in courses with a review score greater than 95.

- Since `average()` might not always return a result (e.g., if there are no courses that meet the condition), it returns an `OptionalDouble`

- This helps avoid `NullPointerException` and provides a way to handle missing values.

#### Code:

```java
OptionalDouble averageStudents = courses.stream()
    .filter(course -> course.getReviewScore() > 95)
    .mapToInt(Course::getNumberOfStudents)
    .average();
System.out.println(averageStudents);
```

The output shows the average number of students per course:

#### Output:

```java
OptionalDouble[22000.0]
```

### Handling Optional Results

If there are no matching courses, `average()` would return an `Optional.empty`.

This can be handled using methods like `orElse()` to provide a default value in such cases:

```java
double avgStudents = averageStudents.orElse(0.0);
System.out.println(avgStudents);
```

### Counting the Number of Courses with `count()`

- To find out how many courses meet the condition of having a review score greater than 95, the `count()` method is used.

- This method is straightforward and returns the total number of elements that match the criteria.

#### Code:

```java
long count = courses.stream()
    .filter(course -> course.getReviewScore() > 95)
    .count();
System.out.println(count);
```

The output shows the number of courses that meet the condition:

#### Output:

```java
4
```

### Finding Maximum and Minimum Number of Students

- The lecture continues by showing how to find the course with the maximum and minimum number of students using `max()` and `min()`.

- These methods return the maximum and minimum values as `OptionalInt`.

To find the course with the highest number of students in courses with a review score greater than 95, the `max()` method is used:

```java
OptionalInt maxStudents = courses.stream()
    .filter(course -> course.getReviewScore() > 95)
    .mapToInt(Course::getNumberOfStudents)
    .max();
System.out.println(maxStudents);
```

The output will show the maximum number of students in such courses:

#### Output:

```java
OptionalInt[25000]
```

Similarly, the `min()` method can be used to find the course with the minimum number of students:

```java
OptionalInt minStudents = courses.stream()
    .filter(course -> course.getReviewScore() > 95)
    .mapToInt(Course::getNumberOfStudents)
    .min();
System.out.println(minStudents);
```

### Flexibility with Stream Methods

- With Java Streams, it's possible to apply various filters, map data to any attribute (such as category or review score), and retrieve aggregate results like sum, average, and count.

- For example, instead of mapping to the number of students, we could map the stream to review scores and calculate their sum, average, or count. The possibilities are endless when working with streams and custom filters.

- `sum()`: Calculates the total of a mapped stream of numbers.

- `average()`: Returns the average of the numbers in the stream as an OptionalDouble.

- `count()`: Returns the number of elements in the stream that meet a certain condition.

- `max()` and `min()`: Return the maximum and minimum values in the stream as `OptionalInt`.

Understanding and applying these methods allows for powerful and flexible data analysis in Java.

---

### Step 07: Grouping courses into Map using groupingBy

### Key Objectives:

1. Learn how to group a list of objects into a `Map` using the `Collectors.groupingBy()` method in Java Streams.

2. Understand how to perform advanced grouping operations such as counting and finding the maximum value within each group.

3. Explore how to map specific properties (like course names) rather than entire objects to the grouped results.

### Introduction

In this lecture, we explore how to group a list of courses into a `Map` based on specific criteria using the `Collectors.groupingBy()` method. 

Grouping allows us to organize data into categories and perform various aggregate operations on each group, such as counting the number of items or finding the maximum value.

### Grouping Courses by Category

- The first task is to group courses by their category.

- For example, we want to group all courses related to "Framework," "Microservices," "Cloud," etc., and store them in a `HashMap` where the category is the key and the list of courses under that category is the value.

To do this, we use the `groupingBy()` method in the `Collectors` utility class.

#### Code:

```java
Map<String, List<Course>> coursesByCategory = courses.stream()
    .collect(Collectors.groupingBy(Course::getCategory));
System.out.println(coursesByCategory);
```

This code groups courses by category, and when executed, the output will show something like:

#### Output:

```java
{
    Cloud=[AWS:21000:92, Azure:21000:99, Docker:20000:92, Kubernetes:20000:91], 
    FullStack=[FullStack:14000:91], 
    Microservices=[API:22000:97, Microservices:25000:96], 
    Framework=[Spring:20000:98, Spring boot:18000:95]
}
```

### Counting Courses in Each Category

- Next, instead of listing all the courses under each category, we want to count how many courses belong to each category.

- The `Collectors.counting()` method can be used to count the number of courses for each key (category) in the map.

#### Code:

```java
Map<String, Long> courseCountByCategory = courses.stream()
    .collect(Collectors.groupingBy(Course::getCategory, Collectors.counting()));
System.out.println(courseCountByCategory);
```

The output will show the number of courses in each category:

```java
{
    Cloud=4, 
    FullStack=1, 
    Microservices=2, 
    Framework=2
}
```

### Finding the Course with the Highest Review Score in Each Category

- The next step is to find the course with the highest review score within each category. Instead of counting, we use `Collectors.maxBy() to identify the course with the maximum review score in each group.

- We need to specify a comparator that compares courses based on their review scores.

#### Code:

```java
Map<String, Optional<Course>> highestRatedCourseByCategory = courses.stream()
    .collect(Collectors.groupingBy(
        Course::getCategory, 
        Collectors.maxBy(Comparator.comparing(Course::getReviewScore))
    ));
System.out.println(highestRatedCourseByCategory);
```

When executed, the output will display the course with the highest review score for each category:

```java
{
    Cloud=Optional[Azure:99], 
    FullStack=Optional[FullStack:91], 
    Microservices=Optional[API:97], 
    Framework=Optional[Spring:98]
}
```

### Extracting Only the Course Names

- Rather than returning the entire Course object, we might only want the name of the highest-rated course for each category.

- This can be achieved using `Collectors.mapping()`, which allows us to transform the grouped elements before collecting them. Here, we map the courses to their names.

#### Code:

```java
Map<String, List<String>> courseNamesByCategory = courses.stream()
    .collect(Collectors.groupingBy(
        Course::getCategory,
        Collectors.mapping(Course::getName, Collectors.toList())
    ));
System.out.println(courseNamesByCategory);
```

The output will show the course names grouped by category:

```java
{
    Cloud=[AWS, Azure, Docker, Kubernetes], 
    FullStack=[FullStack], 
    Microservices=[API, Microservices], 
    Framework=[Spring, Spring Boot]
}
```

### Mapping Highest Rated Course Name by Category

- To refine the previous example, we can combine `mapping()` and `maxBy()` to return only the names of the highest-rated courses in each category. 
- This example shows how to chain different collectors to get specific results.

#### Code:

```java
Map<String, Optional<String>> highestRatedCourseNameByCategory = courses.stream()
    .collect(Collectors.groupingBy(
        Course::getCategory, 
        Collectors.mapping(Course::getName, 
            Collectors.maxBy(Comparator.comparing(Course::getReviewScore))
        )
    ));
System.out.println(highestRatedCourseNameByCategory);
```

The output will show only the names of the highest-rated courses by category:

```java
{
    Cloud=Optional[Azure], 
    FullStack=Optional[FullStack], 
    Microservices=Optional[API], 
    Framework=Optional[Spring]
}
```

---

## Playing with Java Functional Programming

### Step 01: Creating Streams using Stream of method and for Arrays

### Key Objectives:

1. Learn how to create streams directly using `Stream.of()`.

2. Understand the difference between streams created from lists and those created from arrays.

3. Explore the benefits of using primitive streams for performance efficiency.

4. Practice common operations like sum, average, min, and max on both wrapper class and primitive streams.

### Introduction

In this lecture, we focus on how to create streams directly without needing to rely on pre-existing lists. There are multiple options in Java for creating streams, including `Stream.of()` and `Arrays.stream()`.

These options provide flexibility in how we create and manipulate streams, particularly when working with primitive data types, which can offer performance benefits.

### Creating Streams using `Stream.of()`

- To begin, we explore how to create a stream directly from a set of values using the `Stream.of()` method.

- This allows us to quickly initialize a stream with specific elements without first needing to create a list.

#### Code:

```java
Stream<Integer> numberStream = Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
System.out.println(numberStream.count());
```

This code snippet creates a stream from a series of integers and then counts the number of elements in the stream. The output will be:

```java
9
```

### Summing Elements with Reduce

- In addition to counting, we can perform operations on the stream.

- For example, using the `reduce()` method, we can calculate the sum of the stream’s elements. The `reduce()` method applies a binary operator to combine all elements into a single result.

#### Code:

```java
int sum = Stream.of(12, 9, 13, 4, 6, 2, 4, 12, 15)
    .reduce(0, Integer::sum);
System.out.println(sum);
```

This code sums all the elements in the stream, and the output will be:

```java
77
```

### Wrapper Classes in Streams

- One important thing to note is that streams created using `Stream.of()` store elements as instances of wrapper classes (e.g., Integer for int values).

- This can lead to boxing and unboxing during operations, which can be inefficient when dealing with large datasets.

- **Boxing**: Converting a primitive type (e.g., int) into a wrapper class object (e.g., Integer).

- **Unboxing**: Converting a wrapper class object back into a primitive type.

- While `Stream.of()` is simple to use, there are more efficient ways to create streams of primitive types that avoid boxing and unboxing overhead.

### Creating Streams from Arrays

- To avoid boxing and unboxing inefficiencies, Java provides an option to create streams of primitive values directly from arrays using `Arrays.stream()`.

- This creates streams that work with primitive types (e.g., int, double, long) and allows for more efficient operations.

Let’s look at how to create a stream from an array of primitive int values.

#### Code:

```java
int[] numberArray = {12, 9, 13, 4, 6, 2, 4, 12, 15};
IntStream intStream = Arrays.stream(numberArray);
System.out.println(intStream.sum());
```

This code creates a stream from an array of integers and calculates the sum of the elements.

The output will be:

```java
77
```

### Primitive vs. Wrapper Class Streams

A key distinction between streams created from arrays and those created from `Stream.of()` is the type of stream generated:

- Streams created from arrays (e.g., IntStream) are primitive streams that directly hold primitive values (int, long, etc.).

- Streams created from `Stream.of()` are streams of wrapper classes (e.g., `Stream<Integer>`).

- Primitive streams (like IntStream) are more efficient because they avoid the overhead of boxing and unboxing.

### Performing Operations on Primitive Streams

- Primitive streams, such as IntStream, provide several useful operations like `sum()`, `average()`, `min()`, and `max()` directly, without needing extra conversions.

- These operations return results wrapped in optional types to handle cases where there might not be any values in the stream.

#### Code:

```java
int[] numberArray = {12, 9, 13, 4, 6, 2, 4, 12, 15};
IntStream intStream = Arrays.stream(numberArray);

// Perform common operations
int sum = intStream.sum();
OptionalDouble average = Arrays.stream(numberArray).average();
OptionalInt min = Arrays.stream(numberArray).min();
OptionalInt max = Arrays.stream(numberArray).max();

System.out.println("Sum: " + sum);            // Sum: 77
System.out.println("Average: " + average);    // Average: OptionalDouble[8.555555555555555]
System.out.println("Min: " + min);            // Min: OptionalInt[2]
System.out.println("Max: " + max);            // Max: OptionalInt[15]
```

The output will show the sum, average, minimum, and maximum values:

```java
Sum: 77
Average: OptionalDouble[8.555555555555555]
Min: OptionalInt[2]
Max: OptionalInt[15]
```

---

### Step 02: Creating Streams for First 100 Numbers, Squares of Numbers and More

### Key Objectives:

1. Learn how to create streams of primitive values dynamically using `IntStream`.

2. Understand the difference between `range()`, `rangeClosed()`, and `iterate()` methods for generating sequences.

3. Explore the use of `peek()` for inspecting stream elements.

4. Perform advanced exercises, such as generating even numbers and powers of two.

5. Learn how to convert primitive streams to collections using the `boxed()` method.

### Introduction

In this lecture, we explore how to create dynamic streams of primitive values using `IntStream`. We will cover techniques for generating streams of numbers, performing operations on those streams, and converting primitive streams to more general collections like lists.

This approach is useful for generating sequences like the first 100 numbers, even numbers, odd numbers, and powers of two.

### Creating Streams with `IntStream.range()`

- To generate a sequence of numbers, we can use the `IntStream.range()` method, which allows us to create a stream of numbers within a specified range.

- This method is useful when you want to generate a range of sequential integers.

```java
int sum = IntStream.range(1, 10).sum();
System.out.println(sum);
```

- `IntStream.range(1, 10)` generates a stream of integers from 1 to 9 (excluding 10).

- The `sum()` method adds all the elements in the stream.

#### Output:

```java
45
```

### Using `rangeClosed()` to Include the Last Element

- If you want to include the last element in the range, you can use `IntStream.rangeClosed()`. 

- This method is similar to `range()` but includes the last number in the sequence.

```java
int sum = IntStream.rangeClosed(1, 10).sum();
System.out.println(sum);
```

- `IntStream.rangeClosed(1, 10)` generates a stream of integers from 1 to 10.

#### Output:

```java
55
```

### Creating Dynamic Streams with `IntStream.iterate()`

- Sometimes, we need to generate numbers based on a specific algorithm rather than a sequential range.

- The `IntStream.iterate()` method allows you to specify a starting value and a function to generate subsequent values.

- This is particularly useful for generating even numbers, odd numbers, or any other pattern.

**Example**: Generating an Infinite Stream of Odd Numbers

```java
IntStream.iterate(1, n -> n + 2)
    .limit(10)
    .forEach(System.out::println);
```

- `IntStream.iterate(1, n -> n + 2)` starts with 1 and increments by 2, generating odd numbers.

- The `limit(10)` method limits the stream to the first 10 odd numbers.

#### Output:

```java
1
3
5
7
9
11
13
15
17
19
```

### Using `peek()` to Inspect Stream Elements

- The `peek()` method allows you to inspect the elements of a stream without modifying the stream itself.

- It’s useful for debugging or for understanding what values are being processed in the stream.

**Example**: Printing the Elements of a Stream Using peek()

```java
IntStream.iterate(1, n -> n + 2)
    .limit(10)
    .peek(System.out::println)
    .sum();
```

- `peek(System.out::println)` prints the elements in the stream before performing the sum operation.

- The sum is calculated, but it is secondary to the peek output, which is the same list of odd numbers as before:

```java
1
3
5
7
9
11
13
15
17
19
```

### **Exercise**: Printing the First 10 Even Numbers

- As an exercise, let’s generate the first 10 even numbers by modifying the `IntStream.iterate()` method.

**Solution**:

```java
IntStream.iterate(2, n -> n + 2)
    .limit(10)
    .peek(System.out::println)
    .sum();
```

- This stream starts at 2 and increments by 2, producing even numbers.

#### Output:

```java
2
4
6
8
10
12
14
16
18
20
```

### **Exercise**: Calculating the Powers of 2

- Another exercise involves generating the first 10 powers of 2 (2^1, 2^2, 2^3, etc.).

**Solution**:

```java
IntStream.iterate(2, n -> n * 2)
    .limit(10)
    .peek(System.out::println)
    .sum();
```

- The stream starts at 2 and multiplies each number by 2, producing powers of 2.

#### Output:

```java
2
4
8
16
32
64
128
256
512
1024
```

### Converting Primitive Streams to Lists Using `boxed()`

- While working with primitive streams (IntStream, DoubleStream, LongStream), it is important to note that you cannot directly collect primitive streams into a List.

- To do this, you need to convert the primitive stream into a stream of wrapper objects (e.g., Integer for IntStream). This can be done using the `boxed()` method.

**Example**: Collecting Powers of 2 into a List

```java
List<Integer> powersOfTwo = IntStream.iterate(2, n -> n * 2)
    .limit(10)
    .boxed()
    .collect(Collectors.toList());
System.out.println(powersOfTwo);
```

- The `boxed()` method converts the primitive IntStream into a `Stream<Integer>`, which can then be collected into a List.

#### Output:

```java
[2, 4, 8, 16, 32, 64, 128, 256, 512, 1024]
```

---

### Step 03: Doing Big Number calculations with BigInteger

### Key Objectives:

1. Understand the limitations of primitive numeric types like `int` and `long` in Java.

2. Learn how to perform calculations involving extremely large values using `BigInteger`.

3. Explore how to use `BigInteger` in conjunction with Java Streams to calculate large factorials and other big number operations.

### Introduction

In this lecture, we explore how to handle calculations involving very large numbers that exceed the limits of Java’s primitive numeric types such as `int` and `long`.

Java provides the `BigInteger` class for such cases, allowing us to perform arithmetic operations on arbitrarily large integers.

### Understanding the Limits of `int` and `long`

- Primitive types like `int` and `long` have predefined maximum values:

- **`Integer.MAX_VALUE`**: The largest value that an `int` can hold.

- **`Long.MAX_VALUE`**: The largest value that a `long` can hold.

### Example: Checking Integer and Long Limits

```java
System.out.println("Max value of Integer: " + Integer.MAX_VALUE);
System.out.println("Max value of Long: " + Long.MAX_VALUE);
```

#### Output:

```java
Max value of Integer: 2147483647
Max value of Long: 9223372036854775807
```

- These limits restrict the range of calculations that can be performed with int and long.

- If calculations exceed these limits, the results can wrap around and become incorrect, such as returning negative values for large numbers.

### Calculating Factorials and Exceeding Limits

- Factorials grow very large quickly.

- **For example**, calculating 50! (50 factorial) involves multiplying numbers from 1 to 50.

- When using int or long, the result will overflow the maximum value and produce incorrect results.

### **Example**: Factorial Calculation Using intStream.rangeClosed

```java
int factorial = IntStream.rangeClosed(1, 50)
    .reduce(1, (x, y) -> x * y);
System.out.println(factorial);
```

#### Output:

```java
0
```

- In this case, the result is 0 because the product exceeds the int limit, resulting in an overflow. Similarly, using LongStream will also overflow at high values.

### Introducing `BigInteger` for Large Calculations

- To handle large number calculations like factorials, Java provides the `BigInteger` class.

- Unlike `int` and `long`, `BigInteger` can handle arbitrarily large values without overflow.

- It also provides methods for common arithmetic operations like addition, multiplication, etc.

### Calculating Large Factorials with `BigInteger`

- We can solve the factorial problem by converting the stream of numbers into `BigInteger` objects and using `BigInteger` for the multiplication.

- Step-by-Step: Using `BigInteger` to Calculate 50 Factorial

- Convert Each Number to `BigInteger`: Use `BigInteger``.valueOf()` to convert each int into a `BigInteger`.

- Perform Multiplication Using BigInteger: Use the `BigInteger.multiply()` method to multiply the numbers.

### **Example**: Calculating 50 Factorial with `BigInteger`

```java
BigInteger factorial50 = IntStream.rangeClosed(1, 50)
    .mapToObj(BigInteger::valueOf)
    .reduce(BigInteger.ONE, BigInteger::multiply);
System.out.println(factorial50);
```

- `IntStream.rangeClosed(1, 50)`: Generates a stream of integers from 1 to 50.

- `mapToObj(BigInteger::valueOf)`: Converts each integer into a BigInteger.

- `reduce(BigInteger.ONE, BigInteger::multiply)`: Multiplies all the BigInteger values, starting from BigInteger.ONE.

#### Output:

```java
30414093201713378043612608166064768844377641568960512000000000000
```

- This produces the correct value for 50! without any overflow issues.

---

## Playing further with Java Functional Programming

### Step 01: Joining Strings with joining and Playing with `flapMap`

### Key Objectives:

1. Learn how to join a list of strings into a single string using the `Collectors.joining()` method.

2. Understand the purpose and use of `flatMap()` to flatten streams of complex data structures.

3. Explore practical examples of using `flatMap()` for operations like splitting strings into characters and creating tuples from two lists.

### Introduction

In this lecture, we focus on two powerful stream operations in Java:

- **`Collectors.joining()`**: Used for joining multiple strings with a separator into a single string.

- **`flatMap()`**: A versatile method for flattening nested streams, useful when dealing with arrays or complex collections.


### Joining Strings Using `Collectors.joining()`

- To start, we explore how to combine a list of course names into a single string, where each course name is separated by a comma.

- This is easily achieved using the `Collectors.joining()` method.

### **Example**: Joining a List of Course Names

```java
List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF");
String joinedCourses = courses.stream()
    .collect(Collectors.joining(", "));
System.out.println(joinedCourses);
```

- `Collectors.joining(", ")`: Joins all elements in the stream, separated by a comma and space.

#### Output:

```java
Spring, Spring Boot, API, Microservices, AWS, PCF
```

- The `joining()` method allows you to specify any separator (e.g., commas, spaces) to combine the strings.

### Working with `flatMap()`

- Next, we introduce `flatMap()`, a method that is useful when dealing with nested structures such as arrays or lists of lists. `flatMap()` helps flatten these structures into a single stream.

- In the first example, we want to split each course name into its individual characters.

- A direct use of `map()` would return a stream of arrays, but `flatMap()` allows us to flatten the arrays into a stream of characters.

### **Example**: Flattening a List of Strings into Characters

```java
List<String> courses = List.of("Spring", "Spring Boot", "API");
List<String> characters = courses.stream()
    .map(course -> course.split(""))
    .flatMap(Arrays::stream)
    .collect(Collectors.toList());
System.out.println(characters);
```

- `map(course -> course.split(""))`: Splits each course name into an array of characters.

- `flatMap(Arrays::stream)`: Converts the array of characters into a flattened stream of individual characters.

#### Output:

```java
[S, p, r, i, n, g, S, p, r, i, n, g, B, o, o, t, A, P, I]
```

### Using `flatMap()` to Remove Duplicates

- We can further manipulate the stream by removing duplicate characters using the `distinct()` method.

### **Example**: Finding Distinct Characters

```java
List<String> distinctCharacters = courses.stream()
    .map(course -> course.split(""))
    .flatMap(Arrays::stream)
    .distinct()
    .collect(Collectors.toList());
System.out.println(distinctCharacters);
```

- `distinct()`: Removes duplicate characters from the stream.

#### Output:

```java
[S, p, r, i, n, g, B, o, t, A, P, I]
```

### Advanced Use of `flatMap()`: Generating Tuples

- In more advanced scenarios, `flatMap()` can be used to generate combinations of elements from two lists.

- **For example**, we can use `flatMap()` to create pairs (tuples) of course names that have the same number of characters.

### **Example**: Creating Tuples from Two Lists

```java
List<String> courses = List.of("Spring", "API", "AWS", "PCF", "Docker");
List<String> courses2 = List.of("Spring", "API", "AWS", "PCF", "Docker");

List<List<String>> coursePairs = courses.stream()
    .flatMap(course -> courses2.stream()
        .filter(course2 -> course.length() == course2.length() && !course.equals(course2))
        .map(course2 -> List.of(course, course2)))
    .collect(Collectors.toList());

System.out.println(coursePairs);
```

- `flatMap()`: For each course in the first list, flatMap() generates a stream of courses from the second list.

- `filter(course2 -> course.length() == course2.length())`: Filters the second list to match courses with the same length.

- `List.of(course, course2)`: Creates a pair (tuple) of matching courses.

#### Output:

```java
[[API, AWS], [API, PCF], [AWS, API], [AWS, PCF], [PCF, API], [PCF, AWS]]
```

### Explanation of `flatMap()` Use Cases

- The `flatMap()` method can be used in a variety of scenarios, especially when:

- You need to flatten nested collections (e.g., a stream of lists into a single stream of elements).

- You want to combine multiple sources of data into a single stream.

- In the examples above, we used `flatMap()` to flatten arrays of characters and to generate combinations (pairs) of matching courses.

---

### Step 02: Creating Higher Order Functions

### Key Objectives:

1. Understand the concept of Higher Order Functions (HOFs) in functional programming.

2. Learn how to create and use higher-order functions in Java by returning functions from methods.

3. Explore practical examples of using HOFs, including the use of predicates.

### Introduction

In this lecture, we explore the concept of **Higher Order Functions (HOFs)**, an important feature in functional programming.

A **Higher Order Function** is a function that either takes one or more functions as parameters or returns a function as its result.

In this case, we will focus on creating functions that return other functions, allowing us to generate reusable logic dynamically.

### What is a Higher Order Function?

A **Higher Order Function** in programming is a function that either:
- Takes a function as a parameter, or
- Returns a function as a result.

In this lecture, the focus is on functions that **return functions**. This is useful when you want to generate customized logic dynamically at runtime, such as creating predicates with varying conditions.

### Creating Predicates with Different Cutoff Values

Let's start by revisiting some predicates that filter courses based on their review scores. Initially, we define two separate predicates that check if a course has a review score greater than 90 or 95.

### **Example**: Predicates with Different Cutoff Values

```java
Predicate<Course> reviewScoreGreaterThan95 = course -> course.getReviewScore() > 95;
Predicate<Course> reviewScoreGreaterThan90 = course -> course.getReviewScore() > 90;
```

- These predicates work, but they are quite repetitive. The only difference between them is the cutoff value (90 or 95).

- Instead of hardcoding separate predicates, we can make this more flexible by creating a method that returns a predicate with any cutoff value.

### Refactoring to Use Higher Order Functions

- We will refactor the code to create a higher-order function that takes the cutoff value as a parameter and returns a predicate based on that value.

- This approach eliminates repetition and allows us to generate predicates dynamically.

### **Example**: Creating a Higher Order Function to Return a Predicate

```java
public static Predicate<Course> createPredicateWithCutoffReviewScore(int cutoffReviewScore) {
    return course -> course.getReviewScore() > cutoffReviewScore;
}
```

- `createPredicateWithCutoffReviewScore(int cutoffReviewScore)`: This method accepts a cutoff value and returns a predicate that checks if a course's review score is greater than the cutoff.

- The method returns a function (a `Predicate<Course>`) based on the cutoff value.

- Now, we can generate predicates for any cutoff dynamically:

```java
Predicate<Course> reviewScoreGreaterThan90 = createPredicateWithCutoffReviewScore(90);
Predicate<Course> reviewScoreGreaterThan95 = createPredicateWithCutoffReviewScore(95);
```

### Applying the Higher Order Function

- Once we have created our higher-order function, we can use it to generate predicates and apply them to our courses.

- For example, we can filter courses with a review score greater than 90 or 95 using the dynamically generated predicates.

### **Example**: Using the Generated Predicates

```java
List<Course> courses = // Assume this is a list of courses
List<Course> highRatedCourses = courses.stream()
    .filter(createPredicateWithCutoffReviewScore(95))
    .collect(Collectors.toList());

System.out.println(highRatedCourses);
```

- We generate the predicate using the `createPredicateWithCutoffReviewScore(95)` method.

- The `filter()` method applies the generated predicate to filter out courses with a review score greater than 95.

- This dynamic approach allows for flexibility, making it easier to reuse the logic for different cutoff values.

### Higher Order Functions in Functional Programming

- The use of higher-order functions like the one we created is a hallmark of functional programming.

- They allow functions to be treated like first-class citizens:

- **Functions as data**: We can pass functions around as arguments, return them from methods, or store them in variables just like any other data.

- **Dynamic logic generation**: Higher-order functions allow us to create custom logic on the fly, reducing code duplication and making the program more flexible.

In functional programming, you can store methods as local variables, pass methods as parameters, and return methods from other methods—allowing greater control over the behavior of your code.

---

### Step 03: FP and Performance - Intermediate Stream Operations are Lazy

### Key Objectives:

1. Understand the concept of laziness in intermediate stream operations.

2. Learn how Java Streams execute operations efficiently by delaying execution until a terminal operation is invoked.

3. Explore how functional programming in Java helps improve performance, particularly with operations like filtering and mapping.

### Introduction

In this lecture, we explore the performance advantages of functional programming in Java, particularly focusing on the **laziness** of intermediate stream operations.

Laziness means that intermediate operations like `filter()`, `map()`, and `peek()` are not executed until a terminal operation (such as `findFirst()` or `collect()`) is invoked.

This allows Java to execute operations more efficiently by only doing the minimum amount of work required to get the result.

### Functional Programming and Performance

- Functional programming has existed for over 50 years, but its performance benefits have gained more attention recently, especially in the context of multicore processors.

- Java Streams, introduced in Java 8, enable efficient parallelization of code, making it easier to write performant programs.

- One key aspect of this performance improvement is how intermediate operations in Java Streams are **lazy**.

- Instead of processing the entire stream eagerly, intermediate operations are only evaluated when a terminal operation is called.

### Example of Stream Operations

- Let's start with an example where we apply a series of operations on a list of course names.

- The goal is to filter out courses with names longer than 11 characters, convert them to uppercase, and return the first match.

### Example: Filter, Map, and Find First

```java
List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS");
String result = courses.stream()
    .filter(course -> course.length() > 11)
    .map(String::toUpperCase)
    .findFirst()
    .orElse("No match");
System.out.println(result);
```

- `filter()`: Filters the courses based on the length of their names.

- `map()`: Converts the course names to uppercase.

- `findFirst()`: Finds the first course that satisfies the conditions.

#### Output:

```java
MICROSERVICES
```

### Understanding Laziness in Intermediate Operations

- The key point about streams is that intermediate operations (like `filter()` and `map()`) are lazy.

- They are not executed immediately when encountered. Instead, Java "chains" these operations and waits for a terminal operation (like `findFirst()`) to trigger their execution.

### Demonstrating Lazy Execution with `peek()`

- To understand the lazy nature of intermediate operations, we can use the peek() method to see when each step of the stream is executed.

- The `peek()` method allows us to inspect the elements as they flow through the pipeline without modifying them.

### Example: Using `peek()` to Observe Stream Execution

```java
String result = courses.stream()
    .peek(System.out::println)  // Inspect the courses before filtering
    .filter(course -> course.length() > 11)
    .peek(System.out::println)  // Inspect the courses after filtering
    .map(String::toUpperCase)
    .peek(System.out::println)  // Inspect the courses after mapping to uppercase
    .findFirst()
    .orElse("No match");
System.out.println("Result: " + result);
```

- The first `peek()` will print all the course names before they are filtered.

- The second `peek()` will only print the course names that pass the filter.

- The third `peek()` will print the course names after they are converted to uppercase.

#### Output:

```java
Spring
Spring Boot
API
Microservices
Microservices
MICROSERVICES
Result: MICROSERVICES
```

- As soon as the `findFirst()` operation finds the first course that meets the conditions ("Microservices"), the stream processing stops.

- The remaining courses ("AWS") are not even evaluated, demonstrating how efficient functional programming can be.

### Laziness of Intermediate Operations

- The intermediate operations (`filter()`, `map()`, `peek()`) in the stream pipeline are lazy:

- They don’t execute immediately: Java doesn’t process these operations until a terminal operation (like `findFirst()` or `collect()`) is called.

- **Short-circuiting**: As shown in the example, once findFirst() finds a match, the rest of the stream is not processed, saving computational resources.

- This lazy evaluation ensures that Java only performs the minimum amount of work necessary to get the result, which leads to performance optimizations.

### Understanding Terminal Operations

- A terminal operation triggers the execution of the intermediate operations in the stream pipeline.

Examples of terminal operations include:

- `findFirst()`: Returns the first element that matches the conditions.

- `collect()`: Collects the results into a collection like a list or set.

- `forEach()`: Applies an action to each element in the stream.

Once a terminal operation is invoked, Java evaluates the stream pipeline just enough to fulfill the terminal operation.

### Example: Removing the Terminal Operation

- If we remove the terminal operation (`findFirst()`), the intermediate operations will not be executed.

```java
Stream<String> courseStream = courses.stream()
    .filter(course -> course.length() > 11)
    .map(String::toUpperCase);
```

- No terminal operation is called, so nothing is printed or processed. The stream operations are only defined, but not executed.

---

### Step 04: Improving Performance with Parallelization of Streams

### Key Objectives:

1. Understand how to leverage multicore processors to improve the performance of functional code.

2. Learn how to parallelize streams in Java with the `parallel()` method.

3. Explore the benefits and mechanisms of parallelizing stream operations and how Java efficiently handles them.

### Introduction

- Modern laptops and computers are equipped with multicore processors, allowing programs to execute tasks in parallel and improve performance.

- In functional programming, **parallelization** is a straightforward and effective way to take advantage of this.

- In this lecture, we explore how to parallelize streams in Java and measure the performance improvements.

### Setting Up a Sequential Stream Operation

- To begin, let’s create a basic example where we sum a large range of numbers using Java Streams.

- First, we perform this operation sequentially (without parallelization).

### Example: Summing a Range of Numbers

```java
LongStream.range(0, 1000000000L).sum();
```

- This creates a stream of long values from 0 to 999,999,999 and calculates the sum. While this works, it can take time to execute.

### Measuring the Performance of Sequential Streams

- To measure how long it takes to sum these numbers, we can use the `System.currentTimeMillis()` method to track the start and end times.

### Example: Measuring Execution Time

```java
long startTime = System.currentTimeMillis();
long result = LongStream.range(0, 1000000000L).sum();
long endTime = System.currentTimeMillis();

System.out.println("Sum: " + result);
System.out.println("Time taken: " + (endTime - startTime) + " ms");
```

- `System.currentTimeMillis()`: Captures the current system time in milliseconds.

- We calculate the sum and then measure the total time taken by subtracting the start time from the end time.

### Introducing Parallelization with Parallel Streams

- Java allows us to easily parallelize stream operations with the `parallel()` method.

- This enables Java to split the stream into multiple chunks and process them concurrently across multiple cores, speeding up operations.

### Example: Parallelizing the Stream

```java
long startTime = System.currentTimeMillis();
long result = LongStream.range(0, 1000000000L)
    .parallel()
    .sum();
long endTime = System.currentTimeMillis();

System.out.println("Sum: " + result);
System.out.println("Time taken with parallelization: " + (endTime - startTime) + " ms");
```

- `parallel()`: This method tells Java to process the stream in parallel, allowing the operation to take advantage of multiple cores.

- Java will split the stream into chunks and process each chunk on different cores, improving the overall execution time.

### Comparing Sequential vs. Parallel Execution

- When we run both the sequential and parallel versions of the code, we will typically see a performance improvement in the parallel version.

- This is because Java can distribute the workload across multiple processor cores, reducing the total time required to complete the task.

### Understanding Parallel Stream Mechanics

- Parallel streams work by splitting the stream into smaller parts, processing each part separately, and then merging the results.

- This is possible because of the stateless nature of functional operations, which do not depend on shared data between iterations.

### Key Concepts:

- **Stateful Operations**: Operations that rely on changing or maintaining a state (like a loop variable) are difficult to parallelize because they require synchronization.

- **Stateless Functional Programming**: In contrast, functional programming emphasizes stateless operations, making it easier to split the work across multiple cores.

### Why Functional Programming is Easy to Parallelize

- In traditional structured code, loops and stateful operations make parallelization difficult because multiple threads would need to coordinate access to shared variables (e.g., a sum variable in a loop).

- In functional programming, however, streams are stateless. Instead of manually controlling how each element is processed, we describe what operations to apply, and Java handles the parallelization automatically. 

#### The functional approach allows Java to:

- Divide the stream into chunks.
- Process each chunk independently across multiple cores.
- Merge the results from each chunk at the end.
- This makes functional code naturally parallelizable and more efficient.

---

## Functional Programming makes Java Easy

### Step 01: Modifying lists with `replaceAll` and `removeIf`

### Key Objectives:

1. Learn how to modify elements in a list using the `replaceAll()` method.

2. Understand how to remove elements from a list based on a condition using the `removeIf()` method.

3. Explore the advantages of using functional programming to simplify list modifications in Java.

### Introduction

Functional programming in Java introduces new methods that make list manipulation much easier and more expressive.

In this lecture, we explore two important methods for modifying lists: **`replaceAll()`** and **`removeIf()`**.

These methods allow us to update and filter list elements by passing functions directly to them, reducing the need for manual loops and enhancing code readability.

### Modifying List Elements Using `replaceAll()`

- Traditionally, to modify all elements in a list, we would loop through the list and update each element manually.

- However, with the `replaceAll()` method, we can easily modify all the elements in a list by passing a function that specifies how each element should be updated.

### **Example**: Converting All Elements to Uppercase

- Suppose we have a list of course names, and we want to convert all the course names to uppercase.

```java
List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS");
courses.replaceAll(str -> str.toUpperCase());
```

- `replaceAll()`: This method applies the specified function (in this case, `str.toUpperCase()`) to each element of the list.

- However, because `List.of()` creates an immutable list, this operation will throw an error. Immutable lists cannot be modified.

### Handling Immutable Lists

- To perform modifications, we need to work with a modifiable list.

- One way to achieve this is by creating a new `ArrayList` from the original list.

### **Example**: Creating a Modifiable List

```java
List<String> modifiableCourses = new ArrayList<>(courses);
modifiableCourses.replaceAll(str -> str.toUpperCase());
System.out.println(modifiableCourses);
```

- `new ArrayList<>(courses)`: Creates a new modifiable list from the original courses list.

- `replaceAll(str -> str.toUpperCase())`: Converts each course name to uppercase.

#### Output:

```java
[SPRING, SPRING BOOT, API, MICROSERVICES, AWS]
```

- Now, the list is successfully modified, and all course names are converted to uppercase.

### Removing Elements from a List Using `removeIf()`

- Another powerful method introduced in Java is `removeIf()`, which allows us to remove elements from a list based on a condition.

- Instead of looping through the list manually and removing elements, we can pass a predicate (a condition) directly to the `removeIf()` method.

### **Example**: Removing Courses with Short Names

- Suppose we want to remove all courses from the list that have names with fewer than six characters.

```java
modifiableCourses.removeIf(course -> course.length() < 6);
System.out.println(modifiableCourses);
```

- `removeIf()`: This method takes a predicate (a condition) and removes all elements from the list that satisfy the condition.

- In this case, `course.length() < 6` removes all course names with fewer than six characters.

#### Output:

```java
[SPRING, SPRING BOOT, MICROSERVICES]
```

- In this example, "API" and "AWS" are removed from the list because their names have fewer than six characters.

### Benefits of Functional Programming in List Manipulation

Using methods like `replaceAll()` and `removeIf()` makes list manipulation in Java much simpler and more expressive:

- **Cleaner code**: We can apply transformations and filters directly, without the need for explicit loops.

- **Higher readability**: The logic is easier to understand since it focuses on what needs to be done rather than how to do it.

- **Functional approach**: By passing functions (or predicates) directly to these methods, we can encapsulate logic in a more reusable and declarative way.

---

### Step 02: Playing with Files using Functional Programming

### Key Objectives:

1. Learn how to read and manipulate files using functional programming constructs in Java.

2. Understand how to process the contents of a file using streams, including operations like reading lines, finding unique words, and sorting.

3. Explore how to list and filter directories using functional programming.

### Introduction

Functional programming in Java has made file handling more intuitive and efficient.

In this lecture, we will explore how to perform common file operations using streams and functional programming constructs.

By the end of the lecture, you will know how to read file contents, manipulate text, and work with directories—all in a functional and streamlined way.

### Reading a File with `Files.lines()`

- To start, we will learn how to read the contents of a text file using the `Files.lines()` method.

- This method allows us to read all lines in a file and process them as a stream.

### **Example**: Reading and Printing File Contents

```java
Path path = Paths.get("file.txt");
Files.lines(path)
    .forEach(System.out::println);
```

- `Files.lines(path)`: Reads the file line by line and returns a `Stream<String>`.

- `forEach(System.out::println)`: Prints each line of the file to the console.

- This makes reading files simple and efficient

- However, you must handle exceptions (like IOException), so be sure to include proper error handling or a throws Exception clause in your method.

### Manipulating File Content

- Now that we can read the file, let's go one step further. Suppose you want to find the unique words in the file.

- To achieve this, we can split each line into words, flatten the results, and filter for distinct words.

### **Example**: Finding Unique Words in a File

```java
Files.lines(path)
    .flatMap(line -> Arrays.stream(line.split(" ")))  // Split lines into words
    .distinct()                                       // Find distinct words
    .forEach(System.out::println);                    // Print unique words
```

- `split(" ")`: Splits each line into words based on spaces.

- `flatMap()`: Flattens the stream of arrays into a stream of words.

- `distinct()`: Filters out duplicate words to show only unique ones.

### Sorting Unique Words

- Once we have the unique words, we may want to sort them in alphabetical order.

- We can easily achieve this by adding the `sorted()` method to our stream.

### **Example**: Sorting Unique Words Alphabetically

```java
Files.lines(path)
    .flatMap(line -> Arrays.stream(line.split(" ")))  // Split lines into words
    .distinct()                                       // Find distinct words
    .sorted()                                         // Sort words alphabetically
    .forEach(System.out::println);                    // Print sorted words
```

- `sorted()`: Sorts the words in natural (alphabetical) order.

- The sorted result will list all the unique words in alphabetical order, with uppercase words coming before lowercase ones.

### Listing Files in a Directory

- Next, we explore how to list the files in a directory.

- Using `Files.list()`, we can get a stream of files and directories in a given path.

### **Example**: Listing Files and Directories

```java
Files.list(Paths.get("."))
    .forEach(System.out::println);
```

- `Files.list(Paths.get("."))`: Lists all files and directories in the current project root.

- `forEach(System.out::println)`: Prints the names of all files and directories.

- This method is useful when you want to inspect the contents of a directory programmatically.

### Filtering Directories

- Sometimes, we may want to filter out only directories from the list of files.

- This can be done easily using the filter() method and the `Files.isDirectory()` function.

### **Example**: Filtering Only Directories

```java
Files.list(Paths.get("."))
    .filter(Files::isDirectory)    // Filter only directories
    .forEach(System.out::println);  // Print directory names
```

- `filter(Files::isDirectory)`: Filters the stream to only include directories.

- This filters out non-directory files, leaving only the directories in the list.

### Other File Operations

- Java’s Files API offers many other methods that can be used in combination with streams for more specific operations.

**For example**:

- `Files.isRegularFile()`: Check if a path is a regular file.

- `Files.isReadable()`: Check if a file is readable.

- `Files.isExecutable()`: Check if a file is executable.

- `Files.isHidden()`: Check if a file is hidden.

These methods allow you to fine-tune your file operations based on different conditions.

---

### Step 03: Playing with Threads using Functional Programming

### Key Objectives:

1. Learn how to create and manage threads in Java using both traditional and functional approaches.

2. Understand how functional programming simplifies the creation of threads by using lambda expressions.

3. Explore how functional programming improves readability and reduces boilerplate code when working with concurrency in Java.

### Introduction

In this lecture, we explore how functional programming simplifies working with threads in Java.

Traditionally, creating threads required implementing the `Runnable` interface or extending the `Thread` class.

With functional programming, we can streamline this process using **lambda expressions**, making the code more concise and easier to understand.

### Creating Threads with the Traditional Approach

- In Java, a common way to create a thread is by implementing the `Runnable` interface.

- This involves defining the `run()` method, which contains the logic that will be executed by the thread. We then pass this `Runnable` to a `Thread` object and start the thread.

### **Example**: Creating Threads Using `Runnable`

```java
Runnable runnable = new Runnable() {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getId() + ": " + i);
        }
    }
};

Thread thread1 = new Thread(runnable);
Thread thread2 = new Thread(runnable);

thread1.start();
thread2.start();
```

- **Runnable interface**: This defines a task to be executed in a separate thread. We implement the `run()` method to specify the task.

- **Thread class**: We create new Thread objects, passing in the Runnable, and start them using `thread1.start()` and `thread2.start()`.

- The code will print the thread ID and the counter from 0 to 9999 for each thread running in parallel.

### Simplifying Thread Creation with Functional Programming

- In Java, functional interfaces are interfaces that contain exactly one abstract method.

- The Runnable interface is a functional interface because it has only one method: `run()`.

- This means we can use lambda expressions to provide an implementation, making the code shorter and more readable.

### **Example**: Using Lambda Expressions to Create Threads

```java
Runnable runnable2 = () -> {
    for (int i = 0; i < 10000; i++) {
        System.out.println(Thread.currentThread().getId() + ": " + i);
    }
};

Thread thread3 = new Thread(runnable2);
Thread thread4 = new Thread(runnable2);

thread3.start();
thread4.start();
```

- **Lambda Expression**: The `runnable2` variable is defined as a lambda expression, which provides the implementation of the `run()` method without needing to explicitly define the method inside an anonymous class.

- **Simplification**: By using the lambda syntax, we eliminate the need for boilerplate code like the Runnable interface implementation and focus directly on the logic to be executed in the thread.

### Understanding the Benefits of the Functional Approach

Using lambda expressions in functional programming simplifies thread management by:

- **Reducing boilerplate**: We no longer need to write out the entire Runnable implementation, making the code more concise.

- **Improving readability**: The code is easier to understand because it focuses on the core logic rather than the ceremony of implementing an interface.

- **Leveraging functional interfaces**: Since Runnable is a functional interface, we can provide its implementation with a lambda expression, simplifying how we define tasks for threads.

---

### Step 04: Using Functional Programming in Java Applications

### Key Objectives:

1. Understand how functional programming fits into Java's object-oriented structure.

2. Learn where to apply functional programming constructs like streams, lambdas, and functional interfaces in real-world applications.

3. Recognize the challenges teams face when adopting functional programming and strategies to overcome them.

### Introduction

Java is primarily an **object-oriented programming (OOP)** language, where applications are built by creating classes, objects, and managing interactions between these objects.

However, with the introduction of **functional programming (FP)** features in Java, such as **streams**, **lambda expressions**, and **method references**, developers can now blend object-oriented and functional paradigms to write more concise, readable, and maintainable code.

### Integrating Functional Programming into Java Applications

- While Java remains object-oriented, **functional programming** can be highly useful in specific contexts.

- The best place to start incorporating functional programming is wherever you are processing collections of data, such as **lists**, **sets**, or **maps**.

### **Example**: Using Streams to Process Collections

```java
List<String> courses = List.of("Spring", "Java", "Kubernetes", "Microservices");

// Using functional programming to filter and process the list
courses.stream()
       .filter(course -> course.length() > 6)
       .map(String::toUpperCase)
       .forEach(System.out::println);
```

- **Streams**: Functional programming makes it easier to process collections with declarative operations like `filter()`, `map()`, and `forEach()`.

- **Lambdas and Method References**: We use lambda expressions and method references to apply operations without explicitly defining loops.

- Functional programming fits perfectly into these contexts, where collections and data processing tasks are common.

### Functional Programming as a Complement to Object-Oriented Programming

- Functional programming does not replace object-oriented programming in Java. Instead, it complements OOP by simplifying specific tasks like:

- Data manipulation and transformations.

- Working with large collections using streams.

- Writing cleaner and more readable code when performing repetitive tasks.

- For instance, when you need to perform operations on collections (filtering, sorting, mapping), functional programming is a powerful tool. 

- However, Java still relies on OOP principles for class design, object relationships, and larger application architecture.

### Challenges in Adopting Functional Programming

- One of the biggest challenges when introducing functional programming into existing Java projects is the learning curve for developers.

- Not all developers may be familiar with functional programming constructs like lambda expressions, method references, and stream operations.

### **Example**: Complex Functional Code

```java
List<String> courses = List.of("Spring", "Java", "Kubernetes", "Microservices");

courses.stream()
       .filter(course -> course.startsWith("S"))
       .map(course -> course.length())
       .forEach(System.out::println);
```

- For developers unfamiliar with functional programming, this code can be difficult to understand at first.

### The Paradigm Shift in Problem Solving

- The transition from structured programming to functional programming requires a paradigm shift.

- While structured programming focuses on explicit loops, iteration, and state management, functional programming focuses on declarative problem solving:

- **Declarative programming**: You describe what you want to achieve (e.g., filtering a list) without detailing how it should be done (e.g., using a for loop).

- **Immutability and statelessness**: Functional programming encourages avoiding state mutation, reducing the risk of bugs and making code easier to reason about.\

### The Benefits of Functional Programming in Java

- Despite the learning curve, functional programming provides several benefits:

- Concise and readable code: It reduces boilerplate code, allowing you to write more expressive and declarative operations.

- Easier data processing: Functional constructs like streams make it easier to manipulate data, especially large datasets.

- **Parallelism**: Functional programming simplifies parallel processing by removing the need for manual thread management.

- By understanding these benefits, teams can slowly adopt functional programming in their daily Java development workflow.

---
