import java.util.Scanner;

public class Swap2 {
    public static void main(String args[]) {
        int a, b;
        System.out.println("Enter the First number :: ");
        Scanner sc1 = new Scanner(System.in);
        a = sc1.nextInt();
        System.out.println("Enter the Second number :: ");
        Scanner sc2 = new Scanner(System.in);
        b = sc2.nextInt();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("The numbers after swap are ::\n" + a + " and  " + b);
    }
}
