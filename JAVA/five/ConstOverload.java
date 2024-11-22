public class ConstOverload {
    public static void main(String args[]){
        Pen p = new Pen();
        p.write();
        Pen p1 = new Pen("blue");
        Pen p2 = new Pen("blue","ball point");
        Pen p3 = new Pen("blue","ball point","cusion");
    }
}