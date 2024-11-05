public class IfStatements {
	public static void main (String args[]) {
		String name="pavan";		
		//Simple if
        if(name.equals("pavan")) {
		System.out.println("I am: "+name.toUpperCase());
		}
        //if-else
        int num=10;
        if(num%2 == 0) {
            	System.out.println(num+" is even");
        } else {
            	System.out.println(num+" is odd");
        }

        //if-else-if ladder
        int a=10,b=15,c=3;
        if (a>b && a>c){
            System.out.println(a+" is bigger number");
        } else if (b>a && b>c){
            System.out.println(b+" is bigger number");
        } else{
		    System.out.println(c+" is bigger number");
        }
	}
}
