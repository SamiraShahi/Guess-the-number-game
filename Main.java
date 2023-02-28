import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //computergeneratesrandom guess
        Random random = new Random();
        int guessNumber = random.nextInt(10);
        int computernum =arr[guessNumber];


        //taking input from the user
        System.out.println("Pick a number between 1 to 10,You will have 5 turns");
        //loop to take input for 5 times until anyone of it is correct
        for(int i=1;i<=5;i++){
            //taking input
            Scanner inputObj=new Scanner(System.in);
            int userGuess=inputObj.nextInt();
            if(computernum==userGuess){
                System.out.println("Your guess is correct!The number of times you took to guess my number is:"+i);
                break;
            }
            else if(computernum>userGuess){
                System.out.println(userGuess+" is too low,Please guess a higher number.");
            }
            else if (computernum<userGuess){
                System.out.println( userGuess+" is too high,Please guess a lower number.");

            }
            else{
                System.out.println("invalid input bro");
            }



        }






    }
}