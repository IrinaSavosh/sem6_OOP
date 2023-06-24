public abstract class Vehicle implements SpeedCalculation{

   int maxSpeed;


   public Vehicle(int maxSpeed) {
      this.maxSpeed = maxSpeed;

   }
   public int getMaxSpeed() {
      return maxSpeed;
   }
   public void setMaxSpeed(int maxSpeed) {
      this.maxSpeed = maxSpeed;
   }
   @Override
   public double calculateAllowedSpeed(Vehicle vehicle) {
      return maxSpeed;
   }
  
   
   // calculateAllowedSpeed();
   // public class SpeedCalculation {

   // 

   // public int getMaxSpeed() {
   // return this.maxSpeed;
   // }

   // public String getType() {
   // return this.type;
   // }

   // public double calculateAllowedSpeed(Vehicle vehicle) {
   // if (vehicle.getType().equalsIgnoreCase("Car")) {
   // return vehicle.getMaxSpeed() * 0.8;
   // } else if (vehicle.getType().equalsIgnoreCase("Bus")) {
   // return vehicle.getMaxSpeed() * 0.6;
   // }

   // return 0.0;
   // }
   // }
}
