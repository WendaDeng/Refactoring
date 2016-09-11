/**
 *  儿童类影片价格类
 */
public class ChildrensPrice extends Price {
	int getPriceCode() {
		return Movie.CHILDRENS;
	}
	
	/**  计算影片租赁金额  */
	double getCharge(int daysRented) {
		double result = 1.5;
		if (daysRented > 3) 
			result += (daysRented -3) * 1.5;
		return result;
	}
}
