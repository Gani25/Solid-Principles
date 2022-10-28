public class Car {
    private String carName;

    public Car(String carName) {

        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    public void start() {
        System.out.println("Car is starting " + carName);

    }

    public void stop() {
        System.out.println("Car is stopped " + carName);

    }
}