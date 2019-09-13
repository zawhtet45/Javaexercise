import java.util.Random;
import java.util.Arrays;
public class Exercises23{
    public static void main(String[] args){
        int[] num = new int[200];
        int[] a = new int[200];
        Random random = new Random();
        for(int i = 0; i < num.length; i++){
            a[i] = random.nextInt(100);
            System.out.println(a[i]);
        }
        
    }
}
    