package BaiThiCuoiKy;

import java.util.Date;

public abstract class HangHoa {
    private String name;
    private String id;
    private float importPrice;
    private int inventoryNumber;
    private Date inputDate;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public float getImportPrice() {
        return importPrice;
    }
    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }
    public int getInventoryNumber() {
        return inventoryNumber;
    }
    public void setInventoryNumber(int inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }
    public Date getInputDate() {
        return inputDate;
    }
    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }
    public HangHoa(String name, String id, float importPrice, int inventoryNumber, Date inputDate) {
        this.name = name;
        this.id = id;
        this.importPrice = importPrice;
        this.inventoryNumber = inventoryNumber;
        this.inputDate = inputDate;
    }
    public void print(){
        System.out.printf("|%18s|%16s|%14.2f $|%13d|%11s|\n",this.getName(),this.getId(),this.getImportPrice(),this.getInventoryNumber(),FormatDate.dateToString(this.getInputDate()));
    }
}
