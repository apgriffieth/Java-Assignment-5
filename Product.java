// Assignment #: 5
//         Name: Alan Griffieth
//    StudentID: 1212575453
//      Lecture: MWF 9:40 - 10:30
//  Description: Parent class Product collects shared data/methods of child classes

import java.text.DecimalFormat;

public abstract class Product {
	protected String productID;
	protected int quantity;
	protected double unitPrice;
	protected double totalCost = 0.0;
	
	public Product(String ID, int newQuantity, double price) {
		this.productID = ID;
		this.quantity = newQuantity;
		this.unitPrice = price;
	}
	
	public String getProductID() {
		return this.productID;
	}
	
	public abstract void computeTotalCost();
	
	public String toString() {
		DecimalFormat fmt1 = new DecimalFormat("$0.00");
		String result = "";
		result = "Product ID:\t\t" + this.productID + "\n"
				+ "Quantity:\t\t" + this.quantity + "\n"
				+ "Unit Price:\t\t" + fmt1.format(this.unitPrice) + "\n"
				+ "Total Cost:\t\t" + fmt1.format(this.totalCost);
		
		return result;
	}

}
