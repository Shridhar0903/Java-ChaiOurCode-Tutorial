import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {
        String name = "Shridhar";
        System.out.println(name);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Text : ");
        sc.nextLine();

        System.out.println(name.length());
         System.out.println(name.charAt(1));
         System.out.println(name.charAt(4));
          System.out.println(name.toUpperCase());
          System.out.println(name.toLowerCase());
          System.out.println(name.contains("h"));
              System.out.println(name.startsWith("Sh"));
                  System.out.println(name.endsWith("Q"));
                      System.out.println(name.replace("Shridhar", "Harsh"));


        
    }
    
}

//string are bascially sequence of character  used to store the text .