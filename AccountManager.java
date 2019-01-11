package com.sayantandas;

public class AccountManager {

    private String customerName;
    private String customerEmailID;
    private String customerGender;
    private String customerPhoneNumber;
    private double accBalance;

    public AccountManager(String customerName, String customerEmailID, String customerGender, String customerPhoneNumber) {
       this(customerName,customerEmailID,customerGender,customerPhoneNumber,0.0);
    }

    public AccountManager(String customerName, String customerEmailID, String customerGender, String customerPhoneNumber, double accBalance) {

        this.customerName = customerName;
        this.customerEmailID = customerEmailID;
        this.customerGender = customerGender;
        this.customerPhoneNumber = customerPhoneNumber;
        this.accBalance = accBalance;
    }

    public void AccountDetails(){
        System.out.println("\nName - "+this.customerName);
        System.out.println("\nGender - "+this.customerGender);
        System.out.println("\nAccount Number - "+this.customerPhoneNumber);
        System.out.println("\nEmail ID - "+this.customerEmailID);
        System.out.println("\nContact Number - "+this.customerPhoneNumber);
        System.out.println("\nAccount Balance - "+this.accBalance);
    }

    public void deposit(double depositAmount){
        this.accBalance += depositAmount;
        System.out.println("\nDeposit of "+depositAmount+" made to the Account No. - "+this.customerPhoneNumber+"\n New Balance = "+this.accBalance);
        String g = this.customerGender;
        if((g.toLowerCase())=="m"){
            System.out.println("\nGreetings Mr. "+this.customerName+" ( Email ID - " +this.customerEmailID+" )");
         }
        else if((g.toLowerCase())=="f"){
            System.out.println("\nGreetings Mrs. "+this.customerName+" ( Email ID - " +this.customerEmailID+" )");
        }
        else{
            System.out.println("\nGreetings "+this.customerName+" ( Email ID - " +this.customerEmailID+" )");
        }

    }

    public void withdrawal(double withdrawalAmount){
        if(this.accBalance-withdrawalAmount < 0){
            System.out.println("\nOnly "+this.accBalance+" funds available. \nWithdrawal not Processed");

            String g = this.customerGender;
            if((g.toLowerCase())=="m"){
                System.out.println("\nGreetings Mr. "+this.customerName+" ( Email ID - " +this.customerEmailID+" )");
            }
            else if((g.toLowerCase())=="f"){
                System.out.println("\nGreetings Mrs. "+this.customerName+" ( Email ID - " +this.customerEmailID+" )");
            }
            else{
                System.out.println("\nGreetings "+this.customerName+" ( Email ID - " +this.customerEmailID+" )");
            }
        }
        else{
            this.accBalance -= withdrawalAmount;
            System.out.println("\nWithdrawal of "+withdrawalAmount+" processed. Remaining Balance = "+this.accBalance);

            String g = this.customerGender;
            if((g.toLowerCase())=="m"){
                System.out.println("\nGreetings Mr. "+this.customerName+" ( Email ID - " +this.customerEmailID+" )");
            }
            else if((g.toLowerCase())=="f"){
                System.out.println("\nGreetings Mrs. "+this.customerName+" ( Email ID - " +this.customerEmailID+" )");
            }
            else{
                System.out.println("\nGreetings "+this.customerName+" ( Email ID - " +this.customerEmailID+" )");
            }
        }
    }
}