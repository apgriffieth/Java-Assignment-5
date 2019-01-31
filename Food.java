// Assignment #: 5
//         Name: Alan Griffieth
//    StudentID: 1212575453
//      Lecture: MWF 9:40 - 10:30
//  Description: Child class of Product, adds information specific to Food such as name, damageRate, and expirationDate

import java.text.DecimalFormat;

public class Food extends Product{
	private String name;
	private double damageRate;
	private String expirationDate;
	
	public Food(String productID, int quantity, double unitPrice, String name, double damageRate, String expirationDate) {
		super(productID, quantity, unitPrice); //This data is taken by the parent class to create a new Product
		this.name = name;
		this.damageRate = damageRate;
		this.expirationDate = expirationDate;
	}
	
	public void computeTotalCost() {
		this.totalCost = (this.unitPrice * this.quantity) * (1 + this.damageRate);
	}
	
	public String toString() {
		DecimalFormat fmt1 = new DecimalFormat("0.00%");
		String result = "";
		result = "\nFood:\n" + super.toString() + "\n" //uses parent toString() method to keep shared data
				+ "Food Name:\t\t" + this.name + "\n"
				+ "Damage Rate:\t\t" + fmt1.format(this.damageRate) + "\n"
				+ "Expiration date:\t" + this.expirationDate + "\n\n";
		
		return result;
	}
	

}
