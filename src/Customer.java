import java.util.Enumeration;
import java.util.Vector;

/** 
 *  顾客类 
 */
public class Customer {
	private String _name;
	private Vector _rentals = new Vector<Rental>();
	
	public Customer (String name) {
		_name = name;
	}
	
	public void addRental(Rental arg) {
		_rentals.add(arg);
	}
	
	public String getName() {
		return _name;
	}
	
	public String statement() {
		Enumeration<Rental> rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";
		while (rentals.hasMoreElements()) {
			Rental each = rentals.nextElement();
			
			// show figures for this rental
			result += "\t" +each.getMovie().getTitle() + "\t" +
					String.valueOf(each.getCharge()) + "\n";
		}
		// add footer lines
		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
		return result;
	}
	
	public String htmlStatement() {
		Enumeration<Rental> rentals = _rentals.elements();
		String result = "<h1>Rental Record for <em>" + getName() + "</em></h1><p>\n";
		while (rentals.hasMoreElements()) {
			Rental each = rentals.nextElement();
			
			// show figures for this rental
			result += each.getMovie().getTitle() + ": " +
					String.valueOf(each.getCharge()) + "<br>\n";
		}
		// add footer lines
		result += "<p>You owe <em>" + String.valueOf(getTotalCharge()) + "</em><p>\n";
		result += "On this rental you earned <em>" + String.valueOf(getTotalFrequentRenterPoints()) + "</em> frequent renter points<p>";
		return result;
	}
	
	/**  获取总的租赁费用  */
	private double getTotalCharge() {
		double result = 0;
		Enumeration<Rental> rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = rentals.nextElement();
			result += each.getCharge();
		}
		return result;
	}
	
	/**  获取总的租赁积分  */
	private int getTotalFrequentRenterPoints() {
		int result = 0;
		Enumeration<Rental> rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {
			Rental each = rentals.nextElement();
			result += each.getFrequentRenterPoints();
		}
		return result;
	}
}
