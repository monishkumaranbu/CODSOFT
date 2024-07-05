package CODSOFT;

import java.util.*;
import java.util.Random;
class NumberGame{
 
 
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int score=0;
      int totchances=5;
      System.out.println("Guess the correct number by " +totchances+ " chances");
      boolean continueplaying=true;
     while(continueplaying){
        Random rand= new Random();
        int randomnum=rand.nextInt(100)+1;
        boolean guessnum=false;
        for(int i=0;i<totchances;i++){
          System.out.println("Enter your "+(i+1)+ " chance guess num:");
          int usernum=sc.nextInt();
          if(usernum==randomnum){
            guessnum=true;
            score++;
            System.out.println("Guessed number is correct!, Congrats.");
          }
          else if(usernum>randomnum){
            System.out.println("Guessed number is too high.");
          }
          else{
            System.out.println("Guessed number is too low.");
          }
        }
        if(guessnum==false){
          System.out.println("Given chances are over.");
        }
        System.out.println("Do you want to continue the game(yes/no)");
        sc.nextLine();
        String s=sc.nextLine();
        continueplaying=s.equalsIgnoreCase("yes");
     
    }
     System.out.println("Your score "+score);

    sc.close();
  
}
}