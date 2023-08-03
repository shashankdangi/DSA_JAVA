package Lecture21;

import java.util.Stack;

public class Stack_Insert {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(8);
        st.push(81);
        st.push(8);
        st.push(-8);
        st.push(78);
        System.out.println(st);
        Insert(st, 11);
        System.out.println(st);
    }

    static void Insert(Stack<Integer> st, int item) {
        if (st.isEmpty()) {
            st.push(item);
            return;
        }
        int num = st.pop();
        Insert(st, item);
        st.push(num);

    }
}
