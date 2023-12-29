import java.text.SimpleDateFormat;
import java.util.Calendar;

public class RestDay {
    // 토, 일요일
    public static boolean isRest(Calendar tod){
        boolean isRest = false;
        if (tod.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY || //토요일
        tod.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY){ // 일요일
            isRest = true;
    }
        return isRest;
}
// Calendar 문자열로
public static String toYMD(Calendar dd){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(dd.getTime());
    }
public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int i=1; i<=lastDay; i++){
            cal.set(Calendar.DAY_OF_MONTH, i);// 1 일부터 마지막날 까지
            if(isRest(cal)){
                System.out.println(toYMD(cal)+"is Rest Day");
            }
        }
    }
}

