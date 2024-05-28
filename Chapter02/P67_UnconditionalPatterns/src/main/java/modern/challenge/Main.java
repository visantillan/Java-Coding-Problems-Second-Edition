package modern.challenge;

class Vehicle {
    public String start() {
        return "started";
    }

    public String stop() {
        return "stopped";
    }
}

class Truck extends Vehicle {
}

class Van extends Vehicle {
}

public class Main {

    private static String drive(Vehicle v) {

        return switch (v) {
            case Truck truck -> "truck: " + truck;
            case Van van -> "van: " + van;
            // case null -> "so, you don't have a vehicle?"; // we can still use a null check
            case Vehicle vehicle ->
                    "vehicle: " + vehicle.start(); // total/unconditional pattern throw NPE immediately
        };
    }

    public static void main(String[] args) {
        System.out.println(Main.drive(new Truck()));
        System.out.println(Main.drive(new Van()));
        System.out.println(Main.drive(null));
    }
}
