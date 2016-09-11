import java.util.Vector;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

/**
 *  ≤‚ ‘”∞∆¨◊‚¡ﬁπ¶ƒ‹
 */
public class TestRental {

	public static void main(String[] args) {
		// Movies
		Movie movie1 = new Movie("The Little Prince", Movie.CHILDRENS);	
		Movie movie2 = new Movie("Avatar", Movie.NEW_RELEASE);				
		Movie movie3 = new Movie("Bravery Heart", Movie.REGULAR);
		// Rental records
		Rental rental1 = new Rental(movie1, 5);
		Rental rental2 = new Rental(movie2, 1);
		Rental rental3 = new Rental(movie3, 3);
		
		Customer customer = new Customer("John");
		customer.addRental(rental1);
		customer.addRental(rental2);
		customer.addRental(rental3);
		
		String result =  customer.statement();
		
		System.out.println(result);
	}

}
