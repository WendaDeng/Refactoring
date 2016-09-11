/**  
 *  影片类  
 */
public class Movie {
	// 影片类型
	public static final int CHILDRENS = 2;
	public static final int NEW_RELEASE = 1;
	public static final int REGULAR = 0;
	
	private String  _title;
	private int _priceCode;
	
	public Movie (String title, int priceCode) {
		_title = title;
		_priceCode = priceCode;
	}
	
	public String getTitle() {
		return _title;
	}
	
	public int getPriceCode() {
		return _priceCode;
	}
	
	public void setPriceCode(int priceCode) {
		_priceCode = priceCode;
	}
}
