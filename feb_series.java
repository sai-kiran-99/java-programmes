import java.util.Scanner;
// Febinocci series  >>  if we add last two digits we must get the next digit 
public class feb_series{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int length;//length
        System.out.println("Enter the length:");
        length=sc.nextInt();
        System.out.println(length);
        int[] num=new int[length];
        num[0]=0;
        num[1]=1;
        System.out.println(num[0] + " " + num[1]);
        for(int i=2;i<length;i++){
            num[i]=num[i-2]+num[i-1];
            System.out.println(num[i] + "");
        }


    }
}