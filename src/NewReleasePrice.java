/**
 *  ��ӰƬ�۸���
 */
public class NewReleasePrice extends Price{
	int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
	
	/**  ����ӰƬ���޽��  */
	double getCharge(int daysRented) {
		double result = daysRented * 3;
		return result;
	}
	
	/**  ��ȡ���͵����޻��֣������˳������еķ���  */
	int getFrequentRenterPoints(int daysRented) {
		return (daysRented > 1) ? 2 :1;
	}
}
