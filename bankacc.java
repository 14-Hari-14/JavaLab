 /*
 Design a class to represent a bank account
Include the following members:

Data members:

    Name of the depositor
    Account number
    Type of account
    Balance amount in the account

Methods:

    To assign initial values
    To Deposit an amonut
    To withdraw an amount after checking balance
    To display the name and balance*/
import java.util.Scanner;
class operationsOnBankAcc
{
	double bal;
	String name, accnum, acctype;
	Scanner sc = new Scanner(System.in);
	void assignValue()
	{
		System.out.print("Name: ");
		name = sc.nextLine();
		System.out.print("Account number: ");
		accnum = sc.nextLine();
		System.out.print("Type of account: ");
		acctype = sc.nextLine();
		System.out.print("Balance amount in account: ");
		bal = sc.nextDouble();
		System.out.println("\nName: "+name+"\nAccount number: "+accnum+"\nAccount type: "+acctype+"\nBalance: "+bal+"\n");
	}
	void depositAmt()
	{
		double depositAmt;
		System.out.println("Balance amount: "+ bal);
		System.out.print("Enter amount to be deposited: ");
		depositAmt = sc.nextDouble();
		bal = bal+depositAmt;
		System.out.println("Balance amount: "+ bal+"\n");
	}
	void withdrawAmt()
	{
		double withdrawAmt;
		System.out.println("Balance amount: "+ bal);
		System.out.print("Enter amount to be withdrawn: ");
		withdrawAmt = sc.nextDouble();
		bal = bal-withdrawAmt;
		System.out.println("Balance amount: "+ bal+"\n");
	}
	void checkBalance()
	{
		System.out.println("\nName: "+name+"\nAccount number: "+accnum+"\nAccount type: "+acctype+"\nBalance: "+bal+"\n");
	}
}
public class bankacc
{
	public static void main(String[] args)
	{
		boolean loop = true;
		int ch;
		Scanner sc = new Scanner(System.in);
		operationsOnBankAcc acc1 = new operationsOnBankAcc();
		while(loop==true)
		{
			System.out.println("Menu Based application for bank account ");
			System.out.print("1. Assign Initial values to bank account\n2. Deposit an amount\n3. Withdraw an ammount after checking the balance\n4. Check Balance\n5. Quit\nWhat do you want to do: ");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1:
					acc1.assignValue();
					break;
				case 2:
					acc1.depositAmt();
					break;
				case 3:
					acc1.withdrawAmt();
					break;
				case 4:
					acc1.checkBalance();
					break;
				case 5:
					System.exit(0);
					break;
			}
		}
	}
}
