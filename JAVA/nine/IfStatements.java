public class IfStatements{
  public static void main(String args[]){
    //simple if
    int x=10;
    int y=12;
    if(x+y>20){
      System.out.println("x+y is greater than 20");
    }
   //if else
   int a=4;
    int b=3;
    if(x+y>10){
      System.out.println("a+b is less than 10");
    }
    else{
      System.out.println("a+b is greater than 20");
    }
    //if-else-if ladder
    String city ="Banglore";
    if(city=="tirupathi"){
      System.out.println("city is tirupathi");
    }
    else if(city=="chennai"){
      System.out.println("city is chennai");
    }
    else{
      System.out.println(city);
    }
  }
}