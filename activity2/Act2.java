package activity2;
/** 9/23/23
*  DATASTRUC21 - ACTIVITY2: Basic Operations
*  YPIL, Cyril John T.
*  BSIT-2A
*/
import java.util.Scanner;

public class Act2{
   static Scanner sc = new Scanner(System.in);
   static int num1,num2,choice;
   
   // Constructor to initialize num1 and num2
   Act2(int num1, int num2){
      this.num1 = num1;
      this.num2 = num2;  
   }
   // Get Integer 1 value
   public static int getNum1(){
      return num1;
   }
   // Get Integer 2 value
   public static int getNum2(){
      return num2;
   }
   public static void main(String[]args){
	   Act2 values;
      do{
        try{ // Trapping for Choose task options, catches values that aren't integer values
         System.out.println("*****PLEASE CHOOSE A TASK*****\n\n1.) Add\n2.) Subtraction\n3.) Multiplication\n4.) Division\n5.) Average\n6.) EXIT\n\n-------------------\n");
         choice = sc.nextInt();
         }catch(Exception e){
            System.out.println("Please enter a valid input");
            sc.nextLine();
         }      
         switch(choice){
            case 1:
            // Try catch for trapping decimals and other invalid inputs
            try{
              System.out.println("_ADDITION_\n");
              System.out.print("Enter integer 1: ");
              num1 = sc.nextInt();
              System.out.print("Enter integer 2: ");
              num2 = sc.nextInt();
              }catch(Exception e){
               System.out.println("Please enter absolute integers.\n");
               sc.nextLine();
               break;
              }
              // Instantiated an object to store the two int values; num1 and num2
              values = new Act2(num1, num2);
              System.out.println("Sum of the two integers: " + add(values.getNum1(), values.getNum2()) + "\n");
              break;
             
             case 2:
              try{
              System.out.println("_SUBTRACTION_\n");
              System.out.print("Enter integer 1: ");
              num1 = sc.nextInt();
              System.out.print("Enter integer 2: ");
              num2 = sc.nextInt();
               }catch(Exception e){
               System.out.println("Please enter absolute integers.\n");
               sc.nextLine();
               break;
              }
              values = new Act2(num1, num2);
              System.out.println("Differnce of the two integers: " + subtract(values.getNum1(), values.getNum2()) + "\n");
              break;
             
             case 3:
              try{
              System.out.println("_MULTIPLICATION_\n");
              System.out.print("Enter integer 1: ");
              num1 = sc.nextInt();
              System.out.print("Enter integer 2: ");
              num2 = sc.nextInt();
              }catch(Exception e){
               System.out.println("Please enter absolute integers.\n");
               sc.nextLine();
                break;
              }

              values = new Act2(num1, num2);
              System.out.println("Product of the two integers: " + multiply(values.getNum1(), values.getNum2())+ "\n");
              break;
             
             case 4:
             try{
              System.out.println("_DIVISION_\n");
              System.out.print("Enter integer 1: ");
              num1 = sc.nextInt();
              System.out.print("Enter integer 2: ");
              num2 = sc.nextInt();
              if(num2==0){
               System.out.println("Divisor cannot be zero!");
               break;
              }
              }catch(Exception e){
               System.out.println("Please enter absolute integers.\n");
               sc.nextLine();
               break;
              }        
              values = new Act2(num1, num2);
              System.out.println("Quotient of the two integers: " +  divide(values.getNum1(),values.getNum2())+ "\n");
              break;
             
            case 5:
              try{
              System.out.println("_AVERAGE_\n");
              System.out.print("Enter integer 1: ");
              num1 = sc.nextInt();
              System.out.print("Enter integer 2: ");
              num2 = sc.nextInt();
              }catch(Exception e){
               System.out.println("Please enter absolute integers.\n");
               sc.nextLine();
               break;
              }
              values = new Act2(num1, num2);
              System.out.printf("Average of the two integers: %.2f" , average(values.getNum1(), values.getNum2()));
              System.out.println();
              break;
             
             case 6:
              System.out.println("Program Stopped!");
              System.exit(0);
              break;
             
              // Traps inputs that exceeds above the given choices
             default:
               System.out.println("Invalid input");
               break;
         
         }          
      }while(choice!=6);
   }  
   
   // Methods for each Operations
   public static int add(int num1, int num2){
      int result = num1 + num2;
      return result;
   }
   public static int subtract(int num1, int num2){
      int result = num1 - num2;
      return result;
   }

   public static int multiply(int num1, int num2){
      int result = num1 * num2;
      return result;
   }

   public static float divide(int num1, int num2){
      float result = (float)num1/ num2;
      return result;    
   }
   public static float average(int num1, int num2){
      float result = (float)(num1+num2)/2;
      return result;
   }
}