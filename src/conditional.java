import java.util.Scanner;
public class conditional {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Your age: ");
        int age = sc.nextInt();
        if (age > 21){
            System.out.println("you can marry");
        }
        else{
            System.out.println("tum abhi bachha ho");
        }

    }
}
