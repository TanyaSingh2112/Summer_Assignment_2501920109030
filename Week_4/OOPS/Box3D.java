public class Box3D extends Box {
    private int height;
    public Box3D(int length, int breadth, int height){
        super(length, breadth);
        this.height = height;
    }
    public int volume() {
 return length * breadth * height;
}
}
