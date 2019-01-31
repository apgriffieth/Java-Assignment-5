// Assignment #: 5
//         Name: Alan Griffieth
//    StudentID: 1212575453
//      Lecture: MWF 9:40 - 10:30
//  Description: Child class of Product, adds information specific to clothing such as size and color

public class Clothing extends Product{
	private String size;
	private String color;
	
	public Clothing(String productID, int quantity, double unitPrice, String size, String color) {
		super(productID, quantity, unitPrice); //This data is taken by the parent class to create a new product
		this.size = size;
		this.color = color;
	}
	
	public void computeTotalCost() {
		this.totalCost = this.quantity * this.unitPrice;
	}
	
	public String toString() {
		String result = "";
		result = "\nClothing:\n" + super.toString() + "\n" //implements parent toString() method to keep shared data
			    + "Size:\t\t\t" + this.size + "\n"
			    + "Color:\t\t\t" + this.color + "\n\n";
		
		return result;	
	}

}
