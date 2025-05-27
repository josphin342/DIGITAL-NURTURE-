public class precedence {
    public static void main(String[]args){
        int result1=10+5*2;
        int result2=(20/6+(18*5-10));
        int result3 = (10 + 5) * 2; 
        int result4 = 10 + 5 - 2 * 3; 
        int result5 = 20 / 4 + 3 * 2; 
        int result6 = (20 / (4 + 3)) * 2;

        // Display results
        System.out.println("Result of 10 + 5 * 2: " + result1);
         System.out.println("result of (20/6+(18*5-10)) is: " +result2);
        System.out.println("Result of (10 + 5) * 2: " + result3);
        System.out.println("Result of 10 + 5 - 2 * 3: " + result4);
        System.out.println("Result of 20 / 4 + 3 * 2: " + result5);
        System.out.println("Result of (20 / (4 + 3)) * 2: " + result6);
        
    }
    
}
