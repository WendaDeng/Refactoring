/**
 *  普通影片价格类
 */
public class RegularPrice extends Price{
	/**  获取影片的价格代码  */
	int getPriceCode() {
		return Movie.REGULAR;
	}
	
	/**  计算影片租赁金额  */
	double getCharge(int daysRented) {
		double result = 2;
		if (daysRented > 2) 
			result += (daysRented -2) * 1.5;
		return result;
	}
}
