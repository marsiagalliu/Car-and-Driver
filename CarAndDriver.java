public class CarAndDriver {
    public static void main(String[] args) {
        Driver driver = new Driver(10);

        driver.drive();
        driver.drive();
        driver.drive();
        driver.drive();

        driver.boosters();

        driver.refuel();
        driver.refuel();
        driver.refuel();
    }
}
