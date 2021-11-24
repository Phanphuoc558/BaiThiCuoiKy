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
            System.out.println("Danh sách trống! ");
        } else {
            System.out.println("================================================================================");
            System.out.println("|        Tên hàng        |  Mã hàng   |   Giá nhập   |   Tồn kho   | Ngày nhập |");
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
        System.out.print("Mời bạn nhập vào id hàng hóa cần sửa: ");
        String value = InputTools.inputString();
        Creen.clear();
        while(temp!=null){
            if(temp.data.getId().equalsIgnoreCase(value)){
                result = true;
                Menu.menuObjectEdit();
                System.out.print("Lựa chọn của bạn: ");
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
                else System.out.println("Bạn chọn sai!");
            }
            temp = temp.next;
        }
        if(result==false){
            System.out.println("Không tìm thấy id bạn nhập! <3");
            Creen.clearEnter();
        }
    }
    public void deleteHangHoa(){
        boolean result = false;
        System.out.print("Mời bạn nhập vào id hàng hóa cần xóa: ");
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
                System.out.println("Không tìm thấy id để xóa");
                Creen.clearEnter();
            }
        }else{
            System.out.println("Danh sách hàng hóa đang trống!");
            Creen.clearEnter();
        }
    }
    public void searchType(){
        Menu.menuHangHoa();
        int type = Integer.parseInt(InputTools.inputString());
        System.out.println("Kết quả của bạn: ");
        System.out.println("================================================================================");
        System.out.println("|        Tên hàng        |  Mã hàng   |   Giá nhập   |   Tồn kho   | Ngày nhập |");
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
        System.out.println("Mời bạn nhập khoảng giá tìm kiếm!");
        System.out.print("Từ: ");
        float under = Float.parseFloat(InputTools.inputString());
        System.out.print("Đến: ");
        float hight = Float.parseFloat(InputTools.inputString());
        System.out.println("Kết quả của bạn: ");
        System.out.println("================================================================================");
        System.out.println("|        Tên hàng        |  Mã hàng   |   Giá nhập   |   Tồn kho   | Ngày nhập |");
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
        System.out.println("Mời bạn nhập khoảng thời gian cần tìm! ");
        System.out.print("Sau ngày (dd/mm/yyyy): ");
        Date fromDate = FormatDate.stringToDate(InputTools.inputString());
        System.out.print("Đến trước ngày (dd/mm/yyyy): ");
        Date toDate = FormatDate.stringToDate(InputTools.inputString());
        Creen.clear();
        System.out.println("Kết quả của bạn: ");
        System.out.println("================================================================================");
        System.out.println("|        Tên hàng        |  Mã hàng   |   Giá nhập   |   Tồn kho   | Ngày nhập |");
        System.out.println("|========================|============|==============|=============|===========|");
        Node temp = head;
        while(temp!=null){
            if(temp.data.getInputDate().after(fromDate) && temp.data.getInputDate().before(toDate)){
                temp.data.print();
            }
            temp = temp.next;
        }
        System.out.println("================================================================================");
        Creen.clearEnter();
    }
    public void statitic(){
        System.out.println("==============================================");
        System.out.println("|Tổng số lượng hàng hóa: "+(Food.count+Electric.count+Ceramic.count));
        System.out.println("|Số hàng hóa loại thực phẩm: "+Food.count);
        System.out.println("|Số hàng hóa loại điện máy: "+Electric.count);
        System.out.println("|Số hàng hóa loại sành sứ: "+Ceramic.count);
        Node temp = head;
        while(temp!=null){
            totalPrice = totalPrice + temp.data.getImportPrice()*temp.data.getInventoryNumber();
            temp = temp.next;
        }
        System.out.println("|Tổng giá trị nhập kho: "+(Float)totalPrice+" $");
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
        System.out.println("Kết quả của bạn: Hàng hóa được sắp xếp theo thứ tự :Thực phẩm - Điện máy - Đồ sứ");
        System.out.println("================================================================================");
        System.out.println("|        Tên hàng        |  Mã hàng   |   Giá nhập   |   Tồn kho   | Ngày nhập |");
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
                String date1 = FormatDate.dateToString(i.data.getInputDate());
                String d1[] = date1.split("/");
                int nam1 = Integer.parseInt(d1[2]);
                int thang1 = Integer.parseInt(d1[1]);
                int ngay1 = Integer.parseInt(d1[0]);
                String date2 = FormatDate.dateToString(j.data.getInputDate());
                String d2[] = date2.split("/");
                int nam2 = Integer.parseInt(d2[2]);
                int thang2 = Integer.parseInt(d2[1]);
                int ngay2 = Integer.parseInt(d2[0]);
                boolean result = false;
                if(nam2>nam1 || nam2==nam1 && thang2>thang1|| nam2==nam1 && thang2==thang1 && ngay2>ngay1)
                    result = true;
                else result = false;
                if(result==true){
                    HangHoa temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
            }
        }
        System.out.println("Kết quả của bạn: Hàng hóa được sắp xếp theo thứ tự :Thực phẩm - Điện máy - Đồ sứ");
        System.out.println("================================================================================");
        System.out.println("|        Tên hàng        |  Mã hàng   |   Giá nhập   |   Tồn kho   | Ngày nhập |");
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
