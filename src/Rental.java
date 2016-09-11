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
}
