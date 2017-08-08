package euni.start.test.from_lecture;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class UtilTest {

	public static void main(String[] args) {
		Date tydate=new Date();
		SimpleDateFormat datefmt =new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초 EEEE\n");
		System.out.println("오늘 날짜와 시간\n\n--Date--");
		System.out.println(datefmt.format(tydate));
		
		Calendar rtNow =Calendar.getInstance();
		int year=rtNow.get(Calendar.YEAR);
		int month=rtNow.get(Calendar.MONTH);
		int date=rtNow.get(Calendar.DATE);
		int hour=rtNow.get(Calendar.HOUR);
		int minute=rtNow.get(Calendar.MINUTE);
		System.out.printf("--Calendar클래스--\n %d년%d월%d일 %d시%d분",year,month,date,hour,minute);

	}

}
