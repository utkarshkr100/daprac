package sagePack;

public class singleLinkedList {
    public node head;
    public singleLinkedList(){
        this.head = null;
    }
    public singleLinkedList(int[] a){
        if(a.length == 0)
            this.head = null;
        else{
            head = new node(a[0]);
            node ptr = head;
            for(int i = 1;i<a.length;i++){
                ptr.next = new node(a[i]);
                ptr = ptr.next;
            }
        }
    }
    public void display(){
        if(this.head == null){
            System.out.println("List is empty");
            return;
        }
        node ptr = head;
        while(ptr.next!=null){
            System.out.print(ptr.val+"->");
            ptr = ptr.next;
        }
        System.out.println(ptr.val);
    }
}
