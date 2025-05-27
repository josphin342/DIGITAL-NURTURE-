public class MethodOverload {
    public int Add(int a,int b){
        return (a+b);
    }
    public double Add(double a,double b){
        return (a+b);
    }
    public int Add(int a,int b,int c){
        return (a+b+c);
    }
    public static void main(String[] args) {
        MethodOverload calc=new MethodOverload();
        int sum=calc.Add(15,15);
        double sum1=calc.Add(12.5,48.5);
        int sum2=calc.Add(7,5,8);
        System.out.println("Sum of two integer is: " + sum);
        System.out.println("Sum of two decimal no is: " + sum1);
        System.out.println("Sum of three integer is: " + sum2);
    }
    
}
