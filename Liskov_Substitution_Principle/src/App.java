public class App {
    public static void main(String[] args) throws Exception {
Square sq = new Square(5);
System.out.println(sq.area());

Rectangle rec = new Rectangle(5, 3);
System.out.println(rec.area());
    }
}
/*
4) Переписать код в соответствии с Liskov Substitution Principle:
public class Rectangle {
private int width;
private int height;
public void setWidth(int width) {
this.width = width;
}
public void setHeight(int height) {
this.height = height;
}
public int area() {
return this.width * this.height;
}
}
public class Square extends Rectangle {
@Override
public void setWidth(int width) {
super.width = width;
super.height = width;
}
@Override
public void setHeight(int height) {
super.width = height;
super.height = height;
}
}
​ */
