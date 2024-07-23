import java.util.Scanner;
public class Eligibility{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int age = scanner.nextInt();
        if(age>18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }
    }
}
