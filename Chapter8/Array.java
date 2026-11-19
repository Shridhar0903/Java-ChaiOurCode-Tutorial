import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] marks ={85,45,12,98,65};

        System.out.println(marks);

        marks[1]=100;
        System.out.println(marks[1]);
        
        

        Scanner sc = new Scanner(System.in);
        int[] marks3 = new int[5];

        for (int i = 0 ; i < marks3.length; i++ ){
            System.out.println("Enter the array :");
            marks3[i]=sc.nextInt();
        }

        for (int i = 0; i < marks.length; i++)
        {
            System.out.println(marks3[i]);
        }




    }

    // seccond Method 
    //int[] marks2 = new int[5];





    
}

//Array u help us to store multiple value together reduces 
// the number of variables easily process large amounts of data  iterate usinng loop
// Arrays are mutable - means we ccan change or   modify the element