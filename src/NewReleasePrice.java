/**
 *  新影片价格类
 */
public class NewReleasePrice extends Price{
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
	
	/**  计算影片租赁金额  */
	double getCharge(int daysRented) {
		double result = daysRented * 3;
		return result;
	}
}
