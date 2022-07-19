import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        int i,fact=1;
        Scanner Sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=Sc.nextInt();
        System.out.println(n);
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("the factorial of the num" + n +"is" + fact);

    }
}