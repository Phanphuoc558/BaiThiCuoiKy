package BaiThiCuoiKy;

import java.text.ParseException;

public class SetTing {
    public static void settingName(HangHoa hangHoa){
        System.out.println("Tên ban đầu: "+hangHoa.getName());
        System.out.print("Nhập tên mới <3: ");
        hangHoa.setName(InputTools.inputString());
        System.out.println("Name has been change!");
        Creen.clearEnter();
    }
    public static void settingImportPrice(HangHoa hangHoa){
        System.out.println("Giá nhập ban đầu: "+hangHoa.getImportPrice());
        System.out.println("Nhập giá mới <3: ");
        hangHoa.setImportPrice(Float.parseFloat(InputTools.inputString()));
        System.out.println("Import Price has been change!");
        Creen.clearEnter();
    }
    public static void settingInventoryNumber(HangHoa hangHoa){
        System.out.println("Số lượng tồn kho hiện tại: "+hangHoa.getInventoryNumber());
        System.out.println("Tồn kho mới <3: ");
        hangHoa.setInventoryNumber(Integer.parseInt(InputTools.inputString()));
        System.out.println("Inventory Number has been change!");
        Creen.clearEnter();
    }
    public static void settingDate(HangHoa hangHoa) throws ParseException{
        System.out.println("Ngày nhập ban đầu: "+FormatDate.dateToString(hangHoa.getInputDate()));
        System.out.print("Nhập vào ngày mới: ");
        hangHoa.setInputDate(InputTools.inputDate());
        System.out.println("Input Date has been change!");
        Creen.clearEnter();
    }
}
