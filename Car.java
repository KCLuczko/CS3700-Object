public class Car {

    private String make;
    private String model;
    private int year;
    private double mileage;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = 0;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // adds miles to the car, ignores negative numbers
    public void drive(double miles) {
        if (miles > 0) {
            mileage += miles;
        }
    }

    public String toString() {
        return year + " " + make + " " + model + " - " + mileage + " miles";
    }
}
