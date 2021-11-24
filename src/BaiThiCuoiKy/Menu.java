package BaiThiCuoiKy;

public class Menu {
    public static void menuMain(){
        System.out.println("            MAIN MENU          ");
        System.out.println("===============================");
        System.out.println("| 1.Chỉnh sửa                 |");
        System.out.println("| 2.Tìm kiếm                  |");
        System.out.println("| 3.Sắp xếp                   |");
        System.out.println("| 4.Tất cả hàng hóa           |");
        System.out.println("| 5.Thống kê                  |");
        System.out.println("| Một số khác bất kì để thoát |");
        System.out.println("===============================");
    }
    public static void menuEdit(){
        System.out.println("            EDIT MENU          ");
        System.out.println("===============================");
        System.out.println("| 1.Thêm                      |");
        System.out.println("| 2.Sửa                       |");
        System.out.println("| 3.Xóa                       |");
        System.out.println("| Một số khác bất kì để thoát |");
        System.out.println("===============================");
    }
    public static void menuSearch(){
        System.out.println("          SEARCH MENU          ");
        System.out.println("===============================");
        System.out.println("| 1.Tìm theo loại             |");
        System.out.println("| 2.Tìm theo giá              |");
        System.out.println("| 3.Tìm theo ngày nhập        |");
        System.out.println("| Một số khác bất kì để thoát |");
        System.out.println("===============================");
    }
    public static void menuSort(){
        System.out.println("Đây là chức năng sắp xếp theo thứ tự hàng hóa là: Thực phẩm - Điện máy - Sành sứ ");
        System.out.println("           SORT MENU           ");
        System.out.println("===============================");
        System.out.println("| 1.Theo giá nhập             |");
        System.out.println("| 2.Theo ngày nhập            |");
        System.out.println("| Một số khác bất kì để thoát |");
        System.out.println("===============================");
    }
    public static void menuHangHoa(){
        System.out.println("Chọn hàng hóa thao tác");
        System.out.println("1. Thực phẩm");
        System.out.println("2. Điện máy");
        System.out.println("3. Sành sứ");
    }
    public static void menuObjectEdit(){
        System.out.println("===================");
        System.out.println("| 1. Sửa tên      |");
        System.out.println("| 2. Sửa giá nhập |");
        System.out.println("| 3. Sửa tồn kho  |");
        System.out.println("| 4. Sửa ngày nhập|");
        System.out.println("===================");
    }
}
