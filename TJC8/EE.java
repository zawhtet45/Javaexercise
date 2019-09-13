import java.util.Arrays;
public class EE{
    public static void main(String[] args){
        double[] a ={1,2,3};
        for(int i = 0; i <= a.length; i++){
            a[i] = Math.pow(a[i],2.0);
            }
        System.out.println(Arrays.toString(a));
    }
}