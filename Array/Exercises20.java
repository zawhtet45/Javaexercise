public class Exercises20{
      public static void main(String[]args){

       int[]array = {1,2,3,4,5};

       int number = 1;

       Search(array,number);

       System.out.print(Search(array,number));

   }

   public static int Search(int[]a,int number){

       for(int i=0;i<a.length;i++){

           if(a[i] == number){

             System.out.print("found the number:"+a[i]);

           }

       }

       return -1;

   }

}
