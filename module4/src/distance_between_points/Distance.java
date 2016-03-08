package distance_between_points;
import static java.lang.Math.*;

public class Distance {

    public double distance(Point point1, Point point2){
        return sqrt(pow((point2.getX() - point1.getX()), 2) + pow((point2.getY() - point1.getY()), 2));
    }
}
