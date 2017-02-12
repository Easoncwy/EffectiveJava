package Chapter3;

import java.awt.*;

/**
 * Created by eason on 2017/2/12.
 */
public class ColorPoint extends Point{
    private final Color color;

    public ColorPoint(int x, int y, Color color){
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point))
            return false;

        if (!(o instanceof ColorPoint))
            return o.equals(this);

        return super.equals(o) && ((ColorPoint) o).color == color;
    }
}
