import java.awt.*;

public interface IBullet {
    public double getx();
    public double gety();
    public double getr();

    public boolean update();
    public void draw (Graphics2D g);
}


