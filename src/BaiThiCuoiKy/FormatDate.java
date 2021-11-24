package BaiThiCuoiKy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDate {

    public static Date stringToDate(String stringDate) throws ParseException{
        Date date;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        date = simpleDateFormat.parse(stringDate);
        return date;
    }
    public static String dateToString(Date date){
        String stringDay = null;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        stringDay = simpleDateFormat.format(date);
        return stringDay;
    }

}
