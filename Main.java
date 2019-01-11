package com.sayantandas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
	    int ch;
	    boolean c=true;
	    String name,mail,gender,phone;
	    double bal;

	    System.out.println("\n Welcome...Help me Assist You");
		System.out.println("\n\t1. Press 1 if you want to Open a Account with Zero Balance.");
		System.out.println("\n\t2. Press 2 if You Want to Open a Account and deposit some Amount right away\n");
		System.out.println("\nEnter Your Choice - ");
		ch=sc.nextInt();
		sc.nextLine();

		switch(ch){
			case 1 :
				System.out.println("\nEnter Your Name :");
				name=sc.nextLine();
				System.out.println("\nEnter Your Email ID :");
				mail=sc.nextLine();
				System.out.println("\nEnter Your Gender : (\n **'M' for Male \t'F' for Female \t'T' for Transgender)\n");
				gender=sc.nextLine();
				System.out.println("\nEnter Your Phone Number : (\n **Take good care of this Number as this will be Your Account Number)\n");
				phone=sc.nextLine();

				AccountManager z = new AccountManager(name,mail,gender,phone);

				System.out.println("\nAccount Successfully Created. Here are the Details : - \n");
				z.AccountDetails();

				System.out.println("\nNext What do you Wanna Do : ");
				System.out.println("\n\t1. Press 1 to 'Deposit'");
				System.out.println("\n\t2. Press 2 to 'Withdraw'");
				System.out.print("\n Press any other key to 'Quit'");
				System.out.println("\nEnter Your Choice - ");
				while(c){
					int n = sc.nextInt();
					if(n==1){
						double dep;
						System.out.println("\n Enter Depositing Amount - ");
						dep=sc.nextDouble();
						z.deposit(dep);
						System.out.println("\n If you want to Continue the Deposit/Withdraw Procedure, Please enter the Specified Option Again !! Or else Press Any other Key To Quit");
				}
					else if(n==2){
						double w;
						System.out.println("\n Enter Withdrawing Amount - ");
						w=sc.nextDouble();
						z.withdrawal(w);
						System.out.println("\n If you want to Continue the Deposit/Withdraw Procedure, Please enter the Specified Option Again !! Or else Press Any other Key To Quit");
					}
				else{
					c=false;
					System.out.println("\n Wrong Choice Entered.\n Quitting The Program");
					System.exit(0);
				}
			}
				break;

			case 2 :
				 System.out.println("\nEnter Your Name :");
				 name=sc.nextLine();
				 System.out.println("\nEnter Your Email ID :");
				 mail=sc.nextLine();
				 System.out.println("\nEnter Your Gender : (\n **'M' for Male \t'F' for Female \t'T' for Transgender)\n");
				 gender=sc.nextLine();
				 System.out.println("\nEnter Your Phone Number : (\n **Take good care of this Number as this will be Your Account Number)\n");
				 phone=sc.nextLine();
				 System.out.println("\nEnter The Depositing Amount :");
				 bal=sc.nextDouble();

				 AccountManager nz = new AccountManager(name,mail,gender,phone,bal);

				 System.out.println("\nAccount Successfully Created. Here are the Details : - \n");
				 nz.AccountDetails();

				System.out.println("\nNext What do you Wanna Do : ");
				System.out.println("\n\t1. Press 1 to 'Deposit'");
				System.out.println("\n\t2. Press 2 to 'Withdraw'");
				System.out.print("\n Press any other key to 'Quit'");
				System.out.println("\nEnter Your Choice - ");
				while(c){
					int n = sc.nextInt();
					if(n==1){
						double dep;
						System.out.println("\n Enter Depositing Amount - ");
						dep=sc.nextDouble();
						nz.deposit(dep);
						System.out.println("\n If you want to Continue the Deposit/Withdraw Procedure, Please enter the Specified Option Again !! Or else Press Any other Key To Quit");
					}
					else if(n==2){
						double w;
						System.out.println("\n Enter Withdrawing Amount - ");
						w=sc.nextDouble();
						nz.withdrawal(w);
						System.out.println("\n If you want to Continue the Deposit/Withdraw Procedure, Please enter the Specified Option Again !! Or else Press Any other Key To Quit");
					}
					else{
						c=false;
						System.out.println("\n Wrong Choice Entered.\n Quitting The Program");
						System.exit(0);
					}
				}
				 break;

			 default:
			 	System.out.println("\n Wrong Choice Entered.\n Quitting The Program");
			 	System.exit(0);
		}
	    sc.close();
    }
}
