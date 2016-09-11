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
	
	/**  获取常客的租赁积分，覆盖了抽象父类中的方法  */
	int getFrequentRenterPoints(int daysRented) {
		return (daysRented > 1) ? 2 :1;
	}
}
