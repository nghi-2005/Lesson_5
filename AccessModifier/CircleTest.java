package AccessModifier;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getArea());

        Circle circle2 = new Circle(3.7,"red");
        System.out.println(circle2.getArea() + " va mau cua hinh la " + circle2.getColor());
    }
}
