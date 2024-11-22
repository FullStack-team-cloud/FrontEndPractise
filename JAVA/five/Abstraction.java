public class Abstraction {
    public static void main(String args[]){
        AbstractPen ap = new AbstractPen();
        ap.setInk("blue");      // sets ink to blue
        String ink = ap.getInk();       // gets ink (blue) and assign to ink
        System.out.println(ink);        // to check above line 
        ap.write();
    }
}