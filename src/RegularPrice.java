/**
 *  ��ͨӰƬ�۸���
 */
public class RegularPrice extends Price{
	/**  ��ȡӰƬ�ļ۸����  */
	int getPriceCode() {
		return Movie.REGULAR;
	}
	
	/**  ����ӰƬ���޽��  */
	double getCharge(int daysRented) {
		double result = 2;
		if (daysRented > 2) 
			result += (daysRented -2) * 1.5;
		return result;
	}
}
