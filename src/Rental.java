/**  
 *  ӰƬ������
 *	 ��ʾĳ���˿�����һ��ӰƬ   
 */
public class Rental {
	private Movie _movie;
	private int _daysRented;
	
	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}
	
	public Movie getMovie() {
		return _movie;
	}
	
	public int getDaysRented() {
		return _daysRented;
	}
	
	/**  ��������ӰƬ�ķ���  */
	double getCharge() {
		double result = 0;
		switch (getMovie().getPriceCode()) {
			case Movie.REGULAR:
				result += 2;
				if (getDaysRented() > 2) 
					result += (getDaysRented() - 2) * 1.5;
				break;
			case Movie.NEW_RELEASE:
				result += getDaysRented() * 3;
				break;
			case Movie.CHILDRENS:
				result += 1.5;
				if (getDaysRented() > 3) 
					result += (getDaysRented() - 3) * 1.5;
				break;
			default:
				break;
		}
		return result;
	}
	
	/**  ���㳣�͵����޻���  */
	int getFrequentRenterPoints() {
		// add bouns for a two day new release rental
		if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && 
				getDaysRented() > 1)
			return 2;
		else 
			return 1;
	}
}
