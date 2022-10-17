package ss10_danh_sach_bai_2;

public class MyLinkedList<E> {
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    // Phần tử đầu tiên của danh sách liên kết
    private Node head;
    // Số lượng phần tử trong anh sách
    private int numNodes = 0;

    public MyLinkedList() {
    }

    public void addFirst(E element) {
    // khai báo 1 biến là temp trỏ đến giá trị của head
        Node temp = head;
        //Biến head sẽ nhận giá trị là 1 node mới
        head = new Node(element);
        //head.next trỏ đến temp
        head.next = temp;
        numNodes++;
    }

    public  void  addLast(E element){
        //khai báo biến temp trỏ đến head
        Node temp = head;
        //Sẽ cho con trỏ chạy đến phần tử cuối cùng của danh sách
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    public  void  add(int index, E element){
        // khai báobiên trong temp và trỏ đến head
        Node temp = head;

        //khai báo 1 node là holder
        Node holder;

        //Cho con trỏ chạy đến vị trí index -1;
        for (int i = 0; i < index-1 && temp.next != null ; i++) {
            temp = temp.next;
        }
        //Cho holder tham chiếu đến vị trí index
        holder = temp.next;
        //Node tại vị trí index -1 sẽ trở thành node mới
        temp.next = new Node(element);
        // node  mới sẽ trỏ đến holder
        temp.next.next = holder;
        //tăng số lượng phần tử trong danh sách lên
    }

    public Object get(int index){
        //khai báo biến temp trỏ tới head
        Node temp = head;
        for (int i = 0; i <index ; i++) {
             temp = temp.next;
        }
        return temp.data;
    }
}
