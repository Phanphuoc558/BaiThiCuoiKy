package BaiThiCuoiKy;

import java.text.ParseException;

public class SetTing {
    public static void settingName(HangHoa hangHoa){
        System.out.println("Ten ban dau: "+hangHoa.getName());
        System.out.print("Nhap ten moi <3: ");
        hangHoa.setName(InputTools.inputString());
        System.out.println("Name has been change!");
        Creen.clearEnter();
    }
    public static void settingImportPrice(HangHoa hangHoa){
        System.out.println("Gia nhap ban dau: "+hangHoa.getImportPrice());
        System.out.println("Nhap gia moi <3: ");
        hangHoa.setImportPrice(Float.parseFloat(InputTools.inputString()));
        System.out.println("Import Price has been change!");
        Creen.clearEnter();
    }
    public static void settingInventoryNumber(HangHoa hangHoa){
        System.out.println("So luong ton kho hien tai: "+hangHoa.getInventoryNumber());
        System.out.println("Ton kho moi <3: ");
        hangHoa.setInventoryNumber(Integer.parseInt(InputTools.inputString()));
        System.out.println("Inventory Number has been change!");
        Creen.clearEnter();
    }
    public static void settingDate(HangHoa hangHoa) throws ParseException{
        System.out.println("Ngay nhap ban dau: "+FormatDate.dateToString(hangHoa.getInputDate()));
        System.out.print("Nhap vao ngay moi: ");
        hangHoa.setInputDate(InputTools.inputDate());
        System.out.println("Input Date has been change!");
        Creen.clearEnter();
    }
}
