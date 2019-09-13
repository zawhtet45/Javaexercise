import java.util.Arrays;
public class Exercises1{
    public static void main(String[] args){
        
        double[]a = {1,2,3};
        powerArray(a,2);
        int[]b ={1,2,3,4,5,6,99};
        System.out.println(Arrays.toString(Histogram(b))); 
    }
    public static double[] powerArray(double[] a,double value){
        double[] aSquared = new double[a.length];
        for (int i = 0; i < a.length; i++) { 
            aSquared[i] = Math.pow(a[i],value);
            System.out.println(aSquared[i]);
        }return aSquared;
    }
    public static int[] Histogram(int[]score){
         int[] count = new int[100];
        for (int i = 0; i < score.length; i++) {
         int index = score[i];
        count[index]++;  
            }return score;
     }
}
