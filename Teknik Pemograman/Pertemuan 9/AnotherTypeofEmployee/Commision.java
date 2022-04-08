package AnotherTypeofEmployee;

public class Commision extends Hourly {
	private double totalSales;
	private double rateCommision;
	
	public Commision(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double rateCommision) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		this.rateCommision =rateCommision;
	}
	
	public void AddSales(double totalSales) {
		this.totalSales = totalSales;
	}
	
	public double pay()
	{
		double payment = super.pay() + totalSales * rateCommision;
		totalSales = 0;
		return payment;
	}

	@Override
	public String toString() {
		String result = super.toString();
		result += "\nTotal Sales: " + totalSales;
		return result;
	}
	
	
}
