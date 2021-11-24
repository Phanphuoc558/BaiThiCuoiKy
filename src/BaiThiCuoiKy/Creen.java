package BaiThiCuoiKy;

public class Creen {
    static public void clearEnter(){
        System.out.println("Enter để tiếp tục! <3");
        String x = InputTools.inputString();
        try{
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }catch(Exception E){
            System.out.println(E);
        }
    }
    static public void clear(){
        try{
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }catch(Exception E){
            System.out.println(E);
        }
    }
}
