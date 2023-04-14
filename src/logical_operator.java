import java.util.Scanner;
public class logical_operator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>20 && a< 40){
            System.out.println("The number is between 20 and 40");
        }
        else if(a>20 || a<50){
            System.out.println("true");
        }
    }
}
