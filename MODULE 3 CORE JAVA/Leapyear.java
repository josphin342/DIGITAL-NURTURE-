import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year=sc.nextInt();
        if(year % 2==0){
            if(year % 100==0){
                if(year % 400==0){
                    System.out.println(year+" is a Leap year");
                }else{
                     System.out.println(year+" is a not Leap year");
                }
            }else{
                System.err.println(year+" is a not Leap year");
            }

        }else{
             System.out.println(year+" is a Leap year");
        }
        sc.close();
    }
}

    

