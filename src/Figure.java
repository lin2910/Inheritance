import java.awt.dnd.DragSourceDragEvent;

public abstract class Figure {
    final static double eps = 0.001;
    abstract double perimeter();

    abstract double square();

}


class Rectangle extends Figure{

    double x, y;
    double height, width;


    Rectangle(double x, double y, double height, double width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    Rectangle() {
    }


    @Override
    double perimeter() {
        return 2*(height+width);
    }

    @Override
    double square() {
        return height*width;
    }
}


class Square extends Rectangle{
    double x1,y1, x2, y2, x3, y3, x4, y4;
    double side;

    Square(double x1,double y1, double x2, double y2, double x3, double y3,double x4, double y4) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
        if (Math.abs(x1 - x2) < eps)
            side = Math.abs(y1 - y2);
        else
            side = Math.abs(x1 - x2);
        height = side;
        width = side;
    }

    Square(double x ,double y, double side) {
        this.x1 = x;
        this.y1 = y;
        this.side = side;
        this.x2 = x;
        this.y2 = y + side;
        this.x3 = x + side;
        this.y3 = y + side;
        this.x4 = x + side;
        this.y4 = y;
        height = side;
        width = side;

    }

    double perimeter(){
        return 4*side;
    }

    double square(){
        return side*side;
    }
}


class Triangle extends Figure{
    double x1,y1, x2, y2, x3, y3;
    double a, b, c;

    Triangle(double x1,double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        c = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
    }


    @Override
    double perimeter() {
        return a+b+c;
    }

    @Override
    double square() {
        double p = this.perimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

class Circle extends Figure {
    double x, y;
    double radius;

    Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }


    @Override
    double perimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    double square() {
        return Math.PI*radius*radius;
    }
}
