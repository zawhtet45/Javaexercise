import java.util.Random;
import java.util.Arrays;
public class Exercises22{
    public static void main(String[] args){
        int numValues = 20;
        int[] a = rangeCount(numValues);
        int score = Range(a,0,5);
        System.out.println(Arrays.toString(a));
        System.out.println(score);
    }
        public static int[] rangeCount(int size){
        Random random = new Random();
        int[]a = new int[size];
        for(int i = 0; i < a.length; i++){
            a[i] = random.nextInt(20);
        }
        return a;
    }
    public static int Range(int[]a,int low, int high){
        int count = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] >= low && a[i] < high){
                count ++;
            }
        } return count;
    }
}