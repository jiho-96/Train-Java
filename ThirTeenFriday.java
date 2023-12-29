import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ThirTeenFriday {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        int currentyear = cal.get(Calendar.YEAR); // 현재 연도
        int count = 0;
        for (int year = 2000; year <= currentyear; year++) { // 2000년 부터 현재까지
            for (int month = 0; month < 12; month++) {
                cal.set(year, month, 13); // 연도와 달 변경
                if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) { // 금요일
                    System.out.println((++count) + "\t" + sdf.format(cal.getTime()));
                }
            }
        }
    }
}
