public class Exercises21{
    public static void main(String[] args){
        int[] num = {1,2,3,4,5};
        int total = 0;
        reduce(num);
        System.out.println(reduce(num));
  }
    public static int reduce(int[]a){
        int total = 0;
        for(int i = 0; i < a.length; i++){
            total = total + a[i];
    }
    return total;
  }
}