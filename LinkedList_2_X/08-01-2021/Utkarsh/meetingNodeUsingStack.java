import sagePack.node;
import java.util.HashSet;

public class meetingNodeUsingStack {
    public static node getIntersectionNode(node headA, node headB) {
        HashSet<node> set = new HashSet<node>();
        while(headA!=null){
            set.add(headA);
            headA = headA.next;
        }
        while(headB!=null){
            if(set.contains(headB))
                return headB;
            headB = headB.next;
        }       
        return null;
    }
    public static void main(String[] args) {
        
    }
}
