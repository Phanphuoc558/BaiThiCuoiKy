package BaiThiCuoiKy;

import java.text.ParseException;
import java.util.Date;

public class Management {
    private Node head = null;
    private Node tail = null;
    float totalPrice;
    
    public Management() {

    }
    private boolean isEmpty(){
        boolean empty = true;
        if(head==null) {
            empty = true;
        } else 
            empty = false;
        return empty;
    }
    public void add(HangHoa hangHoa){
        Node newNode = new Node(hangHoa);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            newNode.pre = tail;
            tail = newNode;
        }
    }
    public void show(){
        if(head==null){
            System.out.println("Danh sách trong! ");
        } else {
            System.out.println("================================================================================");
            System.out.println("|        Ten hang        |  Ma hang   |   Gia nhap   |   Ton kho   | Ngay nhap |");
            System.out.println("|========================|============|==============|=============|===========|");
            Node temp = head;
            while(temp!=null){
                temp.data.print();
                temp = temp.next;
            }
            System.out.println("================================================================================");
            Creen.clearEnter();
        }
    }
    public void editHangHoa()throws ParseException{
        Node temp = head;
        boolean result = false;
        System.out.print("Moi ban nhap vao id hang hoa can sua: ");
        String value = InputTools.inputString();
        Creen.clear();
        while(temp!=null){
            if(temp.data.getId().equalsIgnoreCase(value)){
                result = true;
                Menu.menuObjectEdit();
                System.out.print("Lua chon cua ban: ");
                int choseEdit = Integer.parseInt(InputTools.inputString());
                Creen.clear();
                if(choseEdit==1){
                    SetTing.settingName(temp.data);
                }
                else if(choseEdit==2)
                    SetTing.settingImportPrice(temp.data);
                else if(choseEdit==3)
                    SetTing.settingInventoryNumber(temp.data);
                else if(choseEdit==4)
                    SetTing.settingDate(temp.data);
                else System.out.println("Ban chon sai!");
                break;
            }
            temp = temp.next;
        }
        if(result==false){
            System.out.println("Khong tim thay id ban nhap! <3");
            Creen.clearEnter();
        }
    }
    public void deleteHangHoa(){
        boolean result = false;
        System.out.print("Moi ban nhap vao id hang hoa can xoa: ");
        String value = InputTools.inputString();
        Creen.clear();
        Node i = head;
        if(head!=null){
            do{
                if(i.data.getId().equalsIgnoreCase(value)){
                    result = true;
                    break;
                }
                i = i.next;
            }while(i!=null || result==true);
            if(result==true){
                if(i==head){
                    head = i.next;
                }else{
                    i.pre.next = i.next;
                }
                String txt[] = value.split(" ");
                    if(txt[0].equalsIgnoreCase("FD"))
                        Food.count--;
                    else if(txt[0].equalsIgnoreCase("CR"))
                        Ceramic.count--;
                    else if(txt[0].equalsIgnoreCase("EC"))
                        Electric.count--;
            }else {
                System.out.println("Khong tim thay id đe xoa");
                Creen.clearEnter();
            }
        }else{
            System.out.println("Danh sach hang hoa dang trong!");
            Creen.clearEnter();
        }
    }
    public void searchType(){
        Menu.menuHangHoa();
        int type = Integer.parseInt(InputTools.inputString());
        System.out.println("Ket qua cua ban: ");
        System.out.println("================================================================================");
        System.out.println("|        Ten hang        |  Ma hang   |   Gia nhap   |   Ton kho   | Ngay nhap |");
        System.out.println("|========================|============|==============|=============|===========|");
        Node temp = head;
        if(type>0 && type <4){
            while(temp!=null){
                if(type==1){
                    if(temp.data instanceof Food)
                        temp.data.print();
                } else if(type==2){
                    if(temp.data instanceof Electric)
                        temp.data.print();
                } else if(type==3){
                    if(temp.data instanceof Ceramic)
                        temp.data.print();
                }
                temp = temp.next;
            }
        }
        System.out.println("================================================================================");
        Creen.clearEnter();
    }
    public void searchPrice(){
        System.out.println("Moi ban nhap khoang gia tim kiem!");
        System.out.print("Tu: ");
        float under = Float.parseFloat(InputTools.inputString());
        System.out.print("Den: ");
        float hight = Float.parseFloat(InputTools.inputString());
        System.out.println("Ket qua cua ban: ");
        System.out.println("================================================================================");
        System.out.println("|        Ten hang        |  Ma hang   |   Gia nhap   |   Ton kho   | Ngay nhap |");
        System.out.println("|========================|============|==============|=============|===========|");
        Node temp = head;
        while(temp!=null){
            if(temp.data.getImportPrice() >= under && temp.data.getImportPrice() <= hight){
                temp.data.print();
            }
            temp = temp.next;
        }
        System.out.println("================================================================================");
        Creen.clearEnter();
    }
    public void searchDate() throws ParseException{
        System.out.println("Moi ban nhap khoang thoi gian can tim! ");
        System.out.print("Tu ngay (dd/mm/yyyy): ");
        Date fromDate = FormatDate.stringToDate(InputTools.inputString());
        System.out.print("Den ngay (dd/mm/yyyy): ");
        Date toDate = FormatDate.stringToDate(InputTools.inputString());
        Creen.clear();
        System.out.println("Ket qua cua ban: ");
        System.out.println("================================================================================");
        System.out.println("|        Ten hang        |  Ma hang   |   Gia nhap   |   Ton kho   | Ngay nhap |");
        System.out.println("|========================|============|==============|=============|===========|");
        Node temp = head;
        while(temp!=null){
            if(CompareDate.compare(fromDate, temp.data.getInputDate())==1 && CompareDate.compare(temp.data.getInputDate(), toDate)==1){
                temp.data.print();
            }
            temp = temp.next;
        }
        System.out.println("================================================================================");
        Creen.clearEnter();
    }
    public void statitic(){
        System.out.println("==============================================");
        System.out.println("|Tong so luong hang hoa: "+(Food.count+Electric.count+Ceramic.count));
        System.out.println("|So hang hoa loai thuc pham: "+Food.count);
        System.out.println("|So hang hoa loai dien may: "+Electric.count);
        System.out.println("|So hang hoa loai sanh su: "+Ceramic.count);
        Node temp = head;
        while(temp!=null){
            totalPrice = totalPrice + temp.data.getImportPrice()*temp.data.getInventoryNumber();
            temp = temp.next;
        }
        System.out.println("|Tong gia tri nhap kho: "+(Float)totalPrice+" $");
        System.out.println("==============================================");
        Creen.clearEnter();
    }
    public void sortUpPrice(){
        for(Node i=head;i!=null;i=i.next){
            for(Node j=i;j!=null;j=j.next){
                if(j.data.getImportPrice()<i.data.getImportPrice()){
                    HangHoa temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
        System.out.println("Ket qua cua ban: Hang hoa duoc sap xep theo thu tu :Thuc pham - Dien may - Do su");
        System.out.println("================================================================================");
        System.out.println("|        Ten hang        |  Ma hang   |   Gia nhap   |   Ton kho   | Ngay nhap |");
        System.out.println("|========================|============|==============|=============|===========|");
        for(Node i=head;i!=null;i=i.next){
            if(i.data instanceof Food)
                i.data.print();
        }
        for(Node i=head;i!=null;i=i.next){
            if(i.data instanceof Electric)
                i.data.print();
        }
        for(Node i=head;i!=null;i=i.next){
            if(i.data instanceof Ceramic)
                i.data.print();
        }
        System.out.println("================================================================================");
        Creen.clearEnter();
    }
    public void sortLatest(){
        for(Node i=head;i!=null;i=i.next){
            for(Node j=i;j!=null;j=j.next){
                if(CompareDate.compare(i.data.getInputDate(), j.data.getInputDate())==1){
                    HangHoa temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
        System.out.println("Ket qua cua ban: Hang hoa duoc sap xep theo thu tu :Thuc pham - Dien may - Do su");
        System.out.println("================================================================================");
        System.out.println("|        Ten hang        |  Ma hang   |   Gia nhap   |   Ton kho   | Ngay nhap |");
        System.out.println("|========================|============|==============|=============|===========|");
        for(Node i=head;i!=null;i=i.next){
            if(i.data instanceof Food)
                i.data.print();
        }
        for(Node i=head;i!=null;i=i.next){
            if(i.data instanceof Electric)
                i.data.print();
        }
        for(Node i=head;i!=null;i=i.next){
            if(i.data instanceof Ceramic)
                i.data.print();
        }
        System.out.println("================================================================================");
        Creen.clearEnter();
    }
}
