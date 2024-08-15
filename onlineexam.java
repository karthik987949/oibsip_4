import java.util.*;

class exam{
    Scanner sc=new Scanner(System.in);
    

    public void start(){
        System.out.println("1. Register");
        
        System.out.println("2. Exit");
        int num=sc.nextInt();
        if(num==1){
            password();
        }
        else{
            return;
        }
    }
    public void password(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to online exam");
        System.out.println("Now creat your password for further process");
        System.out.print("Enter password in numbers:");
        int password=sc.nextInt();
        System.out.println("your password is successfully created");
        System.out.print("Enter your password:");
        int check=sc.nextInt();
        if (password==check){
            menu();
        }
        else{
            System.out.println("Enter a valid password");
        }
        
    }
    public void exit(){
       return;
    }
    public void  menu(){
        System.out.println("1.Answer MCQ");
        System.out.println("2.Exit");
        int num=sc.nextInt();
        if (num==1){
                mcq();
        }
        else {
                exit();
        }

    }
    public void mcq(){
        
        int count=0;
        
            System.out.println("What is the largest planet in out solar system?");
            System.out.println("1.Earth");
            System.out.println("2.Mars");
            System.out.println("3.Saturn");
            System.out.println("4.Jupiter");
            int ans1=sc.nextInt();
            if (ans1==4){
                count++;
            }
            else {
                System.out.println("Please enter a value between 1 to 4 only.");
            }
        
       
            System.out.println("What is the chemical symbol of water?");
            System.out.println("1.H2O");
            System.out.println("2.CO2");
            System.out.println("3.NaCl");
            System.out.println("4.O2");
            int ans2=sc.nextInt();
            if (ans2==1){
                count++;
            }
            else {
                System.out.println("Please enter a value between 1 to 4 only.");
            }

        
        
            System.out.println("Which countr hosted the 2016 summer Olympics?");
            System.out.println("1.China");
            System.out.println("2.Brazil");
            System.out.println("3.Greece");
            System.out.println("4.Russia");
            int ans3=sc.nextInt();
            if (ans3==2){
                count++;
            }
            else {
                System.out.println("Please enter a value between 1 to 4 only.");
            }

       
            System.out.println("What is the smallest prime number?");
            System.out.println("1.1");
            System.out.println("2.2");
            System.out.println("3.3");
            System.out.println("4.4");
            int ans4=sc.nextInt();
            if (ans4==2){
                count++;
            }
            else {
                System.out.println("Please enter a value between 1 to 4 only.");
            }
            System.out.println("your score is "+count+" out of 4");
      
        
    }
    
    
}
public class onlineexam{
    public static void main(String [] args){
        exam obj=new exam();
        obj.start();
    
    }
}