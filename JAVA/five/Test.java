public class Test {
    public static void main(String args[]) {
        boolean b=true;                                 //boolean range = true or false 
        char c=255;                                     //char range = 0 to 255 (ASCII values)
        byte num=13;                                    //byte range = -128 to 127 
        short s=32767;                                  //short range = -32,768 to 32,767
        int i=21;                                       //int range = -2,147,483,648 to 2,147,483,647
        long l=355743838658886358l;                     //long range = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float f=346463264664.6767473f;                  //float range = upto 7 decimal digits
        double d=246266356356888655735.5514354661;      //double range = upto 16 decimal digits 
        System.out.println("boolean value is: "+b);     //(Default value for all datatypes = 0)
        System.out.println("char value is: "+c);
        System.out.println("byte value is: "+num);
        System.out.println("short value is: "+s);
        System.out.println("int value is: "+i);
        System.out.println("long value is: "+l);       
        System.out.println("float value is: "+f);      
        System.out.println("double value is: "+d);
    }
}