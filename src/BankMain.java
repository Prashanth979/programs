import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String bankName = sc.nextLine();
		double amount = 0;
		int tenure = 0;

		Bank bank;

		if (bankName.equals("sbi")) {
			bank = new SBIBank();
			amount = sc.nextDouble();
			tenure = sc.nextInt();
			bank.getLoanAmount(tenure, amount);
		} else if (bankName.equals("hdfc")) {
			bank = new HDFCBank();
			amount = sc.nextDouble();
			tenure = sc.nextInt();
			bank.getLoanAmount(tenure, amount);
		} else if (bankName.equals("icici")) {
			bank = new IciciBank();
			amount = sc.nextDouble();
			tenure = sc.nextInt();
			bank.getLoanAmount(tenure, amount);
		} else {
			System.out.println("Bank details does not exists");
		}

		sc.close();
	}

}
