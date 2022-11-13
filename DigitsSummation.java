
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter number ");
       int n = input.nextInt();
        int digits=0;
        int sum=0;

        while (n!=0) {
            digits=n% 10;
            n/=10;
              sum +=digits;
          }
        System.out.println("sum of digits is "+sum);


    }
    }

