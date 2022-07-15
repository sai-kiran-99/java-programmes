import java.util.*;
//triangle
public class patternprint {
    public static void main(String[] args){
             int n,i,j;
             Scanner sc=new Scanner(System.in);
             System.out.println("enter the value of N:");
             n=sc.nextInt();
             System.out.println(n);
             for(i=1;i<=n;i++){
                for( j=1;j<=i;++j){
                    System.out.print("* ");

                }
                System.out.print("\n");
             }
    } 
}