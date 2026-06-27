public class Main {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.display();
        Outer.Inner oi = o.new Inner();
        oi.display();
    }
}
