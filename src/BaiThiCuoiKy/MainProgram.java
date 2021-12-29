package BaiThiCuoiKy;

import java.text.ParseException;

public class MainProgram {
    public static void main(String[] args) throws ParseException {
        int chose,choseEdit,choseHang,choseSearch,choseSort;
        Management list = new Management();
        list.add(new Food("Rice Cake", "FD-0", (float)0.5, 250, FormatDate.stringToDate("17/11/2021")));
        list.add(new Ceramic("Chen su", "CR-0", (float) 0.75, 100, FormatDate.stringToDate("1/11/2021")));
        list.add(new Electric("Smart TV LD 32 inch", "EC-1", (float) 300, 19, FormatDate.stringToDate("1/11/2021")));
        list.add(new Electric("Probook 440 G8", "EC-0", (float) 625, 20, FormatDate.stringToDate("1/3/2021")));
        list.add(new Food("Sweet Bread", "FD-2", (float) 0.5, 150, FormatDate.stringToDate("10/11/2021")));
        list.add(new Food("Rice", "FD-1", (float) 1, 50, FormatDate.stringToDate("30/9/2021")));
        list.add(new Food("Peas", "FD-6", (float) 0.45, 50, FormatDate.stringToDate("16/11/2021")));
        list.add(new Ceramic("Dia hinh oval", "CR-2", (float) 1.2, 100, FormatDate.stringToDate("2/11/2021")));
        list.add(new Food("Cream", "FD-3", (float) 0.25, 100, FormatDate.stringToDate("9/11/2021")));
        list.add(new Electric("SamSung GLS J7 PRIME", "EC-3", (float) 350, 10, FormatDate.stringToDate("28/10/2021")));
        list.add(new Ceramic("Dia vuong", "CR-3", (float) 0.75, 100, FormatDate.stringToDate("3/11/2021")));
        list.add(new Food("Potatoes", "FD-4", (float) 0.3, 15, FormatDate.stringToDate("17/11/2021")));
        list.add(new Ceramic("To co vua", "CR-4", (float) 1, 50, FormatDate.stringToDate("4/11/2021")));
        list.add(new Food("Corn", "FD-5", (float) 0.4, 20, FormatDate.stringToDate("10/11/2021")));
        list.add(new Ceramic("Dia tron", "CR-1", (float) 1, 100, FormatDate.stringToDate("1/11/2021")));
        list.add(new Electric("IPHONE 12 PRO", "EC-5", (float) 1150, 8, FormatDate.stringToDate("15/10/2021")));
        list.add(new Ceramic("To co lon", "CR-5", (float) 1.3, 50, FormatDate.stringToDate("1/11/2021")));
        list.add(new Electric("MacBook Pro M1 2021 1TB", "EC-6", (float) 2500, 5, FormatDate.stringToDate("25/11/2021")));
        list.add(new Food("Oshj Snack", "FD-7", (float) 0.25, 200, FormatDate.stringToDate("15/11/2021")));
        list.add(new Electric("MacBook Pro M1 2020", "EC-2", (float) 1674.5, 5, FormatDate.stringToDate("19/11/2020")));
        list.add(new Electric("IPHONE 12", "EC-4", (float) 1000, 13, FormatDate.stringToDate("15/10/2021")));
        do{
            Menu.menuMain();
            System.out.print("Moi ban nhap lua chon: ");
            chose = Integer.parseInt(InputTools.inputString());
            Creen.clear();
            switch(chose){
                case 1:do{
                    Menu.menuEdit();
                    System.out.print("Moi ban nhap lua chon: ");
                    choseEdit = Integer.parseInt(InputTools.inputString());
                    Creen.clear();
                    switch(choseEdit){
                        case 1:{
                            Menu.menuHangHoa();
                            System.out.print("Moi ban nhap lua chon: ");
                            choseHang = Integer.parseInt(InputTools.inputString());
                            Creen.clear();
                            if(choseHang==1){
                                list.add(InputTools.inpFood());
                            }else if(choseHang==2){
                               list.add(InputTools.inpElectric());
                            }else if(choseHang==3){
                               list.add(InputTools.inpCeramic());
                            }else{
                                System.out.println("Ban chon sai! ");
                                Creen.clear();
                            }
                        };break;
                        case 2:list.editHangHoa();break;
                        case 3:list.deleteHangHoa();
                    }
                }while(choseEdit>0 && choseEdit<4);break;
                case 2:do{
                    Menu.menuSearch();
                    System.out.print("Moi ban nhap lua chon: ");
                    choseSearch = Integer.parseInt(InputTools.inputString());
                    Creen.clear();
                    switch(choseSearch){
                        case 1:list.searchType();break;
                        case 2:list.searchPrice();break;
                        case 3:list.searchDate();break;
                    }
                }while(choseSearch>0 && choseSearch<4);break;
                case 3:{
                    Menu.menuSort();
                    System.out.print("Lua chon cua ban: ");
                    choseSort = Integer.parseInt(InputTools.inputString());
                    Creen.clear();
                    switch(choseSort){
                        case 1:list.sortUpPrice();break;
                        case 2:list.sortLatest();break;
                    }
                };break;
                case 4:list.show();break;
                case 5:list.statitic();
            }
        }while(chose>0 && chose<6);
    }
}
