import java.util.Scanner;
public class percentage_calculator {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Mark of Math: ");
        float math = sc.nextFloat();
        System.out.println("Enter the Mark of Physics: ");
        float Physics = sc.nextFloat();
        System.out.println("Enter the Mark of Biology: ");
        float Biology = sc.nextFloat();
        System.out.println("Enter the Mark of Chemistry: ");
        float Chemistry = sc.nextFloat();
        System.out.println("Enter the Mark of English: ");
        float English = sc.nextFloat();
        System.out.println("Enter the max marks of a subject");
        int max = sc.nextInt();
        int Max = max*5;
        float totalMarks = math+Physics+Biology+Chemistry+English;
        float percent = (totalMarks/Max)*100;
        System.out.println("total percentage obtained is: " + percent);

    }
}
