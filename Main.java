public class Main {

    public static void main(String[] args) {
        Car car = new Car("Honda", "Civic", 2018);
        System.out.println(car);

        car.drive(120.5);
        car.drive(30);
        System.out.println("After driving: " + car);

        // negative miles shouldn't do anything
        car.drive(-50);
        System.out.println("After -50: " + car);

        car.setYear(2019);
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Mileage: " + car.getMileage());
    }
}
