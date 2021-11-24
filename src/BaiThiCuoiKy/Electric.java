package BaiThiCuoiKy;

import java.util.Date;

public class Electric extends HangHoa{

    static int count;
    static int seriNumber;

    public Electric(String name, String id, float importPrice, int inventoryNumber, Date inputDate) {
        super(name, id, importPrice, inventoryNumber, inputDate);
        count++;
        seriNumber++;
    }

    public String getId() {
        return super.getId();
    }

    public float getImportPrice() {
        return super.getImportPrice();
    }

    public Date getInputDate() {
        return super.getInputDate();
    }

    public int getInventoryNumber() {
        return super.getInventoryNumber();
    }

    public String getName() {
        return super.getName();
    }

    public void setImportPrice(float importPrice) {
        super.setImportPrice(importPrice);
    }

    public void setInputDate(Date inputDate) {
        super.setInputDate(inputDate);
    }

    public void setInventoryNumber(int inventoryNumber) {
        super.setInventoryNumber(inventoryNumber);
    }

    public void setName(String name) {
        super.setName(name);
    }
}
