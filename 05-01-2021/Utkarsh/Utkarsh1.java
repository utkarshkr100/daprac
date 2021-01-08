package jan_05_2021.Utkarsh;

import java.util.LinkedList;
import java.util.List;
class stack{
    List<Integer> list = new LinkedList();
    int pop(){
        return list.remove(list.size()-1);
    }
    void push(int a){
        list.add(a);
    }
    boolean isEmpty(){
        if(list.size()==0)
            return true;
        return false;
    }    
    void display(){
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("");
    }    
}

public class Utkarsh1{
    public static void main(String[] args) {
        stack st = new stack();
        st.push(10);
        st.push(20);
        st.pop();
        st.push(30);
        st.push(40);
        st.push(50);
        st.pop();
        st.display();
    }
}