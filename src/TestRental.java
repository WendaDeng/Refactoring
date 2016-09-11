import java.util.Vector;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

/**
 *  ≤‚ ‘”∞∆¨◊‚¡ﬁπ¶ƒ‹
 */
public class TestRental {

	public static void main(String[] args) {
		// Movies
		Movie movie1 = new Movie("The Little Prince", 2);
		Movie movie2 = new Movie("Avatar", 1);
		Movie movie3 = new Movie("Bravery Heart", 0);
		// Rental records
		Rental rental1 = new Rental(movie1, 3);
		Rental rental2 = new Rental(movie2, 3);
		Rental rental3 = new Rental(movie3, 3);
		
		Customer customer = new Customer("John");
		customer.addRental(rental1);
		customer.addRental(rental2);
		customer.addRental(rental3);
		
		String result =  customer.statement();
		
		System.out.println(result);
	}

}
