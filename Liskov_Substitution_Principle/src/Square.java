public class Square extends Figure implements iCalculateTheArea{


   public Square(int sideA) {
      super(sideA);
   }

   @Override
   public int area() {
      return super.getSideA() * super.getSideA();
   }
   
}
