/**
 *  ӰƬ�۸���
 */
abstract class Price {
	/**  ���󷽷�����ȡӰƬ�ļ۸����  */
	abstract int getPriceCode();
	
	/**  ��������ӰƬ�ķ���  */
	abstract double getCharge(int daysRented);
	
	/**  ��ȡ���͵����޻���  */
	int getFrequentRenterPoints(int daysRented) {
		return 1;
	}
}
