//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class Text {
    private double x;
    private double y;
    private long Time;
    private String s;
    private long Start;

    public Text() {
    }

    public Text(double var1, double var3, long var5, String var7) {
        this.x = var1;
        this.y = var3;
        this.Time = var5;
        this.s = var7;
        this.Start = System.nanoTime();
    }

    public boolean update() {
        long var1 = (System.nanoTime() - this.Start) / 1000000L;
        return var1 > this.Time;
    }

    public void draw(Graphics2D var1) {
        var1.setFont(new Font("French Script MT Regular", 0, 15));
        long var2 = (System.nanoTime() - this.Start) / 1000000L;
        int var4 = (int)(255.0D * Math.sin(3.14D * (double)var2 / (double)this.Time));
        short var6;
        if (var4 > 255) {
            var6 = 255;
        } else {
            var6 = 160;
        }

        var1.setColor(new Color(255, 255, 255, var6));
        int var5 = (int)var1.getFontMetrics().getStringBounds(this.s, var1).getWidth();
        var1.drawString(this.s, (int)(this.x - (double)(var5 / 2) + 20.0D), (int)(this.y + 20.0D));
    }
}
