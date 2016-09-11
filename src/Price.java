/**
 *  影片价格类
 */
abstract class Price {
	/**  抽象方法：获取影片的价格代码  */
	abstract int getPriceCode();
	
	/**  计算租赁影片的费用  */
	abstract double getCharge(int daysRented);
	
	/**  获取常客的租赁积分  */
	int getFrequentRenterPoints(int daysRented) {
		return 1;
	}
}
