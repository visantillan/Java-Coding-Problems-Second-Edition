package modern.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Car> cars = Arrays.asList(new Car("Dacia", "diesel", 100),
                new Car("Lexus", "gasoline", 300), new Car("Chevrolet", "electric", 150),
                new Car("Mercedes", "gasoline", 150), new Car("Chevrolet", "diesel", 250),
                new Car("Ford", "electric", 80), new Car("Chevrolet", "diesel", 450),
                new Car("Mercedes", "electric", 200), new Car("Chevrolet", "gasoline", 350),
                new Car("Lexus", "diesel", 300), new Car("Ford", "electric", 200)
        );

        Map<String, String> filtersMap = Map.of(
                "brand", "Chevrolet",
                "fuel", "diesel"
        );

        Predicate<Car> filterPredicate = t -> true;
        for (String key : filtersMap.keySet()) {
            filterPredicate = filterPredicate.and(PredicateBuilder.EQUALS
                    .toPredicate(PredicateBuilder.getFieldByName(Car.class, key), filtersMap.get(key)));
        }

        cars.stream()
                .filter(filterPredicate)
                .forEach(System.out::println);
    }
}