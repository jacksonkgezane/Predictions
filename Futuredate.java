import java.util.Scanner;

public class Futuredate{



     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int Num = sc.nextInt();

        Num = Num % 7;

    
        if(Num==0){
            System.out.println("The day is Thursday");
        } else if(Num==1){
            System.out.println("The day is Friday");
        } else if(Num==2){
            System.out.println("The day is Saturday");
        } else if(Num==3){
            System.out.println("The day is Sunday");
        } else if(Num==4){
            System.out.println("The day is Monday");
        } else if(Num==5){
            System.out.println("The day is Tuesday");
        } else if(Num==6){
            System.out.println("The day is Wednesday");
        }






        
    }
}