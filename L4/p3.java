import java.util.*;

class BankAcc{
    String name;
    long acc_no;
    String acc_type;
    long amount;
    static double roi = 2;

    BankAcc(){
        Random random = new Random();
        name = "default";
        acc_no = random.nextLong();
        acc_type = "Savings";
        amount = 10000;
    }

    BankAcc(String iname,long iacc_no,String iacc_type,long iamount, double iroi){
        name = iname;
        acc_no = iacc_no;
        acc_type = iacc_type;
        amount = iamount;
        roi = iroi;
    }

    void depositAmount(int money){
        System.out.println("Depositing "+money+" to your bank account");
        amount += money;
        System.out.println("Your current account balance is Rs."+amount);
        System.out.println();
    }

    void withdrawAmount(int money){
        if((amount-money)<1000){
            System.out.println("Cannot withdraw! Sufficient funds not available");
            System.out.println();

        }
        else{
            System.out.println("Withdrawing Rs."+money);
            amount -= money;
            System.out.println("Your current account balance is Rs."+amount);
            System.out.println();
            
        }   
    }

    void display(){
        System.out.println("Name of Account Holder: "+name);
        System.out.println("Account Number: "+acc_no);
        System.out.println("Account Type: "+acc_type);
        System.out.println("Account balance "+amount);
        System.out.println();
    }

    static void dispROI(){
        System.out.println("The current rate of interest is "+roi);
        
    }
}

class p3{
    public static void main(String args[]){
        BankAcc B1 = new BankAcc();
        BankAcc B2 = new BankAcc("John", 50647382034420L, "Savings", 1000L, 2.5);
        B1.display();
        B2.withdrawAmount(100);
        B1.depositAmount(1000);
        B2.display();
        BankAcc.dispROI();

    }
}