package euni.start.test.from_lecture;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class UtilTest {

	public static void main(String[] args) {
		Date tydate=new Date();
		SimpleDateFormat datefmt =new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss�� EEEE\n");
		System.out.println("���� ��¥�� �ð�\n\n--Date--");
		System.out.println(datefmt.format(tydate));
		
		Calendar rtNow =Calendar.getInstance();
		int year=rtNow.get(Calendar.YEAR);
		int month=rtNow.get(Calendar.MONTH);
		int date=rtNow.get(Calendar.DATE);
		int hour=rtNow.get(Calendar.HOUR);
		int minute=rtNow.get(Calendar.MINUTE);
		System.out.printf("--CalendarŬ����--\n %d��%d��%d�� %d��%d��",year,month,date,hour,minute);

	}

}
