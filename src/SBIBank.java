public class SBIBank implements Bank {

	float interestRate = 10.8f;

	@Override
	public void getLoanAmount(int tenure, double amount) {

		double interestAmount = (amount * tenure * interestRate) / 100;

		double loanAmount = amount + interestAmount;
		
		double emi = loanAmount/tenure;

		System.out.println("Loan Amount in SBI Bank: " + loanAmount + " Monthly EMI: " +emi);
	}

}
