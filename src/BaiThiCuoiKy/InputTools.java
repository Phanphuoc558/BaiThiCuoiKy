package BaiThiCuoiKy;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class InputTools {
    static Scanner in = new Scanner(System.in);
    public static Food inpFood()throws ParseException{
        Food food;
        String seri = "FD-"+Food.seriNumber;
        System.out.print("Nhap ten: ");
        String name = inputString();
        System.out.print("Gia nhap (don vi $): ");
        float importPrice = Float.parseFloat(InputTools.inputString());
        System.out.print("So luong ton kho: ");
        int inventoryNumber = Integer.parseInt(InputTools.inputString());
        Date inputDate = inputDate();
        Creen.clearEnter();
        return food = new Food(name, seri, importPrice, inventoryNumber, inputDate);
    }
    public static Ceramic inpCeramic()throws ParseException{
        Ceramic ceramic;
        String seri = "CR-"+Ceramic.seriNumber;
        System.out.print("Nhap ten: ");
        String name = inputString();
        System.out.print("Gia nhap (don vi $): ");
        float importPrice = Float.parseFloat(InputTools.inputString());
        System.out.print("So luong ton kho: ");
        int inventoryNumber = Integer.parseInt(InputTools.inputString());
        Date inputDate = inputDate();
        Creen.clearEnter();
        return ceramic = new Ceramic(name, seri, importPrice, inventoryNumber, inputDate);
    }
    public static Electric inpElectric()throws ParseException{
        Electric electric;
        String seri = "EC-"+Electric.seriNumber;
        System.out.print("Nhap ten: ");
        String name = inputString();
        System.out.print("Gia nhap (don vi $): ");
        float importPrice = Float.parseFloat(InputTools.inputString());
        System.out.print("So luong ton kho: ");
        int inventoryNumber = Integer.parseInt(InputTools.inputString());
        Date inputDate = inputDate();
        Creen.clearEnter();
        return electric = new Electric(name, seri, importPrice, inventoryNumber, inputDate);
    }
    public static String inputString(){
        String s =null;
        s = in.nextLine();
        return s;
    }
    public static Date inputDate()throws ParseException{
        Date d=null;
        String stringDate;
        System.out.print("Nhap vao ngay (dd/mm/yyyy): ");
        stringDate = inputString();
        if(stringDate!= "")
            d = FormatDate.stringToDate(stringDate);
        else return d =null;
        return d;
    }
}
