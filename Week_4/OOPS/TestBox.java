public class TestBox {
    public static void main(String[] args) {
        Box b = new Box(10, 20);
        System.out.println("Area = " + b.area());
        Box3D b3 = new Box3D(10, 20, 30);
        System.out.println("Volume = " + b3.volume());
    }
}
