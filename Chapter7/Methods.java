public class Methods {

    static  void Welcome(){

        System.out.println("Hello world");
    }

    public static int multiplybyfive(int number){
        return  number * 5;

    }

    public static void main(String[] args) {
       // Welcome();

       for (int i= 1 ; i < 5 ; i++){
        Welcome();
       }

       int result = multiplybyfive(50);
       System.out.println(result);
      
    }
    
}
