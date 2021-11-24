package BaiThiCuoiKy;

public class Node {
    HangHoa data;
    Node next;
    Node pre;
    public Node(){
        data=null;
        next=null;
    }
    public Node(HangHoa hangHoa){
        data = hangHoa;
        next = null;
    }
    public Node(HangHoa hangHoa,Node node){
        data = hangHoa;
        next = node;
    }
}
