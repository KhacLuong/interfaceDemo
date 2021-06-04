import entity.TwoWheeler;

public class Aplication {
    public static void main(String[] args) {
        TwoWheeler tw = new TwoWheeler("Id1", "type 1");
        tw.start();
        tw.stop();
        tw.brake();
        tw.accelerate(100);
    }
}
