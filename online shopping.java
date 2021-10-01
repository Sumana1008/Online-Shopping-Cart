import java.util.Scanner;
public class Main
{
 public static void main(String[] args)
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Welcome to online shopping website");
 System.out.println("Please do purchase from our site");
 System.out.println("Do you have a Account (Answere '1' for yes and '2' for no)");
 int a=sc.nextInt();
 if (a==1)
 {
 System.out.println("Enter your Email");
 char b = sc.next().charAt(0);
 System.out.println("Enter your Password");
 char c= sc.next().charAt(0);
 System.out.println("Welcome to online shopping website");
 }
 if (a==2)
 {
 System.out.println("Enter your name");
 char d = sc.next().charAt(0);
 System.out.println("Enter your phone number");
 char e = sc.next().charAt(0);
 
 char f = sc.next().charAt(0);
 System.out.println("Enter your Password");
 char g = sc.next().charAt(0);
 System.out.println("You are sucessfully Registered");
 }
 else
 {
 System.out.println("Invalid Input");
 }
 System.out.println("Enter the product you would like to buy"); 
 char i = sc.next().charAt(0);
 System.out.println("Enter the brand of the product");
 char j = sc.next().charAt(0);
 System.out.println("Enter the cost of the product");
 int k = sc.nextInt();
 int l = 0;
 System.out.println("Do you want to buy another product (1 for yes && 2 for no)");
 int m = sc.nextInt();
 if (m==1)
 {
 System.out.println("Enter the product you would like to to buy"); 
 char n = sc.next().charAt(0);
 System.out.println("Enter the brand of the product");
 char o = sc.next().charAt(0);
 System.out.println("Enter the cost of the product");
 int p = sc.nextInt();
 l=k+p;
 }
 if (m==2)
 {
 l=k;
 System.out.println("The amount to be paid is"+l);
 } 
 
 
 System.out.println("The amount to be paid is"+l);
 System.out.println("To confirm the order press 1 else press 2");
 int q = sc.nextInt();
 if (q==1)
 {
 System.out.println("Enter the Country it is to be Shipped");
 char cntry = sc.next().charAt(0);
 System.out.println("Enter the City it is to be Shipped");
 char city = sc.next().charAt(0);
 System.out.println("Enter the Street");
 char street = sc.next().charAt(0);
 System.out.println("Enter the house number");
 char number = sc.next().charAt(0);
 System.out.println("Enter your contact Number");
 int num = sc.nextInt();
 System.out.println("Your order details will be sent to your phone");
 System.out.println("Thanks for Shopping");
 System.out.println("Hope to see you again soon");
 }
 if (q==2)
 {
 System.out.println("Thanks for visiting our Site");
 System.out.println("Have a Nice Day");
 }
 
 }
}
