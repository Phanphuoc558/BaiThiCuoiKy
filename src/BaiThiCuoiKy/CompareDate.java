package BaiThiCuoiKy;

import java.util.Date;

public class CompareDate {
    public static int compare(Date day1, Date day2){
        String date1 = FormatDate.dateToString(day1);
        String d1[] = date1.split("/");
        int nam1 = Integer.parseInt(d1[2]);
        int thang1 = Integer.parseInt(d1[1]);
        int ngay1 = Integer.parseInt(d1[0]);
        String date2 = FormatDate.dateToString(day2);
        String d2[] = date2.split("/");
        int nam2 = Integer.parseInt(d2[2]);
        int thang2 = Integer.parseInt(d2[1]);
        int ngay2 = Integer.parseInt(d2[0]);
        if(nam2>nam1 || nam2==nam1 && thang2>thang1|| nam2==nam1 && thang2==thang1 && ngay2>=ngay1)
            return 1;
        return 0;
    }
}
