public class Exercise8{
    public static void main(String[]args){
        for(int i=0; i<=4; i++){
            for(int j=0; j<=4; j++){
                if(i==j||i==4-j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
           System.out.println("");
        }
    }
}

       

   
   
