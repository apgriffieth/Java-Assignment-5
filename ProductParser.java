// Assignment #: 5
//         Name: Alan Griffieth
//    StudentID: 1212575453
//      Lecture: MWF 9:40 - 10:30
//  Description: Takes a string and turns it into a Food or Clothing Product

public class ProductParser {
	
	public static Product parseStringToProduct(String lineToParse) { 
		String [] clothing = new String[6];
		String [] food = new String [7];
		
		
		if (lineToParse.startsWith("Clothing")) { //Identifies if new object is a Food or Clothing Product
			clothing = lineToParse.split("/");
			return new Clothing(clothing[1], Integer.parseInt(clothing[2]), //uses the Integer and Double classes to get ints and
					Double.parseDouble(clothing[3]), clothing[4], clothing[5]); //doubles from the Strings. Rest are strings

		} //both of these start with 1 to ignore the first keyword in the input of Food or Clothing
		
		else {
			food = lineToParse.split("/");
			return new Food(food[1], Integer.parseInt(food[2]), Double.parseDouble(food[3]), //uses the Integer and Double classes
					food[4], Double.parseDouble(food[5]), food[6]); //to get ints and doubles from the Strings. Rest are strings
		}
	}
			
}
