import java.util.Scanner;

//An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits
//ex:1=1^1=1,22=2^2+2^2=8 not an armstrong,153: 1^3 + 5^3 + 3^3 = 1 + 125+ 27 = 153
//note:There is no two digit armstrong number
public class Armstrongnumber {
    public static void main(String[] args){
       Scanner arm=new Scanner(System.in);
       int n;
       System.out.println("Enter the value of n:");
       n=arm.nextInt();
       System.out.println(n);



    }
    
}
