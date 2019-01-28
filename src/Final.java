import java.util.Scanner;

public class Final {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Współrzędna X:");
        double x = scanner.nextDouble();
        System.out.println("Współrzędna Y:");
        double y = scanner.nextDouble();

        Point point = new Point(x, y);
        Test test = new Test();
        System.out.print("[" + point.getX() + ", " + point.getY() + "]");
        System.out.println("- " + test.giveFourth(point) + " ćwiartka");

    }
}