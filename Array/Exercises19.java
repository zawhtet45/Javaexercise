public class Exercises19{

    public static void main(String[]args){

       String[]studentList = {"Kalam","Jose","Jani","Ahmed"};

       String name = "Kalam";

       Search(studentList,name);

       System.out.print(Search(studentList,name));

   }

   public static String Search(String[]a,String name){

       for(int i=0;i<a.length;i++){

           if(a[i] == name){

             System.out.print("found the student:"+a[i]);

           }

       }

       return"";

   }

}