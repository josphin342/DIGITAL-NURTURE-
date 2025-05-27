import java.util.Scanner;
public class GradeCaluculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        if(mark>=90  && mark<=100){
            System.out.println("Grade is A");
        }else if(mark>=90  && mark<=100){
            System.out.println("Grade is B");
        }else if(mark>=70  && mark<=79){
            System.out.println("Grade is C");
        }else if(mark>=60  && mark<=69){
            System.out.println("Grade is D");
        }else{
            System.out.println("Grade is F");
        } 
        sc.close();
    }   
    
}

