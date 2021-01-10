import sagePack.node;

public class meetingNode {
    static node getMeetingPoint(node a, node b){
        int a_size = 0;
        int b_size = 0;
        node ptr = a;
        while(ptr!=null){
            a_size++;
            ptr = ptr.next;
        }

        ptr = b;
        while(ptr!=null){
            b_size++;
            ptr = ptr.next;
        }

        while(a_size > b_size){
            a=a.next;
            a_size--;
        }

        while(a_size<b_size){
            b = b.next;
            b_size--;
        }

        ptr = a;
        
        while(a!=null){
            if(a==b)
                return a;
            a=a.next;
            b=b.next;
        }
        return null;

    }
    public static void main(String[] args) {
        
    }
}
