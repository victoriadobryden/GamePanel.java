public class LowWaveFactory implements BulletFactory{
    public IBullet createBullet(double angle, int x, int y) {
        return new MetalBullet(angle, x, y);
    }
}
