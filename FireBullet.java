import java.awt.*;

public class FireBullet implements IBullet {

// Fields

    private double x ;
    private double y ;
    private int r ;

    private double dx ;
    private double dy ;
    private double Speed ;
    private double Rad;

    private Color color1 ;


    // Constructor
    public FireBullet(double angle, int x, int y )
    {

        this.x = x ;
        this.y = y ;
        r = 6;
        Speed = 8;
        Rad = Math.toRadians (angle);
        dx = Math.cos (Rad ) * Speed;
        dy = Math.sin (Rad) * Speed;


        color1 = Color.RED ;
    }

    //Functions
    public double getx() {return x ;}
    public double gety() {return y; }
    public double getr() {return r ;}

    public boolean update(){
        x += dx ;
        y += dy ;

        if (x < -r || x > GamePanel.WIDTH + r
                || y < -r || y > GamePanel.HEIGHT + r ){
            return true ;
        }
        return false ;
    }
    public void draw (Graphics2D g){

        g.setColor (color1);
        g.fillOval((int) (x - r) , (int) (y - r) , 2 * r , 2 * r );
    }


}

