public class Main {
    public static void main(String[] args){

        System.out.println("Square");
        Square square = new Square(1,1,1,2,2,2,2,1);
        System.out.println("Perimeter is: " + square.perimeter());
        System.out.println("Square is: " + square.square());

        System.out.println("Rectangle");
        Rectangle rectangle = new Rectangle(1,1, 4, 5);
        System.out.println("Perimeter is: " + rectangle.perimeter());
        System.out.println("Square is: " + rectangle.square());


        System.out.println("Triangle");
        Triangle triangle = new Triangle(-1,-1,-1,-2,-2,-1);
        System.out.println("Perimeter is: " + triangle.perimeter());
        System.out.println("Square is: " + triangle.square());

        System.out.println("Circle");
        Circle circle = new Circle(1,1,5);
        System.out.println("Perimeter is: " + circle.perimeter());
        System.out.println("Square is: " + circle.square());
    }

}
