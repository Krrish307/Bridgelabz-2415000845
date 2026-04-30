import java.util.*;

public class SortStack {

    static void insert(Stack<Integer> st, int x) {
        if (st.isEmpty() || st.peek() <= x) {
            st.push(x);
            return;
        }
        int temp = st.pop();
        insert(st, x);
        st.push(temp);
    }

    static void sort(Stack<Integer> st) {
        if (!st.isEmpty()) {
            int x = st.pop();
            sort(st);
            insert(st, x);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(3);
        st.push(1);
        st.push(4);
        st.push(2);

        sort(st);

        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }
}