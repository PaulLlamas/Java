package Week6.Shape;

public class ShapeTester {

    public static Shape findBiggestShape(Shape[] shapes){
        Shape largestShape = shapes[0];

        for (Shape shape: shapes)
            if (shape.computeArea() > largestShape.computeArea())
                largestShape = shape;

        return largestShape;
    }

    //find biggest triangle

    //find biggest circle

    //find biggest shape


    public static void main(String[] args) {
        Square[] arrayOfSquares =
                {new Square(2), new Square(5), new Square(3)};
        System.out.println(findBiggestShape(arrayOfSquares));
        Triangle[] arrayOfTriangle =
                {new Triangle(2,4), new Triangle(5,1), new Triangle(3,2)};
        System.out.println(findBiggestShape(arrayOfTriangle));
        Shape[] arrayOfShapes =
                {new Square(3), new Triangle(1,2), new Circle(4)};
        System.out.println(findBiggestShape(arrayOfShapes));

    }

}
