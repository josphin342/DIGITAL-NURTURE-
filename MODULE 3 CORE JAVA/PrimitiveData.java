import java.util.Scanner; 
public class PrimitiveData {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int myInt=sc.nextInt();
        float myFloat=sc.nextFloat();
        double myDouble=sc.nextDouble();
        char mychar='A';
        boolean check=sc.nextBoolean();
        System.out.println("Integer no is:" +myInt);
        System.out.println("float no is:" +myFloat);
        System.out.println("Double no is:" +myDouble);
        System.out.println("character is:" +mychar);
        System.out.println("boolean is:" +check);
        sc.close();
    }
    
}
