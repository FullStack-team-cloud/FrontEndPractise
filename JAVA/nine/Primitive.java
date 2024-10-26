public class Primitive {
    public static void main(String args[]) {
        boolean b=true;                                 //boolean range = true or false 
        char c=200;                                     //char range = 0 to 255 (ASCII values)
        byte num=13;                                    //byte range = -128 to 127 
        short s=32767;                                  //short range = -32,768 to 32,767
        int i=2147483647;                                       //int range = -2,147,483,648 to 2,147,483,647
        long l=355743838658886358l;                     //long range = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float f=34646326456664.676749f;                  //float range = upto 7 decimal digits
        double d=246266356356888655735.55143546783566614;      //double range = upto 16 decimal digits 
        System.out.println("boolean value is: "+b);     //(Default value for all datatypes = 0)
        System.out.println("char value is: "+c);
        System.out.println("byte value is: "+num);
        System.out.println("short value is: "+s);
        System.out.println("int value is: "+i);               //Primitive.java:1: error: class Test is public, should be declared in a file named Test.java
        System.out.println("long value is: "+l);              //above eror showing class name shoud be same as file name ,in case not same getting like above error
        System.out.println("float value is: "+f);      
        System.out.println("double value is: "+d);               //Primitive.java:7: error: <identifier> expected int range = -2,147,483,648 to 2,147,483,647
                                                                 
    }
}                                                                //but float and double after range is crossed but not showing any error like above expected int range