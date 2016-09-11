/**
 *  影片价格类
 */
abstract class Price {
	/**  抽象方法：获取影片的价格代码  */
	abstract int getPriceCode();
	
	/**  计算租赁影片的费用  */
	double getCharge(int daysRented) {
		double result = 0;
		switch (getPriceCode()) {
			case Movie.REGULAR:
				result += 2;
				if (daysRented > 2) 
					result += (daysRented - 2) * 1.5;
				break;
			case Movie.NEW_RELEASE:
				result += daysRented * 3;
				break;
			case Movie.CHILDRENS:
				result += 1.5;
				if (daysRented > 3) 
					result += (daysRented - 3) * 1.5;
				break;
			default:
				break;
		}
		return result;
	}
}
