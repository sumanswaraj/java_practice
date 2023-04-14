import java.util.Scanner;
public class odd_number {
    public static void main(String []args){
        System.out.println("Enter a number to print first n  odd number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Odd numbers are: " +(2*i+1));
        }

    }
}
