import java.util.Scanner;
public class Cal{

  public double add(int a,int b){
    return a+b;
  }

  public double subtract(int a,int b){
    return a-b;
  }
  public double multiply(int a,int b){
    return a*b;
  }
  public double divide(int a,int b){
    return a/b;
  }

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("----Calculator----");
     char choice="";
    Cal c=new Cal();
    while(true){
      System.out.println("Select an option ");
      System.out.println("1. +");
      System.out.println("2. -");
      System.out.println("3. *");
      System.out.println("4. /");
      System.out.println("5. "Exit");

       choice=sc.nextLine();

      switch(choice){
        case 1:
          System.out.println("Result of a+b is"+" "+c.add(10,20);
          break;
        case 2:
          System.out.println("Result of a-b is"+" "+c.subtract(20,10);
          break;
        case 3:
          System.out.println("Result of a*b is"+" "+c.multiply(10,20);
          break;
        case 4:
          System.out.println("Result of a/b is"+" "+c.divide(20,10);
          break;

        case 5:
          System.out.println("Exiting");
          break;

        default:
          System.out.println("Invaild choice");
          break;
          
      }
      
  }
}
