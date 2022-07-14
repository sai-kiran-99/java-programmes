// Prime numbers >> A number which can be divided by 1 and itself is called a prime number.(digit must be greater than 1).
import java.util.Scanner;
public class prime_numbers{
    /**
     * @param args
     */
    public static void main(String[] args){
        //n=length
        int n,i,m,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value of n:");
        n=sc.nextInt();
        System.out.println(n);
        m=n/2;
        if (n==0 || n==1) {
            System.out.println(n + "is not a prime number");
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");      
                    flag=1;      
                    break;      
                   }      
                  }      
                  if(flag==0)  { System.out.println(n+" is prime number"); }  
                 }
                }
            }
        
        
       
        
    
