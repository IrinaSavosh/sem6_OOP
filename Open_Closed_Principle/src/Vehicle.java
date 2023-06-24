public abstract class Vehicle implements SpeedCalculation {

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

}
