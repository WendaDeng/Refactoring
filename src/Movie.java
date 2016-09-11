/**  
 *  影片类  
 */
public class Movie {
	// 影片类型
	public static final int CHILDRENS = 2;
	public static final int NEW_RELEASE = 1;
	public static final int REGULAR = 0;
	
	private String  _title;
	private Price _price;
	
	public Movie (String title, int priceCode) {
		_title = title;
		setPriceCode(priceCode);
	}
	
	public String getTitle() {
		return _title;
	}
	
	public int getPriceCode() {
		return _price.getPriceCode();
	}
	
	public void setPriceCode(int arg) {
		switch (arg) {
		case REGULAR:
			_price = new RegularPrice();
			break;
		case CHILDRENS:
			_price = new ChildrensPrice();
			break;
		case NEW_RELEASE:
			_price = new NewReleasePrice();
			break;
		default:
			throw new IllegalArgumentException("Incorrect Price Code");
		}
	}
	
	/**  计算租赁影片的费用  */
	double getCharge(int daysRented) {
		return _price.getCharge(daysRented);
	}
	
	/**  计算常客的租赁积分  */
	int getFrequentRenterPoints(int daysRented) {
		// add bouns for a two day new release rental
		if ((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1)
			return 2;
		else 
			return 1;
	}
}
