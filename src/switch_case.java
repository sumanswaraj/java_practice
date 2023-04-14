import java.util.Scanner;
public class switch_case {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1 : for Deposit \n2 : for Withdrawal \n3 : for balance ");
        int main_balance = 21000;
        int Transaction = sc.nextInt();
        switch(Transaction){
            case 1:
                System.out.println("Enter the amount to be deposited: " );
                int deposit_amo = sc.nextInt();
                System.out.println("Deposit successful! \nAvailable balance is :" + (main_balance+ deposit_amo));
                break;
            case 2 :
                System.out.println("Enter the amount to be withdrawn: ");
                int withdrawal_bal = sc.nextInt();
                System.out.println("Withdrawal successful! \nAvailable balance is :" + (main_balance - withdrawal_bal) );
                break;
            case 3:
                System.out.println("Available balance is : "+ main_balance);
                break;

        }
        System.out.println("     Thank you!");

    }
}
