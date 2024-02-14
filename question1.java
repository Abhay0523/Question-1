import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt(); //Taking input from user
//        num= Math.abs(num); //coverting negative number into positive
        int count=0;    //variable that count the number of digits
        while(num!=0){  //loop for calculating the number of digit
            count++;
            num=num/10;
        }
        System.out.println(count);

    }
}

