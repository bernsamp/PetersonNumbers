import java.util.*;

// A number is said to be Peterson if the sum of factorials of each digit is equal to the sum of the number itself.

public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter lower limit: ");
        int lowerLimit = sc.nextInt();

        System.out.println("Enter upper limit: ");
        int a=sc.nextInt();

        for(int i=lowerLimit ; i<=a ; i++){

            int x = i;
            int sum = 0;

            while(x>0){
                int r = x%10;
                int fact = 1;
                for(int j=1 ; j<=r ; j++){
                    fact *= j;
                }
                sum += fact;
                x /= 10;
            }
            if(sum == i){
                System.out.print(i + "  ");
            }
        }
    }
}