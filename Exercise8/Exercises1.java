public  class Exercises1{
    public static void main(String[] args){
        String[]Countries = {"Japan","Canada","Mexico","Bangladish"};
        printArray(Countries);
    }
    public static void printArray(String[]Countries){
        for(String Country : Countries){
            System.out.println(Country);
        }
    }
}