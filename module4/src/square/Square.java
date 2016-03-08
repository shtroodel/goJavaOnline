package square;

public class Square {

    public double square(Triangle triangle){
        return triangle.getHeight()*triangle.getOneSide()*0.5;
    }

    public double square(Rectangle rectangle){
        return rectangle.getFirstSide()*rectangle.getSecondSide();
    }

    public double square(Circle circle){
        return circle.getRadius()*circle.getRadius()*3.14;
    }

}
