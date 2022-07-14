import java.util.Scanner;
// A palindrome number is a number that is same after reverse
public class palindrome_number{
public static void main(String[] args) {
    int n,sum=0,r=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Value of n:"); 
    n=sc.nextInt();
    System.out.println(n);
    int temp=n;
    while(n>0){
     r=n%10;//remainder
     sum=(sum*10)+r;
     n=n/10;
    }
    if(temp==sum){
        System.out.println("n is a palindrome number");
    }else{
        System.out.println("n is not a palindrome number");
    }


}
}