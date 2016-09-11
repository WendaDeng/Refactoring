/**  
 *  影片租赁类
 *	 表示某个顾客租了一部影片   
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
	
	/**  计算租赁影片的费用  */
	double getCharge() {
		return _movie.getCharge(_daysRented);
	}
	
	/**  计算常客的租赁积分  */
	int getFrequentRenterPoints() {
		return _movie.getFrequentRenterPoints(_daysRented);
	}
}
