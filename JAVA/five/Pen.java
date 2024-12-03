public class Pen {
    String ink, needle, cabinet;
    Pen(){
        System.out.println("no args");
    }
    Pen(String ink){
        System.out.println("Writing in "+ink+" pen");
    }
    Pen(String ink, String needle){
        System.out.println("Writing in "+ink+" pen with "+needle);
    }
    Pen(String ink, String needle, String cabinet ){
        System.out.println("Writing in "+ink+" pen with "+needle+" having "+cabinet);
    }
    public void write(){
        System.out.println("Writing in "+ink+" pen with "+needle+" having "+cabinet);
    }
}