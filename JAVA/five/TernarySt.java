// Ternary statement example
// Syntax: (condition) ? valuIfTrue : valueIfFalse;
public class TernarySt{
    public static void main(String args[]){
        int b1 = true?10:20;
        System.out.println("b1 value: "+b1);
        int b2 = false?33:12;
        System.out.println("b2 value: "+b2);
        String a= (b1 < b2)?b1+" is lessthan "+b2:b1+" is greaterthan "+b2;
        System.out.println(a);
    }
}