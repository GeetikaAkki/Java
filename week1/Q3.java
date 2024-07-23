import java.util.Scanner;
public class vendingMachine{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 1 for juice and 2 for soda");
        int num=scanner.nextInt();
        if(num==1){
            System.out.println("Dispencing juice");
        }
        else if(num==2){
            System.out.println("Dispencing Soda");
        }
        else{
            System.out.println("Invalid Choice");
        }
    }
}

