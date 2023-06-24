public class Bus extends Vehicle{

   public Bus(int maxSpeed) {
      super(maxSpeed);
   }

   @Override
   public double calculateAllowedSpeed(Vehicle vehicle) {
      return super.calculateAllowedSpeed(vehicle)*0.6;
   }

   @Override
   public int getMaxSpeed() {

      return super.getMaxSpeed();
   }

   @Override
   public void setMaxSpeed(int maxSpeed) {

      super.setMaxSpeed(maxSpeed);
   }
   
   
}
