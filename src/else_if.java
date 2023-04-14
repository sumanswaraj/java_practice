import java.util.Scanner;
public class else_if {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int mark = sc.nextInt();
        if((mark > 100) || (mark < 0)){
            System.out.println("invalid input");
        }
        if((100 > mark)&& (mark > 90)){
            System.out.println("you got 'O' grade");
        }
        else if ((90 > mark)&& (mark > 80)){
            System.out.println("you got 'A+' grade");
        }
        else if ((80 > mark)&& (mark > 70)){
            System.out.println("you got 'A' grade");
        }
        else if ((70 > mark)&& (mark > 60)){
            System.out.println("you got 'B+' grade");
        }
        else if((60 > mark)&& (mark > 50)){
            System.out.println("you got 'B' grade");
        }
        else if((50 > mark)&& (mark > 40)){
            System.out.println("you got 'C' grade");
        }
        else{
            System.out.println("opps! you are fail");
        }
    }
}
