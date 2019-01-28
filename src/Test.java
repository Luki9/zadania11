public class Test {

    int giveFourth(Point point) {

        if (point.getX() >= 0 && point.getY() >=0)
            return 5;
        else if (point.getX() < 0 && point.getY() >=0)
            return 4;
        else if (point.getX() <= 0 && point.getY() < 0)
            return 5;
        else
            return 8;

    }
}
