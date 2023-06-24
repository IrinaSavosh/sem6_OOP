public class App {
    public static void main(String[] args) throws Exception {

        Car c1 = new Car(160);
        System.out.println(c1.calculateAllowedSpeed(c1));
        System.out.println(c1.maxSpeed);

        Bus b1 = new Bus(120);
        System.out.println(b1.calculateAllowedSpeed(b1));
        System.out.println(b1.maxSpeed);

        Vehicle v1 = new Bus(110);
        System.out.println(v1.calculateAllowedSpeed(v1));
        System.out.println(v1.maxSpeed); 

        /*
         * 2) Переписать код SpeedCalculation в соответствии с Open-Closed Principle:
         * public class SpeedCalculation {
         * public double calculateAllowedSpeed(Vehicle vehicle) {
         * if (vehicle.getType().equalsIgnoreCase("Car")) {
         * return vehicle.getMaxSpeed() * 0.8;
         * } else if (vehicle.getType().equalsIgnoreCase("Bus")) {
         * return vehicle.getMaxSpeed() * 0.6;
         * }
         * ​
         * return 0.0;
         * }
         * }
         * public class Vehicle {
         * int maxSpeed;
         * String type;
         * public Vehicle(int maxSpeed, String type) {
         * this.maxSpeed = maxSpeed;
         * this.type = type;
         * }
         * public int getMaxSpeed() {
         * return this.maxSpeed;
         * }
         * public String getType() {
         * return this.type;
         * }
         * }
         */
    }
}
