public class Car extends Vehicle{


   public Car(int maxSpeed) {
      super(maxSpeed);
  
   }

   @Override
   public int getMaxSpeed() {
      return super.getMaxSpeed();
   }

   @Override
   public void setMaxSpeed(int maxSpeed) {
      super.setMaxSpeed(maxSpeed);
   }
   
   @Override
   public double calculateAllowedSpeed(Vehicle vehicle) {
      return super.calculateAllowedSpeed(vehicle)*0.8;
   }


   
}
