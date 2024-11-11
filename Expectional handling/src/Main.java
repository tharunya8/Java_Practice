import java.util.Scanner;

public class Main {
    public static void main (String [] args)
    {
        Scanner scan = new Scanner(System.in);

        try{
            System.out.println("Enter the number:");
            int a = scan.nextInt();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Program executed successfully..!!");
    }
}