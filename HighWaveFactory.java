public class HighWaveFactory implements BulletFactory{
    public IBullet createBullet(double angle, int x, int y) {
        return new FireBullet(angle, x, y);
    }
}
