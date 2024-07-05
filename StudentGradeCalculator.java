package CODSOFT;

import java.util.Scanner;

public class StudentGradeCalculator {
    
     public static double AveragePercentage(int totalmark,int noofsubjects){
    
        return (double)(totalmark/noofsubjects);

        
        

        }
     
     
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int totalmark=0;
        
        System.out.println("Enter number of Subjects:");
        int noofsubjects=sc.nextInt();
        for(int i=0;i<noofsubjects;i++){
            System.out.println("Enter the marks obtained in subject "+(i+1));
            int marks=sc.nextInt();
            totalmark+=marks;
        }
        double percentage=AveragePercentage(totalmark, noofsubjects);  
        char Grade;
        if(percentage>91){
            Grade='O';
        }
        else if(percentage>81){
            Grade='A';
        }
        else if(percentage>71){
            Grade='B';
        }
        else if (percentage>61){
            Grade='C';
        }
        else if(percentage>=51){
            Grade='D';
        }
        else {
            Grade='E';
        }
    
        System.out.println("Total Marks:"+totalmark);
        System.out.println("AveragePercentage:"+percentage);
        System.out.println("Grade:"+Grade);
sc.close();
    }
}
