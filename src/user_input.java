import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("enter the Second Number: ");
        int b = sc.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

    }
}
