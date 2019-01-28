public class Test {

    int giveFourth(Point point) {

        if (point.getX() >= 0 && point.getY() >=0)
            return 1;
        else if (point.getX() < 0 && point.getY() >=0)
            return 2;
        else if (point.getX() <= 0 && point.getY() < 0)
            return 3;
        else
            return 4;

    }
}
