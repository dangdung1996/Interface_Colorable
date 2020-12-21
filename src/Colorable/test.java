package Colorable;

public class test {
    public static void main(String[] args) {
        Shape[] arrShape= new Shape[3];

        arrShape[0]= new Circle(2, "yellow", true);
        arrShape[1]= new Rectangle(3,5, "green", true);
        arrShape[2]= new Square(6, "blue", true);

        System.out.println("Shapes: ");
        for (Shape shape: arrShape){
            System.out.println(shape.toString());
        }

        System.out.println(((Square) arrShape[2]).howToColor());
    }
}