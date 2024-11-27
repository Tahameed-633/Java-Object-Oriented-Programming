package Package1;

public class Test {
    public static void main(String[] args) {
        GeometricObject obj = new Rectangle(4.0, 6.0, "Green");

        
        System.out.println("Area: " + obj.getArea());
        System.out.println("Perimeter: " + obj.getPerimeter());

        
        System.out.println(obj.toString());
    }
}
