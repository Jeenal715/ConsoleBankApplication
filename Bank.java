import java.util.*;
public class Bank{
	public static void main(String[] args) {
	int ch=0;
	Scanner sc=new Scanner(System.in);
	double[] accBal=new double[250];
	String[] accNam=new String[250];
	int size=0;

	while(ch!=-1) {
		System.out.println("Bank Admin Menu");
		System.out.println("Please enter option");
		System.out.println("1.Add Customer to bank");
		System.out.println("2.Change Customer Name");
		System.out.println("3.Check account Balance");
		System.out.println("4.Modify account Balance");
		System.out.println("5.Summary of all accounts");
		System.out.println("(-1).Quit");
		int in=sc.nextInt();
		if(in==1) {
			System.out.println("Bank Add Customer Menu");
			System.out.println("Enter account holder name");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.println("Please enter account balance");
			double bal=sc.nextInt();
			accBal[size]=bal;
			accNam[size]=name;
			System.out.println("Customer id is "+size);
			size+=1;
		}
		else if(in==2) {
			System.out.println("Bank Change Name Menu");
			System.out.println("Enter customer id to change name");
			int i=sc.nextInt();
			System.out.println("Enter new name");
			sc.nextLine();
			accNam[i]=sc.nextLine();
		}
		else if(in==3) {
			System.out.println("Bank Check Balance Menu");
			System.out.println("Enter customer id to check balance");
			int i=sc.nextInt();
			System.out.println("This customer has $"+accBal[i]);
		}
		else if(in==4) {
			System.out.println("Bank Modify Balance Menu");
			System.out.println("Enter customer id to modify balance");
			int i=sc.nextInt();
            System.out.println("Enter new balance");
            accBal[i]=sc.nextInt();
		}
		else if(in==5) {
			 System.out.println("Bank All Customer Summary Menu");
			 double total=0;
			 for(int i=0;i<size;i++) {
				 total+=accBal[i];
				 System.out.println(accNam[i]+" has $"+accBal[i]);
			 }
			 System.out.println("Total $"+total);
		}
		else if(in==-1) {
			System.exit(0);
		}
	else{
		System.out.println("Invalid Choice");
	}
	}
	sc.close();
}
}


