package Chapter3;

import java.awt.*;

/**
 * Created by eason on 2017/2/12.
 */
public class Main {
    public static void main(String[] args) {
        Point point = new Point(1, 2);
        ColorPoint colorPoint = new ColorPoint(1, 2, Color.BLUE);

        if (point.equals(colorPoint))
            System.out.println("true");
        else
            System.out.println("false");

        if (colorPoint.equals(point))
            System.out.println("true");
        else
            System.out.println("false");

    }


}
