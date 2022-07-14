
import java.lang.Math;
public class Random_number {
    public static void main(String[] args){
        System.out.println("Random number:" + Math.random());
        int min=1000;
        int max=2000;
        System.out.println("Random value of type int between "+min+" to "+max+ ":");  
        int certain = (int)(Math.random()*(max-min+1)+min);  
        System.out.println(certain);  

    }
    
}
