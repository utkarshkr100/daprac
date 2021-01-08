package sagePack;

public class node {
    public int val;
    public node next;
    public node prev;

    public node(int value){
        this.val = value;
        this.next = null;
        this.prev = null;
    }
    public node(int value, node next){
        this.val = value;
        this.next = next;
        this.prev = null;
    }
    public node(int value, node next, node prev){
        this.val = value;
        this.next = next;
        this.prev = prev;
    }
}

