import java.util.Scanner;

public class reversing_number {
    public static void main(String[] args){
        int remainder,reverse;
        Scanner num=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=num.nextInt();
        while(number!=0){
            remainder=number%10;//lastdigit
            reverse=0*remainder+10;
            number=number/10;
        }
        System.out.println
    }
}
