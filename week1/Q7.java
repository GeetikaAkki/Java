import java.util.Scanner;
public class calc{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 1 for addition and 2 for subtraction");
        int choice=scanner.nextInt();
        System.out.println("Enter 1st num");
        int num1=scanner.nextInt();
        System.out.println("Enter 2nd num");
        int num2=scanner.nextInt();
        if(choice==1){
            System.out.println(num1+num2);
        }
        else if(choice==2){
            System.out.println(num1-num2);
        }
        else{
            System.out.println("Invalid operation");
        }
    }
}

