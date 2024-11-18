public class Operation {
    int result;
    public void add(int fnum,int snum){
        result=fnum+snum;
        System.out.println("Addition: "+result);
    }
     public void sub(int fnum,int snum){
        result=fnum-snum;
        System.out.println("Subtraction: "+result);
    }
     public void mul(int fnum,int snum){
        result=fnum*snum;
        System.out.println("Multiplication: "+result);
    }
     public void div(int fnum,int snum){
        float result=fnum/(float)snum;
        System.out.println("Division: "+result);
    }
}