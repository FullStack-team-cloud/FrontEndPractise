public class AbstractPen {
    private String ink, needle, cabinet;
    public void write(){
        System.out.println("Writing in "+ink+" with "+needle+" having "+cabinet);
    }
    public void setInk(String ink){
        this.ink=ink;
    }
    public String getInk(){
      return ink;
    }
}