class StackArray {
    int[] arr = new int[5];
    int top = -1;

    void push(int x) {
        if (top == arr.length - 1) {
            System.out.println("Overflow");
            return;
        }
        arr[++top] = x;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Underflow");
            return -1;
        }
        return arr[top--];
    }

    public static void main(String[] args) {
        StackArray st = new StackArray();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.pop());
    }
}