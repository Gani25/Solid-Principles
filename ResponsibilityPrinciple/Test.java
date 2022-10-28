public class Test {
    public static void main(String[] args) {
        Car c1 = new Car("Ferrari");
        Car c2 = new Car("BMW");

        Driver paul = new Driver();

        paul.driving(c1);
        paul.fillTank(c1);

        Mechanic m = new Mechanic();
        m.changeTyre(c2);
    }
}
