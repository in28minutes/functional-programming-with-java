package programming;

import java.util.List;
import java.util.function.Predicate;

public class practiseClass {

    public static void main(String[] args) {
        List<Topic> topics = List.of(new Topic("Spring", "Framework", 98, 20000),
                new Topic("Spring Boot", "Framework", 95, 18000),
                new Topic("API", "Microservices", 97, 22000),
                new Topic("Microservices", "Microservices", 96, 25000),
                new Topic("FullStack", "FullStack", 91, 14000),
                new Topic("AWS", "Cloud", 92, 21000),
                new Topic("Azure", "Cloud", 99, 21000),
                new Topic("Docker", "Cloud", 92, 20000),
                new Topic("Kubernetes", "Cloud", 91, 20000));

        // allMatch, noneMatch, anyMatch
        Predicate<Topic> reviewScoreGreaterThan95Predicate
                = topic -> topic.getReviewScore() > 95;

        Predicate<Topic> reviewScoreGreaterThan90Predicate
                = topic -> topic.getReviewScore() > 90;

        Predicate<Topic> reviewScoreLessThan90Predicate
                = topic -> topic.getReviewScore() < 90;
        System.out.println("first line >>>>>>>>>>>>>>>>>>>>");
        topics.stream().filter(reviewScoreGreaterThan95Predicate).forEach(x -> System.out.println(x.getName()));
        System.out.println("second line>>>>>>>>>>>>>>>>>>>>");
        topics.stream().filter(reviewScoreGreaterThan90Predicate).forEach(x -> System.out.println(x.getName()));
        System.out.println("third line>>>>>>>>>>>>>>>>>>>>");
        topics.stream().filter(reviewScoreLessThan90Predicate).forEach(x -> System.out.println(x.getName()));

    }
}