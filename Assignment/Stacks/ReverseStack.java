import java.util.*;

public class ReverseStack {
    static void insertBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }
        int temp = st.pop();
        insertBottom(st, x);
        st.push(temp);
    }

    static void reverse(Stack<Integer> st) {
        if (!st.isEmpty()) {
            int x = st.pop();
            reverse(st);
            insertBottom(st, x);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);

        reverse(st);

        while (!st.isEmpty())
            System.out.print(st.pop() + " ");
    }
}