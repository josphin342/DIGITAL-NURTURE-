import java.util.Scanner;
public class SimpleCaluculator{ 
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        double num1=sc.nextDouble();
        System.out.println("Enter the second number");
        double num2=sc.nextDouble();
        System.out.println("Enter your choice");
        int choice=sc.nextInt();
        double result;
        switch(choice){
            case 1 : {
                result=num1+num2;
                System.out.println("Addition of the number is: " +result);
            }
            case 2 : {
                result=num1-num2;
                System.out.println("Substraction of the  number is:"+result);
            }
            case 3 : {
                result=num1*num2;
                System.out.println("Multiplication of the number is: "+result);
            }
            case 4 : {
                if(num2!=0){
                    result=num1/num2;
                    System.out.println("Division of the number is: "+result);
                }
                else{
                    System.out.println("Division by zero is ArithematicException");
                }
            }
            default :
              System.out.println("invalid choice");
        }
        
        sc.close();

    }
}
