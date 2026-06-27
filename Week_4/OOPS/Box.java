public class Box {

    protected int length;
    protected int breadth;
    public Box(int length, int breadth) {
     this.length = length;
     this.breadth = breadth;
    }
    public int area() {
     return length * breadth;
}

}